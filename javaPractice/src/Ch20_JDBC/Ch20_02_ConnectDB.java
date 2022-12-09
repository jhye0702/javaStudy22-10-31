package Ch20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;

/*
 
 DBMS�� �����ϱ�
 
 java.sql ��Ű���� �����ϴ�  Connection ��ü�� ���
 Connection ��ü�� ���� java.sql ��Ű���� ���ԵǾ� �ִ�
 DriverManager Ŭ������ getConnection() �޼��带 �̿�.
 getConnection(String url, String user, String password) �޼���� static �޼���μ�
 url�� ������ �����ͺ��̽� ��ġ�� ��Ÿ����, 
 user�� ����� ���� ���̵�, password�� ���� ��й�ȣ�� ����
 
 */
class DB{
	// Connection : Statement, PreparedStatement, CallableStatement ���� ��ü�� �����ϸ�
	//				Ʈ�����Transaction ó�� �� DB ������ ���� �� ���.
	Connection conn = null;
	// PreparedStatement: �������� �Ű�����ȭ�� SQL���� ����� �� �ֱ� ������ �����̳� ���ȼ��� ����.
	//					-> SQL���� �̸� ����� �ΰ� ������ ���� �Է��ϴ� ���
	//						ȿ�����̳� ���� ���� ���鿡�� ����.
	//						�׷��� Statement(�ַ� ������� �ʴ� ���� SQL�� ���࿡ ���)���ٴ�
	//						PreparedStatement�� �ַ� ���.
	//						�⺻������ Statement Ŭ������ ��ӹޱ� ������ StatementŬ������ 
	//						��� �޼��带 ��� ����� �� ����.
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null; // ���� �ÿ� ����� �����ϴ� �뵵�� ���. select �� �ַ� ���
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3308";
		final String DB_NAME = "sample_java"; // ������ ���̽� �̸�
		final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" 
								+ DB_PORT + "/" + DB_NAME;
		final String DB_USER = "root";
		final String DB_PASS = "8969";
		
		// ��� ����
		try {
			Class.forName(driver); // JDBC ����̹� ���
			// DriverManager : JDBC Driver�� �����ϸ� DB�� �����ؼ� Connection���� ��ü�� ����
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS); // ��񿬰� // null�� ������ ���������� ����� ��
			if(conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}
	
	public void closeDB() { // ������ ���� ���� �������� �ݴ�� �ݽ��ϴ�.
		try {
			if (resultSet != null ) { // ���� ��� ����
				resultSet.close();
			}
			if (preparedStatement != null) { // ���� ��� ����
				preparedStatement.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
public class Ch20_02_ConnectDB {
		// Connection ��ü�� ������ DataBase �����ϱ�
	
	public static void main(String[] args) {
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();
	}
}

