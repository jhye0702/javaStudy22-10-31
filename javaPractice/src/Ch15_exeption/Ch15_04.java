package Ch15_exeption;

public class Ch15_04 {
	public static void main(String[] args) {
		
		// �ܺη� ����
		int a = 0;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
			int c = b / a;
		}
		catch (ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		finally {
			System.out.println("���� ����");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}
}
