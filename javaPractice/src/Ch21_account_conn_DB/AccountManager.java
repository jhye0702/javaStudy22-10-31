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
	private final String ERROR_NOT_FIND_ID = "���� ���¹�ȣ�Դϴ�";
	private Connection connection = null; // + �߰��� ����
	
	public AccountManager() {
		getConnection(); // + �߰��� ����
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// ��� ���� ���� + �߰��� ����
	private void getConnection() { // ��� ����
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_account";
			String user = "root";
			String password = "8969";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// + �߰��� ����
	public void disConnect() { // ���� ����. ���� ����ÿ� ���
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// + �߰��� ���� ===================================================
	private boolean isAccount (int id) { // ������ ���°� �ִ���
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id + "'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
//			System.out.println(res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	// + �߰��� ���� ====================================================
	private boolean insertAccount(Account account) {
		// ���� ����
		// ���� ���� ���� ������ ���¹�ȣ�� �����ϴ��� Ȯ��
		Statement statement = null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " ���°� �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)"
					, account.getId(), account.getName(), account.getBalance());
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
	// + �߰��� ���� ========================================================
	// �� �޼���� ��ü ���� ��ȸ�Ҷ� �����ϸ� ���� �� ����~
	private ArrayList<Account> selectAll() {
		// ��ü ���� ����
		Statement statement = null;
		ArrayList<Account> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM account ";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Account account = new Account (resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("balance"));
				list.add(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
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
		if (insertAccount(account)) {
			
			System.out.println("���°� �����Ǿ����ϴ�.");
//			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�.");
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
//		for (Account account : list) {
//			System.out.println("\t���¹�ȣ\t����\t�ݾ�");
//			System.out.println(account);
		ArrayList<Account> list = selectAll();
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
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
	

}