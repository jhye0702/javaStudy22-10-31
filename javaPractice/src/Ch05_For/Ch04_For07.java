package Ch05_For;

import java.util.Scanner;

public class Ch04_For07 {

	public static void main(String[] args) {
		/*
		 * for���� �̿��ؼ� ������ ���� *�� ����ϴ� �ڵ带 �ۼ��غ�����
			   *
			  **
			 ***
			****
		 */
		// =========== ��� 1
//		for (int i = 1; i <= 4; i++) { // ���η� 4���̴ϱ� 4��
//			for (int j = 4; j > 0; j-- ) { 
//				if (i < j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		// =========== ��� 2
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (4-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
