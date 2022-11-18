package Ch10_Class_constructor;

import java.util.Scanner;

public class Ch10_12Account1 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>>>>>  ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
		// 계좌 생성하기
		private static void createAccount() {
			System.out.println("========");
			System.out.println(" 계좌생성 ");
			System.out.println("========");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.print("계좌주: ");
			String owner = scanner.next();
			System.out.print("초기 입금액: ");
			int balance = scanner.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			for (int i=0; i<accountArray.length; i++) {
				if(accountArray[i] ==null) {
					accountArray[i] = newAccount;
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				}
			}
		}
				
		// 계좌목록
		private static void accountList() {
			System.out.println("========");
			System.out.println(" 계좌목록 ");
			System.out.println("========");
			/* 선생님 방법 */
			for(int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if(account != null) {
					System.out.print(account.getAno());
					System.out.print("   ");
					System.out.print(account.getOwner());
					System.out.print("   ");
					System.out.print(account.getBalance());
					System.out.println();
				}
			}
		}
			/* 내가 풀이한 방법 */
//			for(int i = 0; i < accountArray.length; i++) {
//				if(accountArray[i] != null) {
//					System.out.println(accountArray[i].getAno() + "  " 
//					+ accountArray[i].getOwner() + "  "
//					+ accountArray[i].getBalance());
//				}
//			}
//		}			
		// 예금하기
		private static void deposit() {
			// findAccount() 호출해서 사용
			System.out.println("========");
			System.out.println(" 예금 ");
			System.out.println("========");
			
			System.out.print("계좌번호: ");
			String accountno = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(accountno);
			
			/* 선생님 풀이 방법 */
			if(account == null) {
				System.out.println("계좌가 없습니다.");
				return;	// if문 종료
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
			
			/* 내가 풀이한 방법 */
//			if(account == null) {
//				System.out.println("계좌가 없습니다.");
//			}else {
//				account.addBalance(money);
//				System.out.println("예금이 성공되었습니다.");
//				System.out.println("현재 계좌 잔고 : " + account.getBalance());
//			}
//		}
		
		
		
		// 출금하기
		private static void withdraw() {
			System.out.println("========");
			System.out.println(" 출금 ");
			System.out.println("========");
			// findAccount() 호출해서 사용
			
			System.out.print("계좌번호: ");
			String accountno = scanner.next();
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(accountno);
			if(account == null) {
				System.out.println("계좌가 없습니다.");
				return;
			} 
			/* 선생님이 풀이한 방법 */
			if (account.getBalance() > money) {
				System.out.println("결과 : 잔액보다 출금액이 커서 출금에 실패했습니다.");
				return;
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
			/* 내가 풀이한 방법 */
//			else if( account.getBalance() < money ) {
//				System.out.println("잔액보다 출금액이 커서 출금에 실패했습니다.");
//			}
//			else if(account != null) {
//				account.subBalance(money);
//				System.out.println("출금이 성공되었습니다.");
//			}
//		}
		
		
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			Account account = null;
			for(int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] != null) {
					String dbAno = accountArray[i].getAno();
					if(dbAno.equals(ano)) {
						account = accountArray[i];
					}
					break;
				}
				else { // null 값이 저장된 경우에는 더이상 순회 할 필요가 없음
					break;
				}
			}
			return account;
	}
}

