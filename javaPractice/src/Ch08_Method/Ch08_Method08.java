package Ch08_Method;


public class Ch08_Method08 {
			
		/*
		 * 리턴 타입이 있는 메서드
		 */
		public int add(int a, int b) { // public 뒤에 선언된 int 메서드의 리턴 타입과
			int c = a + b;
			return c;					// 결과로 반환할 c의 데이터형이 int로 동일해야함.
			// return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야함.
			// return 3.5; // 리턴 타입과 다른 데이터형을 반환하면 오류가 발생
			
		}

		public static void main(String[] args) {
			// 변수 선언
			 int num1 = 50;
			 int num2 = 100;
			 int result = 0;
			 
			 // 사용할 메서드가 있는 클래스의 인스턴스 선언
			 Ch08_Method08 method = new Ch08_Method08();
			 result = method.add(num1, num2);
			 
			 System.out.println("두 수의 합은 " + result); // 메서드의 반환 값을 저장해서 출력
			 System.out.println("두 수의 합은 " + method.add(num1, num2)); // 메서드의 반환 값을 바로 출력
			 
			 
		}
	}
