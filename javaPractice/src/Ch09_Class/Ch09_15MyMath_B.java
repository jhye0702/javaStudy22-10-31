package Ch09_Class;

/*
 * 변수의 범위 및 클래스 메서드와 인스턴스 메서드의 오버로딩
 * 오버 로딩의 경우 
 * 매개변수의 타입과 갯수로 결정이 되기 때문에 static과는 별개임
 */

class MyMath_B {
	int a, b;
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	int add() {
		System.out.println("add() 실행");
		return a + b;
	} // a, b는 인스턴스 변수
	int subtract() {
		return a - b;
	}
	int multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능 // a, b는 지역변수
	static int add (int a, int b) {
		System.out.println("static add() 실행");
		return a + b;
	}
	static int subtract (int a, int b) {
		return a - b;
	}
	static int multiply (int a, int b) {
		return a * b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
	

}

public class Ch09_15MyMath_B {
	public static void main(String[] args) {
		System.out.println(MyMath_B.add(200, 100)); 		// 300
		System.out.println(MyMath_B.subtract(200, 100)); 	// 100
		System.out.println(MyMath_B.multiply(200, 100));	// 20000
		System.out.println(MyMath_B.divide(200.0, 100.0)); 	// 2.0
		
		MyMath_B mm = new MyMath_B();
		mm.a = 200;
		mm.b = 100;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());		// 300
		System.out.println(mm.subtract());	// 100
		System.out.println(mm.multiply());	// 20000
		System.out.println(mm.divide());	// 2.0
		
		/*
		 * 메인 메서드를 통해 확인 할 수 있는것
		 * 클래스에서 같은 함수명으로 오버로딩이 된다
		 * 오버로딩까지 해서 총 메서드 4개가 나온다.
		 * 오버로딩 될때는 static이 있는 것과 없는 것이 나올 것이다.
		 */
		
	}
}
