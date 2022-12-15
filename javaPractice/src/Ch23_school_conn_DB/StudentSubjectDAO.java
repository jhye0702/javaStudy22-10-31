package Ch23_school_conn_DB;


public class StudentSubjectDAO extends DAO {
	
	public StudentSubjectDAO() {
		// ===== DB 연결 및 해제 ========
		getConnection();
	}
	
}
