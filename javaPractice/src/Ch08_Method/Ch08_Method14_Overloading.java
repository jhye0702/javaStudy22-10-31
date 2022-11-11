package Ch08_Method;


public class Ch08_Method14_Overloading {
	/*
	 * ====================== �޼��� �����ε� ===========================
	 * C, ���̽� ����.
	 * �Ű������� Ÿ�� Ȥ�� ������ �ٸ��� ���� �̸��� ���� �޼��带 ������ �� �� ����.
	 * 
	 * C++, ���̽㿡 �ִ� �⺻�� ����� �ڹٿ� ����.
	 */
	public static void main(String[] args) {
		printGreet(); // �ȳ��ϼ���
		printGreet("�ȳ�~!"); // �ȳ�~!
		printGreet("�Ѽ�", "�� �����̳���?"); // �Ѽ���! �� �����̳���?
		printGreet(3);
	}
	public static void printGreet() {
		System.out.println("printGreet() �޼��尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���");
	}
	public static void printGreet(String greeting) {
		// ���� �̸��� �޼��尡 ������ �Ű������� ����
		System.out.println("printGreet(String greeting) �޼��尡 ����˴ϴ�.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) {
		// �Ű������� ���ڿ��� �޼��尡 ������ ������ �ٸ�
		System.out.println("printGreet(String name, String greeting) �޼��尡 ����˴ϴ�.");
		System.out.println(name + "��! " + greeting);
	}
	public static void printGreet(int cnt) {
		// �Ű������� �ϳ��� �޼��尡 ������ ������ Ÿ���� �ٸ�
		System.out.println("printGreet(int cnt) �޼��尡 ����˴ϴ�");
		System.out.println("�ȳ��ϼ���. " + cnt + "��° ���°ų׿�.");
	}
}
