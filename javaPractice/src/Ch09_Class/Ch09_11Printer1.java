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
	 * Printer ��ü�� �����ϰ� println() �޼��带 ȣ���ؼ� �Ű����� �ֿܼ� ����Ϸ��� �Ѵ�.
	 * println() �޼����� �Ű������� int, boolean, double, String ���� �� �� �ִ�.
	 * Printer Ŭ�������� println() �޼��带 �����϶�.
	 */
	public static void main(String[] args) {
		Printer1 printer = new Printer1();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}
}
