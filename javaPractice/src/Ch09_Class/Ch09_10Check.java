package Ch09_Class;

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm
	
	static int cv = 5;	// 클래스 변수
	int iv = 4;			// 인스턴스 변수
	
	static void cm() {	// 클래스 메서드
	}
	void im() {			// 인스턴스 메서드
	}
	static void cm_Imember() {		// 클래스 메서드가 인스턴스 멤버에 접근
		//System.out.println(iv);	// 에러발생
		//im();						// 에러발생
	}
	void im_Cmember() {
		// 인스턴스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	static void cm_Cmember() {
		// 클래스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	void im_Imember() {
		// 인스턴스 메서드가 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}

public class Ch09_10Check {

	public static void main(String[] args) {
		
		// Check.im_Imember();		// 에러 ! Check 클래스에서 im_Imember(인스턴스 메서드)를 호출할 수 없다.
									//		호출하려면 Check의 참조변수(객체) 만들어서 "참조변수.인스턴스메서드"로 이용가능하다.
		Check.cm_Cmember();			//성공
		
		Check myinstance = new Check();
		myinstance.im_Cmember();	//성공
		myinstance.im_Imember();	//성공
	}
	
	
}

