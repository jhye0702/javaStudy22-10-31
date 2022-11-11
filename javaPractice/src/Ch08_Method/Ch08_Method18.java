package Ch08_Method;


public class Ch08_Method18 {
	
	/*
	 * 메서드 내에서의 메서드 호출
	 * 메서드에서 다른 메서드를 호출하면 메서드는 동작을 멈추고, 다른 메서드가 종료 할 때까지 기다림.
	 * 호출한 메서드가 종료가 되면 나머지 코드가 실행이 됨.
	 */
	
	// main() -> firstMethod() -> secondMethod()
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)가 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)가 끝났음.");	
	}
	static void firstMethod() {
		System.out.println("firstMethod()가 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()가 끝났음.");
	}
	static void secondMethod() {
		System.out.println("secondMethod()가 시작되었음.");
		System.out.println("secondMethod()가 끝났음.");
	}
}
