package Ch06_While_Break_Continue;

import java.util.Random;
import java.util.Scanner;

public class Ch06_WhileEx06 {

	public static void main(String[] args) {

		/*
		 ���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����.
		 1) 1���� 1000 ������ ���� �ϳ��� �����Ѵ�.
		 2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�.
		 3) ������ �ƴ� ��� ������ �Է��� ������ ū�� Ȥ�� ������ �˷��ش�.
		 4) ������ ���, ���� �޽��� �� �õ� Ƚ�� ����� ��.
		 
		 ������ �����Ͽ� ���ÿ� : 500
		 ������ ������ �����ϴ�.
		 ������ �����Ͽ� ���ÿ� : 250
		 ������ ������ �����ϴ�.
		 .
		 .
		 .
		 �����մϴ�. �õ�Ƚ�� = 8
		 */
		Scanner scanner = new Scanner(System.in);
		int answer; // ���� �Է��� ����
		int guess; // ������� ������ �Է¹��� ����
		int count = 0; 
		
		// 1) 1���� 1000������ ���� �ϳ��� ����
		// answer = (int)(Math.random() * 1000) + 1;
		
		// util.Random ���.
		
		// int nextInt(int n)  int Ÿ�� 0 ~ �Ű��������� ������ �����մϴ�.
		Random random = new Random();
		answer = random.nextInt(999) + 1;
		// System.out.println(answer);
		
		// ======================================= ����� if������ Ǯ��
//		while(true) {
//			count++;
//			// 2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�.
//			System.out.print("������ �����Ͽ� ���ÿ�: ");
//			guess = scanner.nextInt();
//			
//			// 3) ������ �ƴ� ��� ������ �Է��� ������ ū�� Ȥ�� ������ �˷��ش�
//			if (guess < answer) {
//				System.out.println("������ ������ �����ϴ�");
//			}
//			else if (guess > answer) {
//				System.out.println("������ ������ �����ϴ�");
//			}
//			else {
//				// 4) ������ ���, ���� �޼��� �� �õ� Ƚ���� ����� ��
//				System.out.println("�����մϴ�. �õ�Ƚ�� = " + count);
//				break;
//			}
//		}
		
		
		// ===================================== ����� do while�� Ǯ��
		
		do {
			count++;
			// 2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�.
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = scanner.nextInt();
			
			// 3) ������ �ƴ� ��� ������ �Է��� ������ ū �� Ȥ�� ������ �˷��ش�.
				if ( guess < answer) {
					System.out.println("������ ������ �����ϴ�");
				}
				else if (guess > answer) {
				System.out.println("������ ������ �����ϴ�");
				}
		} while (guess != answer);
		//4) ������ ���, ���� �޼��� �� �õ� Ƚ�� ����ϱ�
		System.out.println("�����մϴ�! �õ�Ƚ�� = " + count);
		
		
		
		
//		Random random = new Random();
//		int answer = random.nextInt(999) + 1;
//		
//		int count = 0;
//		
//		
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("������ �����Ͽ� ������ : ");
//			int num = sc.nextInt();
//			count++;
//			if(num > answer) {
//				System.out.println("������ ������ ���亸�� Ů�ϴ�.");
//				System.out.println();
//			}
//			else if (num < answer) {
//				System.out.println("������ ������ ���亸�� �۽��ϴ�");
//				System.out.println();
//			}
//			else {
//				break;
//			}
//		}
//		System.out.println("�����մϴ�. �õ�Ƚ��: " + count);
		
		
		
		
	}
}
