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
				System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
				System.out.println("�̸� : " + student.getName() );
				System.out.println("��ȭ��ȣ : " + student.getPhoneNumber() );
				System.out.println("�޸� : " + student.getMemo() );
				System.out.println();
				return student;
			}
		} return null;
	}
	
// ========= 1. �л� �߰� �� ���� =========================================
	
	public static void addStudent() {
		// �й��� �Է¹޾� �л��� ã��
		// �л��� ���� ��쿡 ���� �޼��� ��� �� null ��ȯ
		System.out.print("�л��� �й��� �Է��ϼ���. >>> ");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
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
	public static void removeStudent() {
		
		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
		int studentNumber = input.nextInt(); // �й� �Է¹���
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
		System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		System.out.println();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			System.out.println();
			return; // �޼ҵ� ����
		}
		
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
	public void setClass(String message, Student student, boolean check) {
		System.out.println(message);
		System.out.print(printClass()); // 1. JAVA / 2. PYTHON �̷��� �ߵ���?
		int index = input.nextInt()	- 1;
		// ������û�̸� map�� ����, ���� ��Ҹ� map ����
		if (check) {
			student.setClassMap(className[index], 0);
		}
		else {
			student.deleteClassMap(className[index]);
		}
//		newStudent.setClassCheck(index, check); // ���� ���� true / false ������!
//		
//		if( !check ) {
//			newStudent.setClassScore(index, 0); // ������ 0���� �ǵ���
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

	// ========= 4. ���� �Է� ==============================================
	public void setScore() {
		Student student = inputStudentNumber();
		if(student == null) { // ���� ������ �л��� ������ ���ٸ�
			return; // �޼ҵ� ����
		}
		
		while(true) {
			System.out.println("������ �Է�/������ ������ �����ϼ���.");
			System.out.print(printClass() + " 0. ���� >>> ");
			int classMenu = input.nextInt();
			if(classMenu == 0) {	// ���� ���ý�
				break;				// while�� ����
			}
//			if ( !student.getClassCheck()[classMenu-1]) { // �̽�û ���ý� // �ε�����ȣ�̹Ƿ� ��ȣ-1 ���ִ°�
			if ( !student.isClass(className[classMenu-1])) { // �̽�û üũ
				System.out.println(className[classMenu-1] + "������ �� ��û �����Դϴ� !");
				continue; // �̽�û�̱� ������ while�� ó������ ���ư��ϴ�.
			}
			System.out.print("������ �Է��ϼ��� >>> ");
			int score = input.nextInt();
			if (score < 0 || score > 100) { // ������ 0-100 �������� üũ !
				System.out.println("Error : ������ 0���� 100������ ���ڸ� �Է����ּ���");
				continue; // while�� ó������ ���ư�
			}
			// �������� ����� ������ �Էµ� ���
			student.setClassMap(className[classMenu-1], score); // �ش� �л��� Score�� ������Ʈ!
			System.out.println(className[classMenu-1] + "���� �Է��� �Ϸ� �Ǿ����ϴ�."); // ���
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

	private void One() {
		System.out.println("�л��� �й��� �Է��ϼ���");
		int studentNumber = input.nextInt(); // �й� �Է¹���
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) { // ���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ� !");
			return; // �޼ҵ� ����
		}
		printStudent(newStudent);
		
	}
	private void All() {
		for (Student student : students) {
			printStudent(student);
		}
	}
	private void printStudent(Student student) {
		System.out.println("�й� : " + student.getStudentNumber());
		System.out.println("�̸� : " + student.getName());
		System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
		System.out.println("�޸� : " + student.getMemo());
		System.out.println("���� �������� ����� ���� >>> ");
		HashMap<String, Integer> classMap = student.getClassMap();
		Iterator<String> ir = classMap.keySet().iterator();
		while (ir.hasNext()) { // ���� key�� �ִٸ�
			String key = ir.next(); // key ���� �����ͼ�
			int score = classMap.get(key); // key�κ��� value ��������
			System.out.println("�����: " + key + " / ����: " + score);
		}
//		boolean[] classCheck = student.getClassCheck();
//		int[] classScore = student.getClassScore();
//		for (int i = 0; i < classCheck.length; i++) {
//			if (classCheck[i]) {
//				System.out.println("����� : " + className[i] + 
//								" / ���� : " + classScore[i]);
//			}
//		}
	}
	private Student inputStudentNumber() {
		System.out.println("�л��� �й��� �Է��ϼ���");
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
//		System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
//		System.out.println("�̸� : " + student.getName() );
//		System.out.println("��ȭ��ȣ : " + student.getPhoneNumber() );
//		System.out.println("�޸� : " + student.getMemo() );
//		System.out.println();
//		return student;
//	}
//} return null;
