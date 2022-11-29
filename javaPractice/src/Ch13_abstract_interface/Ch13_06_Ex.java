package Ch13_abstract_interface;

abstract class Student {
	public String name;		// �̸�
	public int grade; 		// �г�
	String teacher;			// ������ �̸��� �߰�!
	
	public Student() {
		System.out.println("�θ� ! Student ������ ȣ��");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSudInfo() {
		System.out.println("Student Ŭ������ getStudInfo()�޼ҵ� ȣ��");
		return "�̸��� : " + name + ", �г��� " + grade;
	}
	// �л��� ���� �������� �̸��� ���ϴ� �޼ҵ�
	public abstract String getTeacher();

}


//--------------------------------------------------------------- ��� �޴� Ŭ����


class Elementary extends Student {
	public Elementary (String name, int grade) {
		System.out.println("Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
	}
	public Elementary (String name, int grade, String teacher) {
		System.out.println("�ڽ� @ Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	public Elementary() {
		this("�̼���", 3);
		System.out.println("Elementary ������ ȣ��");
	}
	@Override
	// ��� �������� �̸��� ���ϴ� �޼���
	public String getTeacher() {
		return "��� ������ : " + super.teacher;
	}
}

//--------------------------------------------------------------- ��ӹ޴� Ŭ����


class University extends Student {
	private int courses;		// ��û ����
	
	public University(String name, int grade, int courses) {
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public University(String name, int grade, int courses, String teacher) {
		System.out.println("�ڽ� @ University ������ ȣ��");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		super.teacher = teacher;
	}
	
	public University() {
		this("�̼���", 2 , 20);
	}
	public int getCourses() {
		return courses;
	}
	//overriding �޼ҵ�
	public String getStudInfo() {
		System.out.println("University Ŭ������ getStudInfo �޼ҵ� ȣ��");
		return "�̸��� >> " + name + ", �г��� >> " + grade + ", ��û������ >> " + courses; 
	}
	// ���� ������ �̸��� ���ϴ� �޼���
	public String getTeacher() {
		return "��� ������ : " + teacher;
	}
}

public class Ch13_06_Ex {

	public static void main(String[] args) {
		
		/*
		 * �ش� �ҽ��� �߻�Ŭ������ �����ؼ� �������̵��� �������� �ο��� ��.
		 * ��ü �����ÿ� ��� ������ ������ �Է��ϴ� �����ڸ� �߰��� ��.
		 */
		University university = new University("ȫ�浿", 2, 24, "������");
		Elementary elementary = new Elementary("�̼���", 3, "ȫ��");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		for (Student s : students) {
			System.out.println("�л� �̸� : " + s.getName());
			System.out.println(s.getTeacher());
		}
	}
	
	/*
	 * �л� �̸� : ȫ�浿
	 * ��� ������ : ������
	 * �л� �̸� : �̼���
	 * ��� ������ : ȫ��
	 */

	/*
	 * ���� �����ڰ� Student ���� Ŭ������ ����鼭 
	 * �л��� ��� �����̳� ������ ���ϴ� �޼��� getTeacher()�� �������,
	 * �� �����ڿ��� �������̵��� �϶�� ��Ŵ.
	 * 
	 * ������ ������ �����ڰ� ��ü�Ǿ �ش� ������Ʈ�� �ͼ����� ���� ���
	 * �������� ���ø� �߸� �����ؼ� Elementary, University Ŭ���� ���۽ÿ�
	 * ����� ���������� �̸��� �ٸ� �޼��带 ����� ��.
	 * �� �Ŀ� �ٸ� �����ڵ��� ���� Student �� ����� Ŭ������ ���ϼ��� �Ҿ������ ��
	 * ���� ���α׷��� ������ �����ڰ� �� ����� �˾Ƽ� �����ϴ� �� ���ٴ�
	 * ������Ʈ�� �Ը� ���� Ŀ���Ƿ� ���� ���������� ������ ���ؼ���
	 * ������ ���� �ҽ��� �����ϰ�, �ҽ��� ������ �����ϰ� �����ؾ� �� �ʿ伺�� ����.
	 * ������ �̷� ������� �������̵��� �����ϸ� �����ڰ� ���Ƿ� �ҽ��� ������ �� �ֱ� ������
	 * ���ϼ��� �Ҿ���� �� ����.
	 * 
	 * �ܼ��� ���α׷��� ���ߺ��� ���� ���꼺�� ����, ���������� �����, 
	 * ����� �����̳� Ȯ���� ������ ������� ����
	 * 
	 * �ش� �ҽ��� �߻� Ŭ������ �����ؼ� �������̵��� �������� �ο��� ��
	 * ��ü �����ÿ� ��� ������ ������ �Է��ϴ� �����ڸ� �߰��� ��
	 */
	
}
