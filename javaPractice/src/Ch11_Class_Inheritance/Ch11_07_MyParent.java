package Ch11_Class_Inheritance;

class MyParent{
	public void pDisplay(){
		System.out.println("Super: Parent's Display");
	}
}
class MyChild extends MyParent {

	// 상위 클래스의 메서드를 재정의 한다.
	@Override
	public void pDisplay() {
		// 은닉된 상위 클래스의 메서드를 super로 호출한다.
		super.pDisplay();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
	
}

public class Ch11_07_MyParent {

	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.pDisplay(); 		// 재정의 된 하위 클래스의 메서드를 호출한다.
		c.cDisplay();
		/*
		Super: Parent's Display
		Sub Class: Parent's Display
		 */
	}

}
