package Ch23_school_conn_DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO extends DAO {
	
	public StudentDAO() {
		// ===== DB ���� �� ���� ========
		getConnection();
	}
	
//================== ������ �л��� �ִ���? =========================== 
	
	public boolean isStudent(int studentNumber) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM student WHERE studentNumber = '"+studentNumber+"'";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
// ============ �л� �߰� =========================================
	
	public boolean insertStudent(Student student) {
		Statement statement = null;
		
		if(isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "�й��� �л��� �����մϴ�.");
			return false;
		}
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO student VALUES (%d, '%s', '%s', '%s')"
						, student.getStudentNumber(), student.getName(), student.getPhoneNumber(), student.getMemo());
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
	
// ============ �л� ���� =========================================
	
	public boolean removeStudent(Student student) {
		Statement statement = null;
		
		if(!isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "�й��� �л��� �������� �ʽ��ϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("DELETE FROM student WHERE studentNumber = %d"
					, student.getStudentNumber());
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd != 0) ? true : false;
		return res;
	}
	
// ================= �й��� �Է� �޾� ���� ���� ========================
	public Student selectOne(int studentNum) {
		Statement statement = null;
		Student student = null;
		
		try {
			String sql = "SELECT * FROM student WHERE studentNum = '"+studentNum+"'";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				student = new Student();
				student.setStudentNumber(resultSet.getInt("studentNum"));
				student.setName(resultSet.getString("name"));
				student.setPhoneNumber(resultSet.getString("phoneNumber"));
				student.setMemo(resultSet.getString("memo"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	
}
