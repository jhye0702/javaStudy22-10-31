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
				System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
				System.out.println("�̸� : " + student.getName() );
				System.out.println("��ȭ��ȣ : " + student.getPhoneNumber() );
				System.out.println("�޸� : " + student.getMemo() );
				System.out.println();
				return student;
			}
		} 
		return null;
	}
	
// ========= 1. �л� �߰� �� ���� =========================================
	
	public void addStudent() {
//		System.out.print("�л��� �й��� �Է��ϼ���. >>> ");
//		int studentNumber = input.nextInt(); // �й� �Է¹���
		int studentNumber = stn();
		
		// �Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {  	 // �л� ��ȣ�� ������ �й��� �߰� �ϰ�
			newStudent = new Student(studentNumber);
			students.add(newStudent); // �л� ��ü�� ArrayList�� ����
		}
		
		System.out.print("�̸��� �Է��ϼ��� >>> ");
		newStudent.setName(input.next());		// ���ڿ� �Է� �޾Ƽ� setName�� ����
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� >>> ");
		newStudent.setPhoneNumber(input.next());
		System.out.print("�޸� �Է��ϼ��� >>> ");
		newStudent.setMemo(input.next());
		
		System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println();
	}
	
// ========= 2. �л� ���� ==============================================
	public void removeStudent() {
		
//		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//		int studentNumber = input.nextInt(); // �й� �Է¹���
		int studentNumber = stn();
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			System.out.println();
			return; // �޼ҵ� ����
		}
		students.remove(newStudent); // �ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		
	}


// ========= 3. ���� ��û ==============================================
	public void addClass() {
//		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//		int studentNumber = input.nextInt(); // �й� �Է¹���
		int studentNumber = stn();
		System.out.println();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			System.out.println();
			return; // �޼ҵ� ����
		}
//		if(className.length > newStudent.getClassCheck().length) {
//			classadd.newStudent.setClassCheck(false);
//		}
//			String[] className
		
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.print("1. ������û / 2. �������� / 3. ���� >>>");
			int classMenu = input.nextInt();
			switch(classMenu) {
				case 1:
					setClass("������û �� ������ �����ϼ���", newStudent, true);
					break;
				case 2:
					setClass("�������� �� ������ �����ϼ���", newStudent, false);
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
		newStudent.setClassCheck(index, check); // ���� ���� true / false ������!
		
		if( !check ) {
			newStudent.setClassScore(index, 0); // ������ 0���� �ǵ���
		}
	}
//		if( !check ) { // ���� ���� �� �����̶��
//			if ( !newStudent.getClassCheck()[index-1] ) { // �̽�û ���ý�
//				System.out.println(className[index-1] + "������ �� ��û �����Դϴ� !");
//				return;
//			}
//			else {
//				System.out.println(className[index-] + " ������ �������Ⱑ �Ϸ�ƽ��ϴ�.");
//			}
//			
//		}
//	}


	// ========= 4. ���� �Է� ==============================================
	public void setScore() {
//		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//		int studentNumber = input.nextInt(); // �й��� �Է¹���
		int studentNumber = stn();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			return; // �޼ҵ� ����
		}
		
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ���.");
//			System.out.print("1. JAVA / 2.PYTHON / 3. C / 4. ���� >>> ");
			for (int i = 0; i < Student.getClassName().length; i++) {
				System.out.print(i+1 + ". " + Student.getClassName()[i] + " / ");
				}
			System.out.print((Student.getClassName().length+1) + ". ���� >>> ");
			
			int classMenu = input.nextInt();
			if(classMenu == Student.getClassName().length+1) {	// ���� ���ý�
				break;				// while�� ����
			}
			if ( !newStudent.getClassCheck()[classMenu-1]) { // �̽�û ���ý� // �ε�����ȣ�̹Ƿ� ��ȣ-1 ���ִ°�
				System.out.println(Student.getClassName()[classMenu-1] + "������ �� ��û �����Դϴ� !");
				continue; // �̽�û�̱� ������ while�� ó������ ���ư��ϴ�.
			}
			System.out.print("������ �Է��ϼ��� >>> ");
			int score = input.nextInt();
			if (score < 0 || score > 100) { // ������ 0-100 �������� üũ !
				System.out.println("Error : ������ 0���� 100������ ���ڸ� �Է����ּ���");
				continue; // while�� ó������ ���ư�
			}
			// �������� ����� ������ �Էµ� ���
			newStudent.setClassScore(classMenu-1, score); // �ش� �л��� Score�� ������Ʈ!
			System.out.println(Student.getClassName()[classMenu-1] + "���� �Է��� �Ϸ� �Ǿ����ϴ�."); // ���
			
		}
		
	}
// ========= 5. ���� ��ȸ ===============================================
	public void informStudent() {
		System.out.println("�޴��� �������ּ���.");
		System.out.print("1. Ư�� �л��� / 2. ��ü �л� >>> ");
		int menu = input.nextInt();
		System.out.println();
		switch(menu) {
			case 1: // Ư�� �л��� ���� ����
				One();
				break;
			case 2: // ��ü �л��� ���� ����
				All();
				break;
		}
	}

	public void One() {
//		System.out.println("�л��� �й��� �Է��ϼ���");
//		int studentNumber = input.nextInt(); // �й� �Է¹���
		int studentNumber = stn();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			return; // �޼ҵ� ����
		}
		printStudentInform(newStudent);
		
	}
	public void All() {
		for (Student student : students) {
			printStudentInform(student);
		}
	}
	
	public void printStudentInform(Student student){
		System.out.println("�й� : " + student.getStudentNumber());
		System.out.println("�̸� : " + student.getName());
		System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
		System.out.println("�޸� : " + student.getMemo());
		System.out.println("���� ���� �������� ����� ���� >>> ");
		boolean[] classCheck = student.getClassCheck();
		int[] classScore = student.getClassScore();
		for (int i = 0; i < classCheck.length; i++) {
			if (classCheck[i]) {
				System.out.println("����� : " + Student.getClassName()[i] + 
								  " / ���� : " + classScore[i]);
			}
		}
	}
	// ============== �й� �Է� 
	public int stn() {
		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
		int studentNumber = input.nextInt(); // �й��� �Է¹���
		return studentNumber;
	}
	
}
