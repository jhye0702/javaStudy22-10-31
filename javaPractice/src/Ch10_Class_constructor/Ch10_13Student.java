package Ch10_Class_constructor;
/*
 * Student Ŭ������ �����Ͻÿ�
 * �̸� name, �� ban, ��ȣ no�� �Է¹޴� �����ڸ� ����ÿ�
 * ���� kor, ���� eng, ���� math ������ �Է¹޴� updateRecord() �޼��带 �ۼ��Ͻÿ�.
 * �л��� �̸��� ��ȯ�ϴ� getName(), �Է¹��� ������ �հ踦 ���ϴ� getTotal(),
 * ����� ��ȯ�ϴ� getAverage()�� �ۼ��Ͻÿ�.
 */
class Student {
	String name;
	int ban, no, kor, eng, math;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	@Override
	public String toString() {
		return ("Student [�̸�:" +name+ ", ��:" +ban+ ", ��ȣ:"  
				+no+ ", ��������:"  +kor+ ", ��������:"  +eng+ ", ��������:" +math+ "]");
	}
	void updateRecord(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	String getName() {
		return name;
	}
	int getTotal() {
		return kor + eng + math;
	}
	double getAverage() {
		return getTotal() / 3 ;
	}
	
}

public class Ch10_13Student {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}

}
