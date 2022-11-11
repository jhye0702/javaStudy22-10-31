package Ch08_Method;


public class Ch08_Method14_Overloading {
	/*
	 * ====================== 메서드 오버로딩 ===========================
	 * C, 파이썬 없음.
	 * 매개변수의 타입 혹은 갯수가 다르면 같은 이름을 가진 메서드를 재정의 할 수 있음.
	 * 
	 * C++, 파이썬에 있는 기본값 기능은 자바에 없음.
	 */
	public static void main(String[] args) {
		printGreet(); // 안녕하세요
		printGreet("안녕~!"); // 안녕~!
		printGreet("한수", "잘 지내셨나요?"); // 한수님! 잘 지내셨나요?
		printGreet(3);
	}
	public static void printGreet() {
		System.out.println("printGreet() 메서드가 실행됩니다.");
		System.out.println("안녕하세요");
	}
	public static void printGreet(String greeting) {
		// 같은 이름의 메서드가 있으나 매개변수가 없음
		System.out.println("printGreet(String greeting) 메서드가 실행됩니다.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) {
		// 매개변수가 문자열인 메서드가 있으나 갯수가 다름
		System.out.println("printGreet(String name, String greeting) 메서드가 실행됩니다.");
		System.out.println(name + "님! " + greeting);
	}
	public static void printGreet(int cnt) {
		// 매개변수가 하나인 메서드가 있으나 데이터 타입이 다름
		System.out.println("printGreet(int cnt) 메서드가 실행됩니다");
		System.out.println("안녕하세요. " + cnt + "번째 보는거네요.");
	}
}
