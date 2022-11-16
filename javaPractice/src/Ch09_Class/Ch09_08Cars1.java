package Ch09_Class;

class Cars {
	static int wheel = 4;	// 클래스 변수 (인스턴스 생성 전에 미리 올라가 있다)
	int speed;				// 인스턴스 변수
}

public class Ch09_08Cars1 {
	/*
	 * 인스턴스 변수는 각각의 인스턴스마다 고유의 저장 공간을 가지고 있기 때문에 별개의 조정이 가능
	 * 클래스 변수는
	 * 1) 하나의 저장 공간을 모든 인스턴스가 함께 공유하기 때문에
	 * 	  하나의 참조변수로 값을 변경하더라도 모든 인스턴스의 값이 변하게 됨
	 * 2) 인스턴스 생성 전에 접근 가능하기 때문에 클래스 이름으로 접근이 됨
	 */

	public static void main(String[] args) {

		System.out.println(Cars.wheel);		// 클래스 이름으로 변수 접근 가능
		// System.out.println(Cars.speed);	// 에러 발생! 인스턴스 변수 접근 불가
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);	// 인스턴스 생성 후에는 접근 가능
		
		Cars myCar2 = new Cars();
		
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed: " + myCar1.speed);	//0
		System.out.println("myCar2.speed: " + myCar2.speed);	//0
		System.out.println("myCar1.wheel: " + myCar1.wheel);	//4
		System.out.println("myCar2.wheel: " + myCar2.wheel);	//4
		
		myCar2.speed = 100;
		myCar2.wheel = 5; // wheel은 static이니까 공통으로 가지는 요소. myCar2 하나의 값을 변경하더라도 공통으로 값이 변경됨.
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed: " + myCar1.speed);	//0
		System.out.println("myCar2.speed: " + myCar2.speed);	//100
		System.out.println("myCar1.wheel: " + myCar1.wheel);	//5
		System.out.println("myCar2.wheel: " + myCar2.wheel);	//5
		
	}

}
