package Ch23_school_conn_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public Connection connection = null;


	// ============ DB 연결 ================================ 
	public void getConnection() {
		
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_school";
			String user = "root";
			String password = "8969";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection  = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// =============== DB 해제 ===========================
	
	public void disConnect() {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
