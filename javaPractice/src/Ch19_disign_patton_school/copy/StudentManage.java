package Ch19_disign_patton_school.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

	
	private ArrayList<Student> students;
	private Scanner input;
//	String[] className = {"JAVA", "PYTHON", "C"};
	
	public StudentManage() {
		students = new ArrayList<Student>();
		input = new Scanner(System.in);
	}
	
	
	
	Student findStudentInform (int studentNumber) {
		for (Student student : students) {
			if (student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름 : " + student.getName() );
				System.out.println("전화번호 : " + student.getPhoneNumber() );
				System.out.println("메모 : " + student.getMemo() );
				System.out.println();
				return student;
			}
		} 
		return null;
	}
	
// ========= 1. 학생 추가 및 수정 =========================================
	
	public void addStudent() {
//		System.out.print("학생의 학번을 입력하세요. >>> ");
//		int studentNumber = input.nextInt(); // 학번 입력받음
		int studentNumber = stn();
		
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
	public void removeStudent() {
		
//		System.out.print("학생의 학번을 입력하세요 >>> ");
//		int studentNumber = input.nextInt(); // 학번 입력받음
		int studentNumber = stn();
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
//		System.out.print("학생의 학번을 입력하세요 >>> ");
//		int studentNumber = input.nextInt(); // 학번 입력받음
		int studentNumber = stn();
		System.out.println();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			System.out.println();
			return; // 메소드 종료
		}
//		if(className.length > newStudent.getClassCheck().length) {
//			classadd.newStudent.setClassCheck(false);
//		}
//			String[] className
		
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
	public void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
//		System.out.print("1. JAVA / 2. PYTHON / 3. C >>> ");
		for (int i = 0; i < Student.getClassName().length; i++) {
			System.out.print(i+1 + ". " + Student.getClassName()[i] + " / ");
			}
		System.out.print(" >>> ");
		int index = input.nextInt()	- 1;
		newStudent.setClassCheck(index, check); // 과목 수강 true / false 설정됨!
		
		if( !check ) {
			newStudent.setClassScore(index, 0); // 성적을 0으로 되돌림
		}
	}
//		if( !check ) { // 수강 포기 한 과목이라면
//			if ( !newStudent.getClassCheck()[index-1] ) { // 미신청 선택시
//				System.out.println(className[index-1] + "과목은 미 신청 과목입니다 !");
//				return;
//			}
//			else {
//				System.out.println(className[index-] + " 과목의 수강포기가 완료됐습니다.");
//			}
//			
//		}
//	}


	// ========= 4. 성적 입력 ==============================================
	public void setScore() {
//		System.out.print("학생의 학번을 입력하세요 >>> ");
//		int studentNumber = input.nextInt(); // 학번을 입력받음
		int studentNumber = stn();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			return; // 메소드 종료
		}
		
		while(true) {
			System.out.println("성적을 입력/수정할 과목을 선택하세요.");
//			System.out.print("1. JAVA / 2.PYTHON / 3. C / 4. 종료 >>> ");
			for (int i = 0; i < Student.getClassName().length; i++) {
				System.out.print(i+1 + ". " + Student.getClassName()[i] + " / ");
				}
			System.out.print((Student.getClassName().length+1) + ". 종료 >>> ");
			
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) {	// 종료 선택시
				break;				// while문 종료
			}
			if ( !newStudent.getClassCheck()[classMenu-1]) { // 미신청 선택시 // 인덱스번호이므로 번호-1 해주는거
				System.out.println(Student.getClassName()[classMenu-1] + "과목은 미 신청 과목입니다 !");
				continue; // 미신청이기 때문에 while문 처음으로 돌아갑니다.
			}
			System.out.print("성적을 입력하세요 >>> ");
			int score = input.nextInt();
			if (score < 0 || score > 100) { // 성적은 0-100 까지인지 체크 !
				System.out.println("Error : 성적은 0부터 100사이의 숫자만 입력해주세요");
				continue; // while문 처음으로 돌아감
			}
			// 정상적인 과목과 성적이 입력된 경우
			newStudent.setClassScore(classMenu-1, score); // 해당 학생의 Score를 업데이트!
			System.out.println(Student.getClassName()[classMenu-1] + "성적 입력이 완료 되었습니다."); // 출력
			
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

	public void One() {
//		System.out.println("학생의 학번을 입력하세요");
//		int studentNumber = input.nextInt(); // 학번 입력받음
		int studentNumber = stn();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // 만약 기존에 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다 !");
			return; // 메소드 종료
		}
		printStudentInform(newStudent);
		
	}
	public void All() {
		for (Student student : students) {
			printStudentInform(student);
		}
	}
	
	public void printStudentInform(Student student){
		System.out.println("학번 : " + student.getStudentNumber());
		System.out.println("이름 : " + student.getName());
		System.out.println("전화번호 : " + student.getPhoneNumber());
		System.out.println("메모 : " + student.getMemo());
		System.out.println("▶▶ 현재 수강중인 과목과 성적 >>> ");
		boolean[] classCheck = student.getClassCheck();
		int[] classScore = student.getClassScore();
		for (int i = 0; i < classCheck.length; i++) {
			if (classCheck[i]) {
				System.out.println("과목명 : " + Student.getClassName()[i] + 
								  " / 성적 : " + classScore[i]);
			}
		}
	}
	// ============== 학번 입력 
	public int stn() {
		System.out.print("학생의 학번을 입력하세요 >>> ");
		int studentNumber = input.nextInt(); // 학번을 입력받음
		return studentNumber;
	}
	
}
