package Ch23_school_conn_DB;

import java.util.HashMap;

public class Student {
	private String name; 		// 이름
	private String phoneNumber; // 전화 번호
	private String memo;		// 메모
	private int studentNumber; 	// 학번
//	private HashMap<String, Integer> classMap = new HashMap<>(); 
	
	StudentSubject studentsubject = new StudentSubject();
	
	public Student() {
		
	}
	
	//Student 의 생성자
	public Student (int studentNumber) {
		//학번을 매개 변수로 받아서 현재 학생의 학번을 설정한다.
		this.studentNumber = studentNumber;
	}
	
	
	public String getName() {							// 이름 가져오기
		return name;
	}
	public void setName(String name) {					// 이름 저장하기
		this.name = name;
	}
	public String getPhoneNumber() {					// 전화번호 가져오기
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {	// 전화번호 저장하기
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {							// 메모 가져오기
		return memo;
	}
	public void setMemo(String memo) {					// 메모 저장하기
		this.memo = memo;
	}
	public int getStudentNumber() {						// 학번 가져오기
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {	// 학번 저장하기
		this.studentNumber = studentNumber;
	}
//	public HashMap<String, Integer> getClassMap() { 	// 수강 과목, 과목 점수 목록 가져오기
//		return classMap;
//	}
//	public void setClassMap (String s, Integer i) { 	// 수강 목록 등록 및 점수 변경 저장하기
//		this.classMap.put(s, i);
//	}
	
	
	
//	public boolean isClass(String s) {					// 해당 과목이 있는지
//		return classMap.containsKey(s);
//	}
//	public void deleteClassMap (String s) { 			// 수강 취소
//		this.classMap.remove(s);
//	}
	

	
}
