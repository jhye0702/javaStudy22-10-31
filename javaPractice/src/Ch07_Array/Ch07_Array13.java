package Ch07_Array;

import java.util.Scanner;

public class Ch07_Array13 {

	public static void main(String[] args) {

		/*
		 * Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�
		 * ���� ����� ���� �˸°� �ۼ��غ�����
		 */
		
		boolean run = true; // �ݺ����� �������� ��� -> ���� false�� �ȴٸ� �ݺ����� ����
		int studentNum = 0; // �л���
		int[] scores = null; // ������ �Է� ���� �� �迭 ����. ����ڿ��� �Է¹��� �л����� �������� �迭 ����
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------");
			System.out.print("���� > ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				// �л� ���� �Է� �޾Ƽ� �迭 ����
				System.out.print("�л� �� �Է� : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				// ������ �迭�� ������ŭ ���� �Է�
				for( int i = 0; i < scores.length; i++ ) {
					System.out.print("scores[" +i+ "] >");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				// �Է¹��� �迭�� ���� ���
				for( int i = 0; i < scores.length; i++ ) {
				System.out.println( "scores[" +i+ "] :" + scores[i] );
				}
			} else if (selectNo == 4) {
				// �ְ� ����, ��� ���� ���
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ������ " + max );
				System.out.println("����� " + avg  );
			} else if (selectNo == 5) {
				// run�� ����
				run = false;
			}
		}
		System.out.print("���α׷� ����");
		

		
	}
}
