package Ch05_For;

import java.util.Scanner;

public class Ch05_For06 {

	public static void main(String[] args) {
		/*
		 * for���� �̿��ؼ� ������ ���� *�� ����ϴ� �ڵ带 �ۼ��غ�����
		 * 1. ����� �� : 4��
		 * 2. ��� �� �ٹٲ� �ʿ�
			*
			**
			***
			****
		 */
		
		for (int i = 1; i <= 4; i++) { // ���η� 4���̴ϱ� 4��
			for (int j = 1; j <= i; j++ ) { // ���η� ���� ������ ������? 4����. 4=i
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
