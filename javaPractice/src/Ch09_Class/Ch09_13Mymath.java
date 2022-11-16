package Ch09_Class;

class MyMath1 {
	int add (int value1, int value2) {
		return value1 + value2;
	}
	int subtract(int value1, int value2) {
		return value1-value2;
	}
	int multiply(int value1, int value2) {
		return value1*value2;
	}
	double divide(double value1, double value2) {
		return value1/value2;
	}
}

public class Ch09_13Mymath {
	/* 클래스 메서드 수정 전 */
	public static void main(String[] args) {

		MyMath1 mm = new MyMath1();
		int result1 = mm.add(5, 3);
		int result2 = mm.subtract(5, 3);
		int result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		// double 대신 int값으로 호출. 이 값은 자동으로 double로 자동 형 변환
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);
		
	}

}

//package Ch09_Class;
//
//class MyMath1 {
//	void add(int value1, int value2) {
//		System.out.println("add(" +value1+ ", " +value2+ ") = " + (value1+value2));
//	}
//	void subtract(int value1, int value2) {
//		System.out.println("subtract(" +value1+ ", " +value2+ ") = " + (value1-value2));
//	}
//	void multiply(int value1, int value2) {
//		System.out.println("subtract(" +value1+ ", " +value2+ ") = " + (value1*value2));
//	}
//	void divide(double value1, double value2) {
//		System.out.println("subtract(" +value1+ ", " +value2+ ") = " + (value1/value2));
//	}
//}
//
//public class Ch09_13Mymath {
//
//	public static void main(String[] args) {
//
//		MyMath1 mm = new MyMath1();
//		mm.add(5, 3);
//		mm.subtract(5, 3);
//		mm.multiply(5, 3);
//		mm.divide(5, 3);
//	}
//
//}
