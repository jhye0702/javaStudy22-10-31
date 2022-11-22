package Ch12_Inheritance_Practice;

/*
 * ������ �Է¹޴� �����ڸ� �����
 * ��� ������ ������ �� �� �ִ� display() ����.
 */

class Parent5 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;
	void method() {
		System.out.println("x = " + x);				// this.x �� ����. �ƹ��͵� �Ⱥٿ����� ���� ���� �� ���
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class Ch12_ex07_Parent5 {

	public static void main(String[] args) {

		Parent5 parent = new Child5();
		Child5 child = new Child5();
		
		// �������� ���� ��!!!! ������ Ÿ������ ������ Ŭ������
		// ���� ���� �켱
		System.out.println("p.x = " + parent.x);// ��� -> p.x = 100
		// �޼ҵ� ���� ���� �� �ּҴ� �ٸ����� ��ü�� ���� �������? �� ������ �� ���� ������°�? �� Ŭ������
		// �������̵� �켱
		parent.method();	
		System.out.println();
		// ��� -> Parent Method
		// �������� ���� ��!!!! ������ Ÿ������ ������ Ŭ������
		// ���� ���� �켱
		System.out.println("p.x = " + child.x);	// ��� -> p.x = 100
		// �޼ҵ� ���� ���� �� �ּҴ� �ٸ����� ��ü�� ���� �������? �� ������ �� ���� ������°�? �� Ŭ������
		// �������̵� �켱
		child.method();							// ��� -> Parent Method

	}

}
