package Ch23_school_conn_DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO extends DAO {
	
	public StudentDAO() {
		// ===== DB 연결 및 해제 ========
		getConnection();
	}
	
//================== 동일한 학생이 있는지? =========================== 
	
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
	
// ============ 학생 추가 =========================================
	
	public boolean insertStudent(Student student) {
		Statement statement = null;
		
		if(isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "학번의 학생이 존재합니다.");
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
	
// ============ 학생 삭제 =========================================
	
	public boolean removeStudent(Student student) {
		Statement statement = null;
		
		if(!isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "학번의 학생이 존재하지 않습니다.");
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
	
// ================= 학번을 입력 받아 정보 전달 ========================
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
