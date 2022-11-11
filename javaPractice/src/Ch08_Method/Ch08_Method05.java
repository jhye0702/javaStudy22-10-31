package Ch08_Method;


public class Ch08_Method05 {
	
	/*
	 * ================= void ===================
	 * 매개변수와 리턴 타입이 없는 메서드
	 */
	
	public void print() {
		System.out.println("메서드를 호출한다");
		// 리턴 타입이 없더라도 return을 사용할 수 있음.
		// 다만 return 다음에 값이 없어야 함.
		// return의 의미는 이 부분에서 메서드 실행을 종료하고 복귀한다는 의미.
		return;
	}
	
	public static void main(String[] args) {
		
		// 리턴은 뒤에 부르는 값을 반환하기도 하지만 메서드를 종료하기도 하는 2가지 역할을 함.
		
		 int a = 1;
		 int b = 2;
		 int result = 0;
		 
		 // 사용할 메서드가 있는 클래스의 인스턴스 선언
		 Ch08_Method05 method = new Ch08_Method05();
		 method.print();
		 method.print();
		 method.print();
		
	}
}
