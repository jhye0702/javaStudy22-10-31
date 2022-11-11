package Ch08_Method;


public class Ch08_Method07 {
			
		//매개 변수 2개를 사용하는 메서드
		public void print(int a, int b) { 
			int c = a + b;
			System.out.println("결과값 : " + c);
		}
		// 매개 변수로 문자열을 받는 메서드 선언.
		public void print(String str) {
			System.out.println(str);
		}
		public static void main(String[] args) {
			// 변수 선언
			 int num1 = 100;
			 int num2 = 200;
			 int result = 0;
			 
			 // 사용할 메서드가 있는 클래스의 인스턴스 선언
			 Ch08_Method07 method = new Ch08_Method07();
			 // 메서드 호출
			 method.print(10, 20);
//			 method.print(10, 30.0f); // 변수의 타입이 int로 지정되어 있는데 30.0f는 실수형태이기 때문에 오류 생김.
			 method.print(num1, num2);
			 
			 method.print("안녕하세요.");
		}
	}
