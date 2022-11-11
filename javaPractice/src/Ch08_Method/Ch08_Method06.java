package Ch08_Method;


public class Ch08_Method06 {
	
		/*
		 * 매개 변수가 있는 메서드.
		 * 매개 변수는 메서드 호출시 메모리에 생성되고, 호출 후 복귀 시 소멸
		 * 
		 * 추가로 여기서 main 안에 있는 int a 와 그 위에 있는 메서드의 int a는 변수명이 같지만 오류가 뜨지 않는다.
		 * 이러한 이유는 for문 때와 마찬가지로 변수가 속하는 중괄호 안에서만 유효하므로 
		 * 서로 다른 영역에 있는 것이라고 생각하면.. 됨?
		 */
		
		public void print(int a) { // return값이 따로 없기 때문에 void가 사용됨..?
			System.out.println("결과값 : " + a);
		}
		
		public static void main(String[] args) {
			
			 int a = 11;
			 int b = 22;
			 int result = 0;
			 
			 // 사용할 메서드가 있는 클래스의 인스턴스 선언
			 Ch08_Method06 method = new Ch08_Method06();
			 method.print(10);
			 method.print(b);
			 method.print(result);
			
		}
	}
