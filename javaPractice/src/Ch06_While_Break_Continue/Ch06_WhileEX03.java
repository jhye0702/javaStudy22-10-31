package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEX03 {

	public static void main(String[] args) {
		/*
		 * 반복문을 빠져나오는 방법은
		 * 1) 조건식이 false가 되거나
		 * 2) break문이 실행
		 * break문은 반복을 멈추게 함
		 * 반복문이 진행되다가 break문을 만나면 곧바로 반복문을 벗어나서
		 * 반복문 다음의 코드를 수행!
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) { //조건이 true라서 종료해주는 부분이 없으면 무한 반복되므로 break로 종료시켜야함
			System.out.print("더할 숫자를 입력하세요 (종료하려면 0 입력) : ");
			num = scanner.nextInt(); // 정수 입력받아서 i에 저장
			if (num == 0) { // 만약 0을 입력하였다면 종료
				break;
			}
			sum += num; //입력받은 값 더해주기 
			// 위에서 break를 만나면 여기는 거치지 않고
			// while문 아예 밖으로 빠져나가 버린다.
		}
		System.out.println("현재까지의 총합 = " +sum);
		
		
	}
}
