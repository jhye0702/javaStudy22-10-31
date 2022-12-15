package Ch23_school_conn_DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SubjectDAO extends DAO {

	public SubjectDAO() {
		// ===== DB 연결 및 해제 ========
		getConnection();
	}
	// ======= 동일한 책이 있는지? ================================
	
		public boolean isSubject (int code) {
			int res = 0;
			
			try {
				String sql = "SELECT COUNT(*) AS cnt FROM subject WHERE code = '"+code+"'";
//				System.out.println(sql);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				resultSet.next();
				res = resultSet.getInt("cnt");
//				System.out.println(res);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return res != 0 ? true : false;
		}
		
	// ========= 책 등록 ======================================
		
		public boolean insertSubject(Subject subject) {
			Statement statement = null;
			
			if (isSubject(subject.getCode())) {
				System.out.println(subject.getCode() + " 코드의 책이 존재합니다.");
				return false;
			}
			
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO subject VALUES (%d, '%s')"
						, subject.getCode(), subject.getSubjectName());
				statement = connection.createStatement();
				upd = statement.executeUpdate(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(statement != null) {
						statement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			res = (upd == 0) ? false : true;
			return res;
		}
}
