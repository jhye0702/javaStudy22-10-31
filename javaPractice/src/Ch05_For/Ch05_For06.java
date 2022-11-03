package Ch05_For;

import java.util.Scanner;

public class Ch05_For06 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요
		 * 1. 출력할 것 : 4줄
		 * 2. 출력 후 줄바꿈 필요
			*
			**
			***
			****
		 */
		
		for (int i = 1; i <= 4; i++) { // 세로로 4줄이니까 4번
			for (int j = 1; j <= i; j++ ) { // 가로로 별이 어디까지 찍히나? 4까지. 4=i
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
