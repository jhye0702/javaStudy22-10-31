package Ch09_Class;

public class Ch09_04Student_A {

	public static void main(String[] args) {
		
		// ������ �غ���
		
		Student_A s = new Student_A();
		s.name	= "ȫ�浿";
		s.ban	= 1;
		s.no	= 1;
		s.kor	= 100;
		s.eng	= 60;
		s.math	= 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}

}

	class Student_A {
		String name;
		int ban, no, kor, eng, math;
		
		int getTotal() {
			return kor + eng + math;
		}
		float getAverage() {
			return (float)this.getTotal() / 3;	
			// �̷��� ���°� ���� ���� : 
			// 1. �����ϰ� ���� ���, 2. ����� ���� ���� ���� ��� �ι��� �ʿ�.
			// ������ ���� ����� ���� ������ ���� ���� ����� 1���� �̷������ ��.
		}
		
	}
		
		// static�� ���� �Ⱦ��� ���̴� ������?
		