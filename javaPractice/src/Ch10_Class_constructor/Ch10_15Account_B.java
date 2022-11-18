package Ch10_Class_constructor;

import java.util.Scanner;

/*
 * idx Ŭ���� ������ �߰��ؼ� �迭 ���� �� �迭 ��ȸ�� ���� �κ��� �����ؼ�
 * for���� �ݺ��� �ּ�ȭ �ϼ���.
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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.println(" ���� >>>>>   ");
			
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
		System.out.println("���α׷� ����");
	}
	
		private static void createAccount() {
			System.out.println("=========");
			System.out.println("���»���");
			System.out.println("=========");
			
			System.out.println("���¹�ȣ: ");
			String ano = scanner.next();
			System.out.println("������: ");
			String owner = scanner.next();
			System.out.println("�ʱ��Աݾ�: ");
			int balance = scanner.nextInt();
			accountArray[idx] = new Account_B(ano, owner, balance);
			idx++;
		}
		private static void accountList() {
			System.out.println("=========");
			System.out.println("���¸��");
			System.out.println("=========");
			
		}
		private static void deposit() {
			System.out.println("=========");
			System.out.println("�Ա�");
			System.out.println("=========");
		}
		private static void withdraw() {
			System.out.println("=========");
			System.out.println("���");
			System.out.println("=========");
		}
		
	

}
