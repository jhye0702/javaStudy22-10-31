package Ch12_Inheritance_Practice;

/*
 * 원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스를 작성해보자.
 */

class Circle {
	protected int radius;				// 반지름
	public Circle (int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle {
	private String name;				// 피자 종류
	
	Pizza(String name, int radius) {
		super(radius);
		this.name = name;
	}
	
	public void print() {
		System.out.println("피자의 종류 : " + name + ", 피자의 크기 : " + (radius * 2));
	}
	
}

public class Ch12_ex02_Circle {

	public static void main(String[] args) {
		Pizza pizza = new Pizza ("Pepperoni", 10);
		pizza.print();	// 출력 -> 피자의 종류 : Peperoni, 피자의 크기 : 20
	}

}
