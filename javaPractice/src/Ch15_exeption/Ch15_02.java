package Ch15_exeption;

public class Ch15_02 {
	public static void main(String[] args) {
			int num = 10;
			int num2 = 0;
			
			try {
				System.out.println("** �������� 0���� ������ ���� **");
				// �������� ���� ����
				System.out.println("10/0 = " + (num / num2));
				System.out.println("** �������� 0���� ������ ���� �Ϸ� **");
			} catch(Exception e) {
				System.out.println(e);
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			System.out.println("���α׷��� ���� �����մϴ�.");
	}
}
