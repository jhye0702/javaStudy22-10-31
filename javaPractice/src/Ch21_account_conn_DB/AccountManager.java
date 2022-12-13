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
	private final String ERROR_NOT_FIND_ID = "없는 계좌번호입니다";
	private Connection connection = null; // + 추가된 내용
	
	public AccountManager() {
		getConnection(); // + 추가된 내용
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// 디비 관련 시작 + 추가된 내용
	private void getConnection() { // 디비 연결
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
	// + 추가된 내용
	public void disConnect() { // 연결 해제. 서비스 종료시에 사용
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// + 추가된 내용 ===================================================
	private boolean isAccount (int id) { // 동일한 계좌가 있는지
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
	// + 추가된 내용 ====================================================
	private boolean insertAccount(Account account) {
		// 계좌 생성
		// 계좌 생성 전에 동일한 계좌번호가 존재하는지 확인
		Statement statement = null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " 계좌가 존재합니다.");
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
	
	// + 추가된 내용 ========================================================
	// 이 메서드는 전체 계좌 조회할때 실행하면 좋을 것 같음~
	private ArrayList<Account> selectAll() {
		// 전체 정보 전달
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
	
	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호 : ");
		account.setId(stdIn.nextInt());
//		int id = account.getId();
		
		System.out.print("이름 : ");
		account.setName(stdIn.next());
		
		System.out.print("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
//			list.add(account); // 원래 방식! 리스트에 account 추가 방식
		if (insertAccount(account)) {
			
			System.out.println("계좌가 개설되었습니다.");
//			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다.");
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
//		for (Account account : list) {
//			System.out.println("\t계좌번호\t성명\t금액");
//			System.out.println(account);
		ArrayList<Account> list = selectAll();
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
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
	

}