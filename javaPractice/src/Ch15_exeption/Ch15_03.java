package Ch15_exeption;

public class Ch15_03 {
	public static void main(String[] args) {
			try {
				int[] a = {2, 0};
				int b = 4 ;
				System.out.println("���� ó�� ���� �� 1");
				int c = b / a[2];
				// a[0] �� ������ catch�� �� �پ�Ѱ� ���� �� 3���� ��.
				System.out.println("���� ó�� ���� �� 2");
				System.out.println();
			} 
			catch(ArithmeticException e) {
				System.out.println("��� ���� �߻�"); 
				// �� ������ �߰� �ϰ� ������ 9�� �ٿ� a[1]�� �ٲٸ� ��� ����
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 ���� ���� �߻�");
			}
			System.out.println("���� ó�� ���� ��333");
	}
}
