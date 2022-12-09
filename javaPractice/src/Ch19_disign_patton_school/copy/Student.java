package Ch19_disign_patton_school.copy;

public class Student extends Person {
	private int studentNumber;
	// 학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
	private static String[] className = {"JAVA", "PYTHON", "C", "HTML", "CSS"};
	private boolean[] classCheck = new boolean[className.length]; // 수강 신청을 하면 true로 변경
	private int[] classScore = new int[className.length]; // 각 과목 설정
	
	//Student 의 생성자
	public Student (int studentNumber) {
		//학번을 매개 변수로 받아서 현재 학생의 학번을 설정한다.
		this.studentNumber = studentNumber;
	}

	public boolean[] getClassCheck() {
		return classCheck;
	}
	public void setClassCheck(int index, boolean check) { 
							// int index => 과목 번호, boolean check => 수강신청여부
		this.classCheck[index] = check;
	}
	public int[] getClassScore() {
		return classScore;
	}
	public void setClassScore(int index, int score) {
							// int index => 과목 번호, int score => 개별 성적
		this.classScore[index] = score;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public static String[] getClassName() {
		return className;
	}

	public static void setClassName(String[] className) {
		Student.className = className;
	}
}
