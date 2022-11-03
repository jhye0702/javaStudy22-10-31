package Ch05_For;

import java.util.Scanner;

public class Ch05_For02 {

	public static void main(String[] args) {
		/*
		 * for문
		 * 
		 */
		
		int sum = 0; 
		// 총 합을 담을 변수 sum, 0을 안정해주면 sum에다가 i를 더해야하는데 아무것도 없는데다가 숫자를 더할 수 없기 때문
		for (int i = 1; i<=10; i++) {
			System.out.println("i=" + i + ", sum = " + (sum += i));
		}
	}


}
