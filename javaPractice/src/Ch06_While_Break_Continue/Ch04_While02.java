package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch04_While02 {

	public static void main(String[] args) {
		/*
		 * ��ø while, ������ ���
		 */
		
		int i = 2;
		while (i <= 9) {
			System.out.println("*** " + i + "�� ***");
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			System.out.println();
			i++;
		}//end of while (i<=9)
	}
}
