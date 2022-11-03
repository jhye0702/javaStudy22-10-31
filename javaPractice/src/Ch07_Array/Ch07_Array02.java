package Ch07_Array;

import java.util.Scanner;

public class Ch07_Array02 {

	public static void main(String[] args) {
		/* array의 숫자를 입력받아서 숫자의 합을 구해보세요 */
		
		
		// 배열 인덱스만 이용하는 방법
//		Scanner scanner = new Scanner(System.in);
//		int[] numbers = new int[4];
//		int sum;
//		
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		numbers[0] = scanner.nextInt();
//		System.out.print("2번째 숫자를 입력하세요 : ");
//		numbers[1] = scanner.nextInt();
//		System.out.print("3번째 숫자를 입력하세요 : ");
//		numbers[2] = scanner.nextInt();
//		System.out.print("4번째 숫자를 입력하세요 : ");
//		numbers[3] = scanner.nextInt();
		
		
		
		// for문 이용하는 방법
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[4];
		int sum=0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			array[i] = scanner.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
		}
		System.out.println("합계 ==> " + sum);
		scanner.close();
	}
}
