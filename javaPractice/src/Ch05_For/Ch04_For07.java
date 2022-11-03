package Ch05_For;

import java.util.Scanner;

public class Ch04_For07 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요
			   *
			  **
			 ***
			****
		 */
		// =========== 방법 1
//		for (int i = 1; i <= 4; i++) { // 세로로 4줄이니까 4번
//			for (int j = 4; j > 0; j-- ) { 
//				if (i < j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		// =========== 방법 2
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
