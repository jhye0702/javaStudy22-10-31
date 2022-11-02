package Ch04_Control;

import java.util.Scanner;

public class Ch04_If06max_min {

	public static void main(String[] args) {
		/* 세 정수의 최대값 구하기 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수a 입력: ");
		int a = stdIn.nextInt();
		System.out.print("정수b 입력: ");
		int b = stdIn.nextInt();
		System.out.print("정수c 입력: ");
		int c = stdIn.nextInt();
		
		//------- 최대값 구하기
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println("세 정수 중 최대값은 " + max + "입니다.");
		
		//------- 최소값 구하기
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("세 정수 중 최소값은 " + min + "입니다.");
	}

}
