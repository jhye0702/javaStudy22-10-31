package Ch08_Method;


public class Ch08_Method15_Overloading {
	
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰 수는 " + max(a, b, c) + "입니다.");
		System.out.println(a + ", " + b + " 중에 제일 큰 수는 " + max(a, b) + "입니다.");
	}
	static int max(int a, int b, int c) { // a, b, c 의 최대값을 반환
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	static int max(int a, int b) { // a, b 의 최대값을 반환
		int max = a;
		if (b > max) max = b;
		return max;
	}
}
