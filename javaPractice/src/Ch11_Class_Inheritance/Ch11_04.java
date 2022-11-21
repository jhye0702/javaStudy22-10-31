package Ch11_Class_Inheritance;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);		// 
		System.out.println("super.x = " + super.x);		// 상속받았던 부모 클래스의 x
	}
}

public class Ch11_04 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		/*
		 x = 10
		 */
	}

}
