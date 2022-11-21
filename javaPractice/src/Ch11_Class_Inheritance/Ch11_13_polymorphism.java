package Ch11_Class_Inheritance;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}

public class Ch11_13_polymorphism {

	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
//		obj.methodB(); // 에러 발생. 데이터 타입이 부모인 A 클래스 이므로 A에 있는 메서드만 사용가능
		
		B obj1 = new B();
		obj1.methodB(); // 실행가능
		obj1.methodA(); // 실행가능
		
		A obj2 = obj1;	// A 데이터 타입인 obj2 에 B 데이터 타입으로 선언된 obj1 대입.
//		obj2.methodB(); // 데이터 타입이 다르며 상속된 B클래스 타입에 속한 메서드 사용 불가능
		obj2.methodA();
		}
}
