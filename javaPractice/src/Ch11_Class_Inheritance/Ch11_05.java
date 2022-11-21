package Ch11_Class_Inheritance;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;
	
	void method() {
		int x = 30;	// 지역변수
		System.out.println("x = " + x);					// x = 30. 지정된게 없어서 가장 가까운 곳에서 선언이 된 지역변수
		System.out.println("this.x = " + this.x);		// this.x = 20. 객체 기준
		System.out.println("super.x = " + super.x);		// super.x = 10. 상속받았던 부모 클래스 기준
	}
}

public class Ch11_05 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();
		/*
		 x = 30
		this.x = 20
		super.x = 10
		 */
	}

}
