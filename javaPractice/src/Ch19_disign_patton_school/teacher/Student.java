package Ch19_disign_patton_school.teacher;

import java.util.HashMap;

public class Student extends Person {
	private int studentNumber; // �й�
	// �л��� ��� �ִ� ������ ���� (�ڹ�, ���̽�, C)
//	private boolean[] classCheck = {false, false, false}; // ���� ��û�� �ϸ� true�� ����
//	private int[] classScore = {0, 0, 0}; // �� ���� ����
	
	private HashMap<String, Integer> classMap = new HashMap<>();
	
	public HashMap<String, Integer> getClassMap() { // ��� ��ȯ
		return classMap;
	}
	public boolean isClass(String s) {		// �ش� ������ �ִ���
		return classMap.containsKey(s);
	}
	public void setClassMap (String s, Integer i) { // ���� ��� ��� �� ���� ����
		this.classMap.put(s, i);
	}
	public void deleteClassMap (String s) { // ���� ���
		this.classMap.remove(s);
	}
	
	//Student �� ������
	public Student (int studentNumber) {
		//�й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� �����Ѵ�.
		this.studentNumber = studentNumber;
	}

	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
