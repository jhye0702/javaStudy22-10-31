package Ch06_While_Break_Continue;

public class Ch04_Continue01 {

	public static void main(String[] args) {
		/*
		 * Continue��
		 * 0~100������ Ȧ���� ����
		 */

		int total = 0;
		int num;
		// ==================if���� continue ����Ͽ� �ڵ�
		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;
			}
			total += num;
			
			/* continue ���� �ϴ� ���
			 if (num % 2 == 1) {
			 	total += num;
			 }
			 */
		}
		System.out.println("1���� 100������ Ȧ���� ���� " + total + "�Դϴ�");
	
		// ==================for�� ������ �ڵ� (���ǽĿ��� num�������� �ٲ۴�)
//		for (num = 1; num <= 100; num+=2) {
//			total += num;
//		}
//		System.out.println("1���� 100������ Ȧ���� ���� " + total + "�Դϴ�");
	
	}
}
