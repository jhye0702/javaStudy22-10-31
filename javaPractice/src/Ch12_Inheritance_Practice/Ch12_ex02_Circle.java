package Ch12_Inheritance_Practice;

/*
 * ���� ��Ÿ���� Circle Ŭ������ ��ӹ޾Ƽ� ���ڸ� ��Ÿ���� Pizza Ŭ������ �ۼ��غ���.
 */

class Circle {
	protected int radius;				// ������
	public Circle (int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle {
	private String name;				// ���� ����
	
	Pizza(String name, int radius) {
		super(radius);
		this.name = name;
	}
	
	public void print() {
		System.out.println("������ ���� : " + name + ", ������ ũ�� : " + (radius * 2));
	}
	
}

public class Ch12_ex02_Circle {

	public static void main(String[] args) {
		Pizza pizza = new Pizza ("Pepperoni", 10);
		pizza.print();	// ��� -> ������ ���� : Peperoni, ������ ũ�� : 20
	}

}
