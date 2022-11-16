package Ch09_Class;

class Printer1{
	void println(int value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(String value) {
		System.out.println(value);
	}
}

public class Ch09_11Printer1 {
	/*
	 * Printer 객체를 생성하고 println() 메서드를 호출해서 매개값을 콘솔에 출력하려고 한다.
	 * println() 메서드의 매개값으로 int, boolean, double, String 값을 줄 수 있다.
	 * Printer 클래스에서 println() 메서드를 선언하라.
	 */
	public static void main(String[] args) {
		Printer1 printer = new Printer1();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}
}
