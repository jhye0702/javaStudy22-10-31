package Ch12_Inheritance_Practice;

/*
 * ������ �Է¹޴� �����ڸ� �����
 * ��� ������ ������ �� �� �ִ� display() ����.
 */

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	
}

public class Ch12_ex07_Parent3 {

	public static void main(String[] args) {

		Parent3 parent = new Child3();
		Child3 child = new Child3();
		
		System.out.println("p.x = " + parent.x);// ��� -> p.x = 100
		parent.method();						// ��� -> Parent Method
		System.out.println("p.x = " + child.x);	// ��� -> p.x = 100
		child.method();							// ��� -> Parent Method

	}

}
