package Ch12_Inheritance_Practice;

/*
 * ������ �Է¹޴� �����ڸ� �����
 * ��� ������ ������ �� �� �ִ� display() ����.
 */

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child4 extends Parent4 {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}	
}

public class Ch12_ex07_Parent4 {

	public static void main(String[] args) {

		Parent4 parent = new Child4();
		Child4 child = new Child4();
		
		// �������� ���� ��!!!! ������ Ÿ������ ������ Ŭ������
		// ���� ���� �켱
		System.out.println("p.x = " + parent.x);// ��� -> p.x = 100
		// �޼ҵ� ���� ���� �� �ּҴ� �ٸ����� ��ü�� ���� �������? �� ������ �� ���� ������°�? �� Ŭ������
		// �������̵� �켱
		parent.method();						// ��� -> Parent Method
		// �������� ���� ��!!!! ������ Ÿ������ ������ Ŭ������
		// ���� ���� �켱
		System.out.println("p.x = " + child.x);	// ��� -> p.x = 100
		// �޼ҵ� ���� ���� �� �ּҴ� �ٸ����� ��ü�� ���� �������? �� ������ �� ���� ������°�? �� Ŭ������
		// �������̵� �켱
		child.method();							// ��� -> Parent Method

	}

}
