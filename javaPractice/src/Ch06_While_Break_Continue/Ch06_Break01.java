package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_Break01 {

	public static void main(String[] args) {
		/*
		 * while, break�� ����Ͽ� ����ڰ� �Է��� �������� ����� ���� ���α׷��� �ۼ��մϴ�.
		 * ���� ����ڰ� ������ �Է��ϸ� break�� ���Ͽ� �ݺ� ������ ����ǰ� �մϴ�.
		 */
		
		Scanner scanner = new Scanner(System.in);
		// ���� �� Ǯ��
//		int grade;
//		int count = 0;
//		int sum = 0;
//		double avg = 0;
//		
//		while (true) {
//			System.out.print("������ �Է��ϼ��� : ");
//			grade = scanner.nextInt();
//			if (grade < 0) {
//				break;
//			}
//			sum += grade;
//			count++;
//		}
//		avg = sum/count;
//		System.out.println("��� ������ " +avg+ "�Դϴ�");
		
		// �������� �Ͻ� ��
		int count = 0;
		int total = 0;
		
		while (true) {
			System.out.print("������ �Է��ϼ��� : ");
			int grade = scanner.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count++;
		}
		System.out.println("��� ���� : " + total / (double)count );

	}
}

// �ڵ带 ©�� ���� ª�� ���� ����!