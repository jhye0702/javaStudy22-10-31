package Ch11_Class_Inheritance;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;
	
	void method() {
		int x = 30;	// ��������
		System.out.println("x = " + x);					// x = 30. �����Ȱ� ��� ���� ����� ������ ������ �� ��������
		System.out.println("this.x = " + this.x);		// this.x = 20. ��ü ����
		System.out.println("super.x = " + super.x);		// super.x = 10. ��ӹ޾Ҵ� �θ� Ŭ���� ����
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
