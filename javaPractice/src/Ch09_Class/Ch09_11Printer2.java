package Ch09_Class;

class printer {
	static void println(int value) {
		System.out.println(value);
	}
	static void println(boolean value) {
		System.out.println(value);
	}
	static void println(double value) {
		System.out.println(value);
	}
	static void println(String value) {
		System.out.println(value);
	}
}

public class Ch09_11Printer2 {
	/*
	 * 이전 문제에서 Printer 클래스를 생성하고 println() 메서드를 생성했다.
	 * Printer 객체를 생성하지 않고 아래와 같이 호출할 수 있도록
	 * Printer 클래스를 수정하라
	 */

	public static void main(String[] args) {
			printer.println(10);
			printer.println(true);
			printer.println(5.7);
			printer.println("홍길동");
	}
}
