package Ch12_Inheritance_Practice;

/*
 * 점수를 입력받는 생성자를 만들고
 * 모든 과목의 점수를 볼 수 있는 display() 생성.
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
		
		System.out.println("p.x = " + parent.x);// 출력 -> p.x = 100
		parent.method();						// 출력 -> Parent Method
		System.out.println("p.x = " + child.x);	// 출력 -> p.x = 100
		child.method();							// 출력 -> Parent Method

	}

}
