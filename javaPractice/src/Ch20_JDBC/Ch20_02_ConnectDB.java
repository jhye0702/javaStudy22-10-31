package Ch20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;

/*
 
 DBMS와 연결하기
 
 java.sql 패키지가 제공하는  Connection 객체를 사용
 Connection 객체는 역시 java.sql 패키지에 포함되어 있는
 DriverManager 클래스의 getConnection() 메서드를 이용.
 getConnection(String url, String user, String password) 메서드는 static 메서드로서
 url은 서버와 데이터베이스 위치를 나타내고, 
 user는 사용자 접속 아이디, password는 접속 비밀번호를 저장
 
 */
class DB{
	// Connection : Statement, PreparedStatement, CallableStatement 구현 객체를 생성하며
	//				트랜잭션Transaction 처리 및 DB 연결을 끊을 때 사용.
	Connection conn = null;
	// PreparedStatement: 차이점은 매개변수화된 SQL문을 사용할 수 있기 때문에 편리성이나 보안성이 좋음.
	//					-> SQL문을 미리 만들어 두고 변수를 따로 입력하는 방식
	//						효율성이나 유지 보수 측면에서 유리.
	//						그래서 Statement(주로 변경되지 않는 정적 SQL문 실행에 사용)보다는
	//						PreparedStatement를 주로 사용.
	//						기본적으로 Statement 클래스를 상속받기 때문에 Statement클래스의 
	//						모든 메서드를 모두 사용할 수 있음.
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null; // 쿼리 시에 결과를 저장하는 용도로 사용. select 에 주로 사용
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3308";
		final String DB_NAME = "sample_java"; // 데이터 베이스 이름
		final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" 
								+ DB_PORT + "/" + DB_NAME;
		final String DB_USER = "root";
		final String DB_PASS = "8969";
		
		// 디비 접속
		try {
			Class.forName(driver); // JDBC 드라이버 등록
			// DriverManager : JDBC Driver를 관리하며 DB와 연결해서 Connection구현 객체를 생성
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS); // 디비연결 // null이 없으면 성공적으로 연결된 것
			if(conn != null) {
				System.out.println("DB 접속 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	
	public void closeDB() { // 위에서 만든 것의 순서에서 반대로 닫습니다.
		try {
			if (resultSet != null ) { // 열린 경우 닫음
				resultSet.close();
			}
			if (preparedStatement != null) { // 열린 경우 닫음
				preparedStatement.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB 접속 해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
public class Ch20_02_ConnectDB {
		// Connection 객체를 생성해 DataBase 연결하기
	
	public static void main(String[] args) {
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();
	}
}

