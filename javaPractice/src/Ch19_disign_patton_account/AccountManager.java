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
//	void makeAccount() { // ���� ����
//		Account account = new Account();
//		
//		System.out.print("���� ��ȣ : ");
//		account.setId(stdIn.nextInt());
//		
//		System.out.print("�̸� : ");
//		account.setName(stdIn.next());
//		
//		System.out.print("�Աݾ� : ");
//		account.setBalance(stdIn.nextLong());
//
//		list.add(account);
//		System.out.println("���°� �����Ǿ����ϴ�.");
//		System.out.println(list.toString()+"\t");
//	}
//	
//// =======================================================	
//	
//	void deposit() { // �Ա�
//		System.out.print("���¹�ȣ : ");
//		int id = stdIn.nextInt();
//		
//		System.out.print("�Աݾ� : ");
//		long money = stdIn.nextLong();
//		
//		// �ش� ���� ã��
//		for (Account account : list) { 
//			if (account.getId() == id) { // ������ ���°� �ִٸ�
//				account.setBalance(money + account.getBalance());
//				System.out.println("�Ա� �Ϸ� �Ǿ����ϴ�.");
//				return;
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
//	}
//
//// =======================================================	
//
//	void withdraw() { // ���
//		System.out.print("���� ��ȣ : ");
//		int id = stdIn.nextInt();
//		
//		System.out.print("��ݾ� : ");
//		long money = stdIn.nextLong();
//		
//		// �ش� ���� ã��
//		for (Account account : list) {
//			if (account.getId() == id) { // ������ ���°� �ִٸ�
//				if(account.getBalance() < money) {
//					System.out.println("�ܾ��� �����մϴ�.");
//				}
//				else {
//					account.setBalance(account.getBalance()-money);
//					System.out.println("��� �Ϸ�Ǿ����ϴ�.");
//				}
//				return;
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
//	}
//
//// =======================================================	
//
//	public void inquire() { // �ܾ� ��ȸ
//		System.out.print("���¹�ȣ : ");
//		int id = stdIn.nextInt();
//		
//		// �ش� ���� ã��
//		for (Account account : list) {
//			if(account.getId() == id) {
//				System.out.println("���¹�ȣ\t����\t�ܾ�");
//				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//				return;
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
//	}
//	
//// =======================================================	
//
//	void display() { // ���
//		for (Account account : list) {
//			System.out.println("���¹�ȣ\t����\t�ݾ�");
//			System.out.println(account.getId() + "\t" + account.getName() +
//								"\t" + account.getBalance());
//		}
//	}
//}

public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner stdIn;
	private final String ERROR_NOT_FIND_ID = "���� ���¹�ȣ�Դϴ�";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ : ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.print("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
		if (!isAccount(id)) {
			list.add(account);
			
			System.out.println("���°� �����Ǿ����ϴ�.");
			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println(id + " ���¹�ȣ�� ��� �� �Դϴ�.");
		}

	}
	
	
// =======================================================	
	
	void deposit() { // �Ա�
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("�Աݾ� : ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		Account account = findAccount(id);
		if (account != null) { 
				account.setBalance(money + account.getBalance());
				System.out.println("�Ա� �Ϸ� �Ǿ����ϴ�.");
			}
		}

// =======================================================	

	void withdraw() { // ���
	
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("��ݾ� : ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		Account account = findAccount(id);
		if(account != null) {
			if(account.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				account.setBalance(account.getBalance()-money);
				System.out.println("��� �Ϸ�Ǿ����ϴ�.");
			}
		}
	}
	

// ========= �ܾ� ��ȸ ==============================================	

	public void inquire() { // �ܾ� ��ȸ
		
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		Account account = findAccount(id);
		if(account != null) {
			System.out.println(account.getBalance());
		}
	}
		
// ========== ��� =============================================	

	void display() { // ���
		for (Account account : list) {
			System.out.println("\t���¹�ȣ\t����\t�ݾ�");
			System.out.println(account);
		}
	}
	
// ========= �ش� ���� ã�� =======================================================
	
	private Account findAccountTraverse(int id) {
		
		for(Account account : list) {
			if (account.getId() == id) { //������ ���°� �ִٸ�
				return account;
			}
		}
		return null;
	}

// ======= �Ա�, ���, ��ȸ�ÿ� ���� ã�� ======================================================
	
	private Account findAccount(int id) { // �Ա�, ���, ��ȸ�ÿ� ���� ã��
		Account account = findAccountTraverse(id);
		if (account == null) {
			System.out.println(ERROR_NOT_FIND_ID); // 
		}
		return account;
	}
	
	private boolean isAccount(int id) { 
		// ���� �ߺ� ��ȸ�̱� ������ account�� �������� ���� bool ���� ����
		return (findAccountTraverse(id) == null) ? false : true;
	}
}