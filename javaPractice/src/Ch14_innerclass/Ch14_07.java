package Ch14_innerclass;
/*
 로컬 내부 클래스의 정의
 
 외부 클래스의 메서드 내에서 정의된 클래스
 메서드 호출 시에 생성되고 복귀하면 소멸
 
 메서드 내에서 인스턴스를 생성해서 사용하므로 메서드 내에서 선언해서 사용하는 지역 변수의 생명 주기가 동일.
 즉, 메서드 호출시에 메모리내에서 생성된 후 복귀하면 메모리에서 소멸 
 --> 위 두 문장은 틀림 !!!!!!!!!!
 
 메서드의 지역변수는 스택 메모리에서 실행되므로 호출 후 복귀하면 소멸.
 하지만 지역 내부 클래스의 객체는 힙에서 실행이 되므로 메서드가 호출이 끝나고 복귀하더라도 살아있음.
 --> 이게 맞는 것!!!!!!! 
 
 로컬 내부 클래스는 프로그래밍에서 거의 사용하지 않음. 이런 내부 클래스가 있다는 정도만 알아두는 정도
 */

class OutClass_03{
	// Runnable 인터페이스를 구현하는 클래스를 지역 내부 클래스로 만든 예제.
	int outNum = 100;
	static int sNum = 200;
	
	// ================================= 지역(local) 내부 클래스 ===============================
	//========================== 메소드 안에 내부 클래스가 존재함 ===================================
	
	Runnable getRunnable(int i) { // 반환형이 Runnable인 
								  // Runnable 인터페이스는 구현할 메소드가 run() 하나 뿐인 함수형 인터페이스
		int num = 100;
		/* 
		 * Runnable 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스로 java.lang 패키지에 선언되어 있으며
		 * 반드시 run() 메서드를 구현해야함.
		 */
		//=================== 메소드 안에 존재하는 내부 클래스 ( 함수가 사라지더라도 메모리는 계속 살아 있음..?!) =====================
		class MyRunnable implements Runnable{
			int localNum =10;

			@Override
			public void run() {
				/* 지역 내부 클래스가 선언된 메서드와 지역변수는 사용하지 못함 */
				// num = 200; // 에러남. 지역변수는 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능
				// i = 100;   // 에러남. 매개변수는 역시 지역변수처럼 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능
				System.out.println("i = " + i); 	// 값은 변경은 못해도 보는 것은 가능 (상수라는 것 -> 상수화되는 것)
				System.out.println("num = " + num); // 값은 변경은 못해도 보는 것은 가능 (상수라는 것 -> 상수화되는 것)
				
				System.out.println("localNum = " + localNum); // localNum은  MyRunnable 안에 있으니 상관 없음.
				
				System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + OutClass_03.sNum + " (외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

public class Ch14_07 {
	public static void main(String[] args) {
		OutClass_03 out = new OutClass_03();
		Runnable runner = out.getRunnable(10);
		runner.run(); // 실제 코드가 객체 안으로 들어가면서 상수로 바뀌는 i와 num..............
	}
}
