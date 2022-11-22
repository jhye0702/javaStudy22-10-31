package Ch12_Inheritance_Practice;

/*
 * ������ ��Ÿ���� Animal Ŭ������ ��ӹ޾Ƽ� ���� ��Ÿ���� bird Ŭ������ �ۼ��غ���.
 */

class Animal {
	void walk() {
		System.out.println("���� �� ����.");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("�� �� ����.");
	}
	void sing() {
		System.out.println("�뷡 �θ� �� ����.");
	}
}

public class Ch12_ex03_Animal {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();	// ��� -> ���� �� ����. 		// Animal Ŭ�������� ��ӹޱ� ������ 
													// Bird Ŭ������ walk(); �Լ��� �������� �ʾƵ� ��.
		bird.fly();		// ��� -> �� �� ����.
		bird.sing();	// ��� -> �뷡 �θ� �� ����.
	}

}
