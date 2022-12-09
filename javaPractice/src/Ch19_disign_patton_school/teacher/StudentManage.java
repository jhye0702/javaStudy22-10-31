package Ch19_disign_patton_school.teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManage {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList();
	static String[] className = {"JAVA", "PYTHON", "C", "DATABASE"};
	
	static Student findStudentInform (int studentNumber) {
		for (Student student : students) {
			if (student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름 : " + student.getName() );
				System.out.println("전화번호 : " + student.getPhoneNumber() );
				System.out.println("메모 : " + student.getMemo() );
				System.out.println();
				return student;
			}
		} return null;
	}
	
// ========= 1. 학생 추가 및 수정 =========================================
	
	public static void addStudent() {
		// 학번을 입력받아 학생을 찾음
		// 학생이 없는 경우에 에러 메세지 출력 및 null 반환
		System.out.print("학생의 학번을 입력하세요. >>> ");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {  	 // 학생 번호가 없으면 학번을 추가 하고
			newStudent = new Student(studentNumber);
			students.add(newStudent); // 학생 객체를 ArrayList에 저장
		}
		
		System.out.print("이름을 입력하세요 >>> ");
		newStudent.setName(input.next());		// 문자열 입력 받아서 setName에 전달
		System.out.print("전화번호를 입력하세요 >>> ");
		newStudent.setPhoneNumber(input.next());
		System.out.print("메모를 입력하세요 >>> ");
		newStudent.setMemo(input.next());
		
		System.out.println("학생 추가가 완료 되었습니다.");
		System.out.println();
	}
	
// ========= 2. 학생 삭제 ==============================================
	public static void removeStudent() {
		
		System.out.print("학생의 학번을 입력하세요 >>> ");
		int studentNumber = input.nextInt(); // 학번 입력받음
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			System.out.println();
			return; // 메소드 종료
		}
		students.remove(newStudent); // 해당 학생을 삭제
		System.out.println("학생 삭제가 완료되었습니다.");
		System.out.println();
		
	}
// ========= 3. 수강 신청 ==============================================
	public void addClass() {
		System.out.print("학생의 학번을 입력하세요 >>> ");
		int studentNumber = input.nextInt(); // 학번 입력받음
		System.out.println();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			System.out.println();
			return; // 메소드 종료
		}
		
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.print("1. 수강신청 / 2. 수강포기 / 3. 종료 >>>");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					setClass("수강신청 할 과목을 선택하세요", newStudent, true);
					break;
				case 2:
					setClass("수강포기 할 과목을 선택하세요", newStudent, false);
					break;
				case 3:
					return;
			}
			System.out.println();
		}
	}
	public void setClass(String message, Student student, boolean check) {
		System.out.println(message);
		System.out.print(printClass()); // 1. JAVA / 2. PYTHON 이런거 뜨도록?
		int index = input.nextInt()	- 1;
		// 수강신청이면 map에 저장, 수상 취소면 map 삭제
		if (check) {
			student.setClassMap(className[index], 0);
		}
		else {
			student.deleteClassMap(className[index]);
		}
//		newStudent.setClassCheck(index, check); // 과목 수강 true / false 설정됨!
//		
//		if( !check ) {
//			newStudent.setClassScore(index, 0); // 성적을 0으로 되돌림
//		}
	}

	private String printClass() {
		String cName = "";
		for(int i=0; i < className.length; i++) {
			cName += (i+1 + ". " + className[i] + "/" );
		}
		
//		String classNames = "";
//		for(String name:className) {
//			classNames += name;
//		}
		return cName;
	}

	// ========= 4. 성적 입력 ==============================================
	public void setScore() {
		Student student = inputStudentNumber();
		if(student == null) { // 만약 기존에 학생의 정보가 없다면
			return; // 메소드 종료
		}
		
		while(true) {
			System.out.println("성적을 입력/수정할 과목을 선택하세요.");
			System.out.print(printClass() + " 0. 종료 >>> ");
			int classMenu = input.nextInt();
			if(classMenu == 0) {	// 종료 선택시
				break;				// while문 종료
			}
//			if ( !student.getClassCheck()[classMenu-1]) { // 미신청 선택시 // 인덱스번호이므로 번호-1 해주는거
			if ( !student.isClass(className[classMenu-1])) { // 미신청 체크
				System.out.println(className[classMenu-1] + "과목은 미 신청 과목입니다 !");
				continue; // 미신청이기 때문에 while문 처음으로 돌아갑니다.
			}
			System.out.print("성적을 입력하세요 >>> ");
			int score = input.nextInt();
			if (score < 0 || score > 100) { // 성적은 0-100 까지인지 체크 !
				System.out.println("Error : 성적은 0부터 100사이의 숫자만 입력해주세요");
				continue; // while문 처음으로 돌아감
			}
			// 정상적인 과목과 성적이 입력된 경우
			student.setClassMap(className[classMenu-1], score); // 해당 학생의 Score를 업데이트!
			System.out.println(className[classMenu-1] + "성적 입력이 완료 되었습니다."); // 출력
		}
	}


	// ========= 5. 정보 조회 ===============================================
	public void informStudent() {
		System.out.println("메뉴를 선택해주세요.");
		System.out.print("1. 특정 학생만 / 2. 전체 학생 >>> ");
		int menu = input.nextInt();
		System.out.println();
		switch(menu) {
			case 1: // 특정 학생의 성적 정보
				One();
				break;
			case 2: // 전체 학생의 성적 정보
				All();
				break;
		}
	}

	private void One() {
		System.out.println("학생의 학번을 입력하세요");
		int studentNumber = input.nextInt(); // 학번 입력받음
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			return; // 메소드 종료
		}
		printStudent(newStudent);
		
	}
	private void All() {
		for (Student student : students) {
			printStudent(student);
		}
	}
	private void printStudent(Student student) {
		System.out.println("학번 : " + student.getStudentNumber());
		System.out.println("이름 : " + student.getName());
		System.out.println("전화번호 : " + student.getPhoneNumber());
		System.out.println("메모 : " + student.getMemo());
		System.out.println("현재 수강중인 과목과 성적 >>> ");
		HashMap<String, Integer> classMap = student.getClassMap();
		Iterator<String> ir = classMap.keySet().iterator();
		while (ir.hasNext()) { // 다음 key가 있다면
			String key = ir.next(); // key 값을 가져와서
			int score = classMap.get(key); // key로부터 value 가져오기
			System.out.println("과목명: " + key + " / 성적: " + score);
		}
//		boolean[] classCheck = student.getClassCheck();
//		int[] classScore = student.getClassScore();
//		for (int i = 0; i < classCheck.length; i++) {
//			if (classCheck[i]) {
//				System.out.println("과목명 : " + className[i] + 
//								" / 성적 : " + classScore[i]);
//			}
//		}
	}
	private Student inputStudentNumber() {
		System.out.println("학생의 학번을 입력하세요");
		int studentNumber = input.nextInt();
		for (Student student : students) {
			if (student.getStudentNumber() == studentNumber) {
				return student;
				}
			}
		return null;
	}
}

// Student findStudentInform (int studentNumber) {
//for (Student student : students) {
//	if (student.getStudentNumber() == studentNumber) {
//		System.out.println("해당 학생의 정보는 다음과 같습니다.");
//		System.out.println("이름 : " + student.getName() );
//		System.out.println("전화번호 : " + student.getPhoneNumber() );
//		System.out.println("메모 : " + student.getMemo() );
//		System.out.println();
//		return student;
//	}
//} return null;
