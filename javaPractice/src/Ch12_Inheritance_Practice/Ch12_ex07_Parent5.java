package Ch12_Inheritance_Practice;

/*
 * 점수를 입력받는 생성자를 만들고
 * 모든 과목의 점수를 볼 수 있는 display() 생성.
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
		System.out.println("x = " + x);				// this.x 와 같다. 아무것도 안붙였을때 가까운데 붙인 값 출력
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class Ch12_ex07_Parent5 {

	public static void main(String[] args) {

		Parent5 parent = new Child5();
		Child5 child = new Child5();
		
		// 변수명이 같을 때!!!! 데이터 타입으로 지정된 클래스의
		// 참조 변수 우선
		System.out.println("p.x = " + parent.x);// 출력 -> p.x = 100
		// 메소드 명이 같을 때 주소는 다르지만 객체를 뭘로 만들었나? 집 구조를 뭘 토대로 만들었는가? 그 클래스의
		// 오버라이딩 우선
		parent.method();	
		System.out.println();
		// 출력 -> Parent Method
		// 변수명이 같을 때!!!! 데이터 타입으로 지정된 클래스의
		// 참조 변수 우선
		System.out.println("p.x = " + child.x);	// 출력 -> p.x = 100
		// 메소드 명이 같을 때 주소는 다르지만 객체를 뭘로 만들었나? 집 구조를 뭘 토대로 만들었는가? 그 클래스의
		// 오버라이딩 우선
		child.method();							// 출력 -> Parent Method

	}

}
