package Ch23_school_conn_DB;

import java.util.HashMap;

public class Student {
	private String name; 		// �̸�
	private String phoneNumber; // ��ȭ ��ȣ
	private String memo;		// �޸�
	private int studentNumber; 	// �й�
//	private HashMap<String, Integer> classMap = new HashMap<>(); 
	
	StudentSubject studentsubject = new StudentSubject();
	
	public Student() {
		
	}
	
	//Student �� ������
	public Student (int studentNumber) {
		//�й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� �����Ѵ�.
		this.studentNumber = studentNumber;
	}
	
	
	public String getName() {							// �̸� ��������
		return name;
	}
	public void setName(String name) {					// �̸� �����ϱ�
		this.name = name;
	}
	public String getPhoneNumber() {					// ��ȭ��ȣ ��������
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {	// ��ȭ��ȣ �����ϱ�
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {							// �޸� ��������
		return memo;
	}
	public void setMemo(String memo) {					// �޸� �����ϱ�
		this.memo = memo;
	}
	public int getStudentNumber() {						// �й� ��������
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {	// �й� �����ϱ�
		this.studentNumber = studentNumber;
	}
//	public HashMap<String, Integer> getClassMap() { 	// ���� ����, ���� ���� ��� ��������
//		return classMap;
//	}
//	public void setClassMap (String s, Integer i) { 	// ���� ��� ��� �� ���� ���� �����ϱ�
//		this.classMap.put(s, i);
//	}
	
	
	
//	public boolean isClass(String s) {					// �ش� ������ �ִ���
//		return classMap.containsKey(s);
//	}
//	public void deleteClassMap (String s) { 			// ���� ���
//		this.classMap.remove(s);
//	}
	

	
}
