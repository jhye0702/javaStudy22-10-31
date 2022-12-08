package Ch19_disign_patton_account;

import java.util.ArrayList;
import java.util.Scanner;

//public class AccountManager {
//	
//	private ArrayList<Account> list;
//	private Scanner stdIn;
//	
//	public AccountManager() {
//		list = new ArrayList<Account>();
//		stdIn = new Scanner(System.in);
//	}
//	
//	void makeAccount() { // 계좌 개설
//		Account account = new Account();
//		
//		System.out.print("계좌 번호 : ");
//		account.setId(stdIn.nextInt());
//		
//		System.out.print("이름 : ");
//		account.setName(stdIn.next());
//		
//		System.out.print("입금액 : ");
//		account.setBalance(stdIn.nextLong());
//
//		list.add(account);
//		System.out.println("계좌가 개설되었습니다.");
//		System.out.println(list.toString()+"\t");
//	}
//	
//// =======================================================	
//	
//	void deposit() { // 입금
//		System.out.print("계좌번호 : ");
//		int id = stdIn.nextInt();
//		
//		System.out.print("입금액 : ");
//		long money = stdIn.nextLong();
//		
//		// 해당 계좌 찾기
//		for (Account account : list) { 
//			if (account.getId() == id) { // 동일한 계좌가 있다면
//				account.setBalance(money + account.getBalance());
//				System.out.println("입금 완료 되었습니다.");
//				return;
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다.");
//	}
//
//// =======================================================	
//
//	void withdraw() { // 출금
//		System.out.print("계좌 번호 : ");
//		int id = stdIn.nextInt();
//		
//		System.out.print("출금액 : ");
//		long money = stdIn.nextLong();
//		
//		// 해당 계좌 찾기
//		for (Account account : list) {
//			if (account.getId() == id) { // 동일한 계좌가 있다면
//				if(account.getBalance() < money) {
//					System.out.println("잔액이 부족합니다.");
//				}
//				else {
//					account.setBalance(account.getBalance()-money);
//					System.out.println("출금 완료되었습니다.");
//				}
//				return;
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다.");
//	}
//
//// =======================================================	
//
//	public void inquire() { // 잔액 조회
//		System.out.print("계좌번호 : ");
//		int id = stdIn.nextInt();
//		
//		// 해당 계좌 찾기
//		for (Account account : list) {
//			if(account.getId() == id) {
//				System.out.println("계좌번호\t성명\t잔액");
//				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//				return;
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다.");
//	}
//	
//// =======================================================	
//
//	void display() { // 출력
//		for (Account account : list) {
//			System.out.println("계좌번호\t성명\t금액");
//			System.out.println(account.getId() + "\t" + account.getName() +
//								"\t" + account.getBalance());
//		}
//	}
//}

public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner stdIn;
	private final String ERROR_NOT_FIND_ID = "없는 계좌번호입니다";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호 : ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.print("이름 : ");
		account.setName(stdIn.next());
		
		System.out.print("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
		if (!isAccount(id)) {
			list.add(account);
			
			System.out.println("계좌가 개설되었습니다.");
			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println(id + " 계좌번호는 사용 중 입니다.");
		}

	}
	
	
// =======================================================	
	
	void deposit() { // 입금
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("입금액 : ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		Account account = findAccount(id);
		if (account != null) { 
				account.setBalance(money + account.getBalance());
				System.out.println("입금 완료 되었습니다.");
			}
		}

// =======================================================	

	void withdraw() { // 출금
	
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("출금액 : ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		Account account = findAccount(id);
		if(account != null) {
			if(account.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				account.setBalance(account.getBalance()-money);
				System.out.println("출금 완료되었습니다.");
			}
		}
	}
	

// ========= 잔액 조회 ==============================================	

	public void inquire() { // 잔액 조회
		
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		Account account = findAccount(id);
		if(account != null) {
			System.out.println(account.getBalance());
		}
	}
		
// ========== 출력 =============================================	

	void display() { // 출력
		for (Account account : list) {
			System.out.println("\t계좌번호\t성명\t금액");
			System.out.println(account);
		}
	}
	
// ========= 해당 계좌 찾기 =======================================================
	
	private Account findAccountTraverse(int id) {
		
		for(Account account : list) {
			if (account.getId() == id) { //동일한 계좌가 있다면
				return account;
			}
		}
		return null;
	}

// ======= 입금, 출금, 조회시에 계좌 찾기 ======================================================
	
	private Account findAccount(int id) { // 입금, 출금, 조회시에 계좌 찾기
		Account account = findAccountTraverse(id);
		if (account == null) {
			System.out.println(ERROR_NOT_FIND_ID); // 
		}
		return account;
	}
	
	private boolean isAccount(int id) { 
		// 계좌 중복 조회이기 때문에 account를 리턴하지 말고 bool 값을 리턴
		return (findAccountTraverse(id) == null) ? false : true;
	}
}