package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEx05 {

	public static void main(String[] args) {

		/*
		 * ������ �Էµ� ������,
		 * ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
		 * while���� ���, break ������� �� ��
		 */
		
//		int sum = 0;
//		boolean run = true;
//		
//		while (run) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("������ �Է��ϼ��� : ");
//			int num = scanner.nextInt();
//			if( num >= 0 ) {
//				sum += num;
//			}
//			else {
//				run = false;
//				System.out.println("�Է��� �������� �� : " + sum);
//			}
//		}

		// ============================== ������ �ڵ�
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int value = 0;
		// while���� ������ 1) ó���� ���� �Ǿ�� �ϰ� 2) �տ� ������ ��ġ�� �ʾƾ���.
		while (value >= 0) {
			sum += value;
			System.out.print("������ �Է��ϼ���: ");
			value = scanner.nextInt();
		}
		System.out.println("������ �հ�� " + sum + "�Դϴ�.");
		
		
	}
}
