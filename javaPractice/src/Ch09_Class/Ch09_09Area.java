package Ch09_Class;

class Area {
	static void manual() { 			// static�� �����Ƿ� Ŭ���� �޼���
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�");
	}
	double triangle(int a, int b) { // �ﰢ�� ���̸� ��ȯ�ϴ� �޼���
		return (double) a * b / 2;		
	}
	int rectangle (int a, int b) {	// �簢�� ���̸� ��ȯ�ϴ� �޼���
		return a * b;
	}
}

public class Ch09_09Area {
	/*
	 * Ŭ���� �޼���� ��ü�� �������� �ʾƵ� ȣ���� ����
	 * �ν��Ͻ� �޼���� ��ü�� �����ؾ߸� ȣ���� ����
	 * �ֳ��ϸ� �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� �޸𸮻� ������ �����ϰ�
	 * Ŭ���� �޼���� Ŭ������ �޸𸮿� �ö� �� �����Ǳ� ����
	 */
	public static void main(String[] args) {
		Area.manual();			// Ŭ���� �޼��� ���� ����
		//Area.triangle(3, 5);	// ���� �߻� ( �������� ����ǵ��� �Ϸ��� ���ʿ� class�� �ִ� triangle ����, Ÿ�� �տ� static�ٿ����� )
		//Area.rectangle(3, 5);	// ���� �߻�
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
	}
}
