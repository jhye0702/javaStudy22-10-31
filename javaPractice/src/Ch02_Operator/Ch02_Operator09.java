package Ch02_Operator;

public class Ch02_Operator09 {

	public static void main(String[] args) {
		
		// 대입 연산자
		
		int a = 3;
		int b = 5;
		
		System.out.println(b);	// 5
		b = a;
		System.out.println(b);	// 3
		
		System.out.println(a);	// 3
		a += 1; // a = a + 1
		System.out.println(a);	// 4
		a /= 2; // a = a / 2
		System.out.println(a);	// 2
		a *= 2; // a = a * 2
		System.out.println(a);	// 4
	}

}
