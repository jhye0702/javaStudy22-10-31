package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch04_WhileEX01 {

	public static void main(String[] args) {
		/*
		 * for���� while������ ����
		 */
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		// while���� �ʱⰪ, ���ǽ�, �������� ����
		num = 1;
		sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1 ~ 10�� �� : " + sum);
	
		}
	}
