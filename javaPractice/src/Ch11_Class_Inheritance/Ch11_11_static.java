package Ch11_Class_Inheritance;

/*
 * static �����ڴ� ������ �޼��� �տ� �پ �� ����� Ŭ���� ������ ���� �ǹ�
 * Ŭ���� ����� ó�� Ŭ������ �޸𸮿� �ε� �� �� �����Ǳ� ������ �ν��Ͻ��� �������� �ʾƵ�
 * ��� ����
 */

class StaticPractice{
	public static int number = 3;
	
	public static void say() {
		System.out.println("�ν��Ͻ� ���� ���� ��� �����մϴ�.");
	}
}

public class Ch11_11_static {

	public static void main(String[] args) {
		System.out.println(StaticPractice.number);
		StaticPractice.say();
	}

}
