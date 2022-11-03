package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch04_While02 {

	public static void main(String[] args) {
		/*
		 * 중첩 while, 구구단 출력
		 */
		
		int i = 2;
		while (i <= 9) {
			System.out.println("*** " + i + "단 ***");
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
