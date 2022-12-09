package Ch19_disign_patton_school.teacher;

import java.util.HashMap;

public class Student extends Person {
	private int studentNumber; // 학번
	// 학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
//	private boolean[] classCheck = {false, false, false}; // 수강 신청을 하면 true로 변경
//	private int[] classScore = {0, 0, 0}; // 각 과목 설정
	
	private HashMap<String, Integer> classMap = new HashMap<>();
	
	public HashMap<String, Integer> getClassMap() { // 목록 반환
		return classMap;
	}
	public boolean isClass(String s) {		// 해당 과목이 있는지
		return classMap.containsKey(s);
	}
	public void setClassMap (String s, Integer i) { // 수강 목록 등록 및 점수 변경
		this.classMap.put(s, i);
	}
	public void deleteClassMap (String s) { // 수강 취소
		this.classMap.remove(s);
	}
	
	//Student 의 생성자
	public Student (int studentNumber) {
		//학번을 매개 변수로 받아서 현재 학생의 학번을 설정한다.
		this.studentNumber = studentNumber;
	}

	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
