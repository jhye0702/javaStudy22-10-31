package Ch14_innerclass;

import Ch14_innerclass.OutClass_02.InStaticClass;

// InnerTest

class OutClass_02 {
	/*
	 정적 내부 클래스 static inner class
	 
	 내부 클래스가 외부 클래스의 생성과 무관하게 사용할 수 있어야 하고, 정적 변수도 사용할 수 있어야 할 때 사용.
	 인스턴스 내부 클래스처럼 외부 클래스 멤버와 같은 위치에 정의하여 static 예약어를 함께 사용
	 */
	
	private int num =  10;
	private static int sNum = 20;
	
	// ==================================== 내부 클래스 ====================================
	
	static class InStaticClass { // static 내부 클래스
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() { // 정적 클래스의 일반 메서드
			// num += 10 ; 	// 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			// 외부 클래스 객체를 생성하지 않고 바로 정적 내부 클래스의 객체 생성할 수 있어서 외부 클래스의 인스턴스 변수 사용을 막음.
			System.out.println("InStaticClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용");
			System.out.println("OutStaticClass sNum = " + sNum + " (외부 클래스의 스태틱 변수 사용");
		}
		static void sTest() {  // 정적 클래스의 static 메서드
			// num += 10; 	 // 외부 클래스의 인스턴스 변수는 사용 할 수 없음.
			// inNum += 10;  // 내부 클래스의 인스턴스 변수는 사용 할 수 없음.
			
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용)");
		}
	}
}

public class Ch14_05 {
	public static void main(String[] args) {
		// 외부 클래스 객체 생성하지 않고 바로 정적 내부 클래스의 객체 생성
		OutClass_02.InStaticClass sInClass = new OutClass_02.InStaticClass();
		
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass_02.InStaticClass.sTest(); // 클래스명을 이용한 방법 (선호) 외부클래스명. 내부클래스명. 내부클래스의 스태틱메소드명
//		InStaticClass.sTest(); // 클래스명을 이용한 방법. 외부 클래스 명을 적지 않은 것도	 가능합니당
//		sInClass.sTest(); //객체를 이용한 방법

	}
	
}
