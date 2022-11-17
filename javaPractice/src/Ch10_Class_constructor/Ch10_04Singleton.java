package Ch10_Class_constructor;

public class Ch10_04Singleton {

	public static void main(String[] args) {

		
		//생성자의 접근 제한자가 private여서 실행이 안됨.
		// Singleton singleton1 = new Singleton(); // 컴파일 에러
		// Singleton singleton2 = new Singleton(); // 컴파일 에러
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}
