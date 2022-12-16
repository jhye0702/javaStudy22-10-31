package Ch20_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

// ������ ����

class DBDelete extends DBSelect {
	public void deleteUser() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �� ������ ���̵� �Է��ϼ��� : ");
		String userID = scanner.nextLine();
		
		String deleteSQL = "DELETE FROM tUser WHERE userID = '" + userID +"' ";
		
		preparedStatement = conn.prepareStatement(deleteSQL); // ���� ���� �غ�
		int cnt = preparedStatement.executeUpdate(); // ������ ���� ������ ���� ��ȯ
		// pstmt.excute.Query() : select
		// pstmt.excuteUpdate() : insert, update, delete ..
		
		if(cnt > 0) {
			System.out.println("������ ���� ������ : " + cnt);
			System.out.println("������ ������ �����߽��ϴ�.");
			System.out.println();
		}
		else {
			System.out.println("������ ������ �����߽��ϴ�.");
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