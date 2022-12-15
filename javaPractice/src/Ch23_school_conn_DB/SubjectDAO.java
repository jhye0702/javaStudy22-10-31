package Ch23_school_conn_DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SubjectDAO extends DAO {

	public SubjectDAO() {
		// ===== DB ���� �� ���� ========
		getConnection();
	}
	// ======= ������ å�� �ִ���? ================================
	
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
		
	// ========= å ��� ======================================
		
		public boolean insertSubject(Subject subject) {
			Statement statement = null;
			
			if (isSubject(subject.getCode())) {
				System.out.println(subject.getCode() + " �ڵ��� å�� �����մϴ�.");
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
