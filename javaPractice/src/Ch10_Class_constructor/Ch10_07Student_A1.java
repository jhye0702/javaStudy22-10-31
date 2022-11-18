package Ch10_Class_constructor;

class Student_A {
	public String name;
	private String rollno;
	public int age;
	
	Student_A(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� �й� : " + rollno);
		System.out.println("�л��� ���� : " + age);
		
		System.out.println("Student ��ü�� �����Ǿ����ϴ�.");
	}
}

public class Ch10_07Student_A1 {
	/*
	 * �л��� ��Ÿ���� Ŭ���� Student�� �����.
	 * �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������.
	 * �й��� private�� �����Ѵ�.
	 */
	public static void main(String[] args) {
		
		Student_A student = new Student_A("Kim", "0001", 20);
		
		
		
		/*
		 * ��� ����� =>
		 * �л��� �̸� : Kim
		 * �л��� �й� : 0001
		 * �л��� ���� : 20
		 * Student ��ü�� �����Ǿ����ϴ�.
		 */
		
	}

}
