package Ch20_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

// 데이터 삭제

class DBDelete extends DBSelect {
	public void deleteUser() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제 할 유저의 아이디를 입력하세요 : ");
		String userID = scanner.nextLine();
		
		String deleteSQL = "DELETE FROM tUser WHERE userID = '" + userID +"' ";
		
		preparedStatement = conn.prepareStatement(deleteSQL); // 쿼리 실행 준비
		int cnt = preparedStatement.executeUpdate(); // 영향을 받은 데이터 갯수 반환
		// pstmt.excute.Query() : select
		// pstmt.excuteUpdate() : insert, update, delete ..
		
		if(cnt > 0) {
			System.out.println("영향을 받은 데이터 : " + cnt);
			System.out.println("데이터 삭제에 성공했습니다.");
			System.out.println();
		}
		else {
			System.out.println("데이터 삭제에 실패했습니다.");
		}
		scanner.close();
	}
}

public class Ch20_07_DeleteUpdateUser {
	public static void main(String[] args) throws SQLException {
		DBDelete myDB = new DBDelete();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.deleteUser();
		myDB.getAllUser();
		myDB.closeDB();
	}

}
