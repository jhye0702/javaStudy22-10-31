package Ch05_For;

import java.util.Scanner;

public class Ch04_For05 {

	public static void main(String[] args) {
		/*
		 * for���� �̿��ؼ� 1���� 100������ ���� �߿���
		 * 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��� ������.
		 */
		
		// ����ȭ ��Ű�� =>
		// for�� ������ i �� 1���� 100���� �������� �Ѵ�.
		// 3�� ����϶��� ����� �غ���.
		// ����� 3�� ������� ���� ���غ���.
		
		// 1��° ���
		
//		int sum = 0;
//		for (int i = 1; i<=100; i++) {
//			if ( i % 3 == 0 ) {
//				sum += i;
//			}
//		}
//		System.out.println("3�� ����� ������ " + sum);
		
		
		// 2��° ���  ->  �ݺ�Ƚ���� ������ŭ �ý��� �۾��� �پ�� ��������� �� ���� �ڵ��� Ī��.
		int sum = 0;
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("3 ����� ��: " + sum);
	}
}
