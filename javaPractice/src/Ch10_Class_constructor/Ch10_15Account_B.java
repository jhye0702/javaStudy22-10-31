package Ch10_Class_constructor;

import java.util.Scanner;

/*
 * idx 클래스 변수를 추가해서 배열 저장 및 배열 순회에 관한 부분을 수정해서
 * for문의 반복을 최소화 하세요.
 */

class Account_B{
	private String ano, owner;
	private int balance;
	
	public Account_B(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class Ch10_15Account_B {

	private static Account_B[] accountArray = new Account_B[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println(" 선택 >>>>>   ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
		private static void createAccount() {
			System.out.println("=========");
			System.out.println("계좌생성");
			System.out.println("=========");
			
			System.out.println("계좌번호: ");
			String ano = scanner.next();
			System.out.println("계좌주: ");
			String owner = scanner.next();
			System.out.println("초기입금액: ");
			int balance = scanner.nextInt();
			accountArray[idx] = new Account_B(ano, owner, balance);
			idx++;
		}
		private static void accountList() {
			System.out.println("=========");
			System.out.println("계좌목록");
			System.out.println("=========");
			
		}
		private static void deposit() {
			System.out.println("=========");
			System.out.println("입금");
			System.out.println("=========");
		}
		private static void withdraw() {
			System.out.println("=========");
			System.out.println("출금");
			System.out.println("=========");
		}
		
	

}
