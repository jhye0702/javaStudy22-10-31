package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method03 {
	/*
	 세 정수 값의 최대값을 구하기 (메소드 이용)
	 이전 예제에서 만들어진 메소드를 재활용
	 */
	
	/* 메서드는
	 1) 어떤 입력을 받아 2) 특정 연산을 수행한 뒤 3) 결과를 반환하는 기능
	 
	 메서드 용어 정리
	 	1. 메서드 정의 : 메서드를 새로 만드는 것을 의미
	 	2. 인수 : 메서드에 전달할 입력(input)을 의미. argument
	 	3. 매개변수 : 인수를 받아서 저장하는 변수를 의미. parameter
	 	4. 반환값 : 메서드의 출력(output)을 의미. return
	 	5. 메서드 호출 : 메서드를 실제로 사용하는 것을 의미
	 */
	
	/* 
	 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수,
	 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능
	 */
	
	static int max ( int a, int b, int c ) { // a, b, c 의 최대값을 반환
		int max = a;
		if ( b > max ) max = b;
		if ( c > max ) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();

		System.out.println("최대값은 " + max(a, b, c) + "입니다.");

	}

}
