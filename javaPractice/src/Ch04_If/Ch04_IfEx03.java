package Ch04_If;

import java.util.Scanner;

public class Ch04_IfEx03 {

	public static void main(String[] args) {
		/*
		 * ����ڿ��� ������ �Է¹޾�
		 * if���� ����ؼ� ������ ����ϴ� �ڵ带 �ϼ��ϼ���.
		 * �Է��� 0~100���� �Է��� �˴ϴ�.
		 * ������ �Ʒ��� �����ϴ�.
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 89
		 * D : 70 ~ 79
		 * F : 0 ~ 59
		 */
		
		Scanner num = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int grade = num.nextInt();
		
		if (grade >= 90) {
			System.out.println("A �Դϴ�.");
		}
		else if (grade >= 80) {
			System.out.println("B �Դϴ�.");
		}
		else if (grade >= 70) {
			System.out.println("C �Դϴ�.");
		}
		else if (grade >= 60) {
			System.out.println("D �Դϴ�.");
		}
		else {
			System.out.println("F �Դϴ�.");
		}
	}

}
