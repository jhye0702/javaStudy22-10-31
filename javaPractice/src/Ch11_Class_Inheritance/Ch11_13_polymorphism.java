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
//		obj.methodB(); // ���� �߻�. ������ Ÿ���� �θ��� A Ŭ���� �̹Ƿ� A�� �ִ� �޼��常 ��밡��
		
		B obj1 = new B();
		obj1.methodB(); // ���డ��
		obj1.methodA(); // ���డ��
		
		A obj2 = obj1;	// A ������ Ÿ���� obj2 �� B ������ Ÿ������ ����� obj1 ����.
//		obj2.methodB(); // ������ Ÿ���� �ٸ��� ��ӵ� BŬ���� Ÿ�Կ� ���� �޼��� ��� �Ұ���
		obj2.methodA();
		}
}
