package Ch08_Method;


public class Ch08_Method17 {
	
	/*
	 * 가변 길이 인자와 일반 인자를 혼합 사용.
	 <사용시 주의점>
	 1. 가변 길이 인자가 제일 오른쪽에 있어야함.
	 2. 동시에 2개의 가변 길이 인자 사용은 안됨. 
	 */
	
	static void test(String name, int ... v) {
		System.out.print(name + " : ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("김성호", 98, 85, 88);
		test("이준호", 90, 95, 92);
		test("박태석", 80, 98, 95);
	}
}
