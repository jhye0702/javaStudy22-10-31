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
	 * ���� �������� Printer Ŭ������ �����ϰ� println() �޼��带 �����ߴ�.
	 * Printer ��ü�� �������� �ʰ� �Ʒ��� ���� ȣ���� �� �ֵ���
	 * Printer Ŭ������ �����϶�
	 */

	public static void main(String[] args) {
			printer.println(10);
			printer.println(true);
			printer.println(5.7);
			printer.println("ȫ�浿");
	}
}
