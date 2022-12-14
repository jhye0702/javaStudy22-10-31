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
	private final String ERROR_NOT_FIND_ID = "없는 계좌번호입니다";
	
	public AccountManager() {
//		getConnection(); // + 추가된 내용
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
		accountDAO = new AccountDAO();
	}
	
	// 디비 관련 시작
	public void disConnect() {
		accountDAO.disConnect();
	}
	
// ====== 계좌 개설 =========================================================
	
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
		if (accountDAO.insertAccount(account)) {
			
			System.out.println("계좌가 개설되었습니다.");
//			System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다.");
		}
	}
	
// ====== 입금 ================================================	
	
	void deposit() { // 입금
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("입금액 : ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		if (accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
//		Account account = findAccount(id);
//		if (account != null) { 
//				account.setBalance(money + account.getBalance());
//				System.out.println("입금 완료 되었습니다.");
//			}
		}
	
// ======== 출금 ===============================================	
	
	void withdraw() { // 출금
	
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		System.out.print("출금액 : ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		if (accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id); 			// 잔액 정보를 가져오고
			if (account.getBalance() < money) { 		// 출금액보다 잔액이 클 경우
 				System.out.println("잔액이 부족합니다.");	// 잔액이 부족하다고 알려주기
			}
			else { 										// 출금액이 잔액보다 작을 경우
				accountDAO.updateBalance(id, money, false);		// 출금이 가능하도록 함수 실행
				System.out.println("출금 완료되었습니다.");	
			}
			return;
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
//		Account account = updateBalance(id);
//		if(account != null) {
//			if(account.getBalance() < money) {
//				System.out.println("잔액이 부족합니다.");
//			}
//			else {
//				account.setBalance(account.getBalance()-money);
//				System.out.println("출금 완료되었습니다.");
//			}
//		}
	}

// ========= 잔액 조회 ==============================================	

	public void inquire() { // 잔액 조회
		
		System.out.print("계좌번호 : ");
		int id = stdIn.nextInt();
		
		Account account = accountDAO.selectOne(id);
		if(account != null) {
			System.out.println("계좌번호" + "\t성명" + "\t잔액");
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
	}
	
// ========== 출력 =============================================	

	void display() { // 출력
//		for (Account account : list) {
//			System.out.println("\t계좌번호\t성명\t금액");
//			System.out.println(account);
		ArrayList<Account> list = accountDAO.selectAll();
		System.out.println("계좌번호" + "\t성명" + "\t잔액");
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
	
// ========= 해당 계좌 찾기 =======================================================
	
//	private Account findAccountTraverse(int id) {
//		
//		for(Account account : list) {
//			if (account.getId() == id) { //동일한 계좌가 있다면
//				return account;
//			}
//		}
//		return null;
//	}

// ======= 입금, 출금, 조회시에 계좌 찾기 ======================================================
	
//	private Account findAccount(int id) { // 입금, 출금, 조회시에 계좌 찾기
//		Account account = findAccountTraverse(id);
//		if (account == null) {
//			System.out.println(ERROR_NOT_FIND_ID); // 
//		}
//		return account;
//	}
	

}