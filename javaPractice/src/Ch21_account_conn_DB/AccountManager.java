package Ch21_account_conn_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner stdIn;
	private AccountDAO accountDAO;
	private final String ERROR_NOT_FIND_ID = "���� ���¹�ȣ�Դϴ�";
	
	public AccountManager() {
//		getConnection(); // + �߰��� ����
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
		accountDAO = new AccountDAO();
	}
	
	// ��� ���� ����
	public void disConnect() {
		accountDAO.disConnect();
	}
	
// ====== ���� ���� =========================================================
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ : ");
		account.setId(stdIn.nextInt());
//		int id = account.getId();
		
		System.out.print("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
//			list.add(account); // ���� ���! ����Ʈ�� account �߰� ���
		if (accountDAO.insertAccount(account)) {
			
			System.out.println("���°� �����Ǿ����ϴ�.");
//			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�.");
		}
	}
	
// ====== �Ա� ================================================	
	
	void deposit() { // �Ա�
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("�Աݾ� : ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		if (accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
//		Account account = findAccount(id);
//		if (account != null) { 
//				account.setBalance(money + account.getBalance());
//				System.out.println("�Ա� �Ϸ� �Ǿ����ϴ�.");
//			}
		}
	
// ======== ��� ===============================================	
	
	void withdraw() { // ���
	
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		System.out.print("��ݾ� : ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		if (accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id); 			// �ܾ� ������ ��������
			if (account.getBalance() < money) { 		// ��ݾ׺��� �ܾ��� Ŭ ���
 				System.out.println("�ܾ��� �����մϴ�.");	// �ܾ��� �����ϴٰ� �˷��ֱ�
			}
			else { 										// ��ݾ��� �ܾ׺��� ���� ���
				accountDAO.updateBalance(id, money, false);		// ����� �����ϵ��� �Լ� ����
				System.out.println("��� �Ϸ�Ǿ����ϴ�.");	
			}
			return;
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
//		Account account = updateBalance(id);
//		if(account != null) {
//			if(account.getBalance() < money) {
//				System.out.println("�ܾ��� �����մϴ�.");
//			}
//			else {
//				account.setBalance(account.getBalance()-money);
//				System.out.println("��� �Ϸ�Ǿ����ϴ�.");
//			}
//		}
	}

// ========= �ܾ� ��ȸ ==============================================	

	public void inquire() { // �ܾ� ��ȸ
		
		System.out.print("���¹�ȣ : ");
		int id = stdIn.nextInt();
		
		Account account = accountDAO.selectOne(id);
		if(account != null) {
			System.out.println("���¹�ȣ" + "\t����" + "\t�ܾ�");
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	
// ========== ��� =============================================	

	void display() { // ���
//		for (Account account : list) {
//			System.out.println("\t���¹�ȣ\t����\t�ݾ�");
//			System.out.println(account);
		ArrayList<Account> list = accountDAO.selectAll();
		System.out.println("���¹�ȣ" + "\t����" + "\t�ܾ�");
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
	
// ========= �ش� ���� ã�� =======================================================
	
//	private Account findAccountTraverse(int id) {
//		
//		for(Account account : list) {
//			if (account.getId() == id) { //������ ���°� �ִٸ�
//				return account;
//			}
//		}
//		return null;
//	}

// ======= �Ա�, ���, ��ȸ�ÿ� ���� ã�� ======================================================
	
//	private Account findAccount(int id) { // �Ա�, ���, ��ȸ�ÿ� ���� ã��
//		Account account = findAccountTraverse(id);
//		if (account == null) {
//			System.out.println(ERROR_NOT_FIND_ID); // 
//		}
//		return account;
//	}
	

}