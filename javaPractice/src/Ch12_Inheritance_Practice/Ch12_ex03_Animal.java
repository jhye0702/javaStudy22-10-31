package Ch12_Inheritance_Practice;

/*
 * 동물을 나타내는 Animal 클래스를 상속받아서 새를 나타내는 bird 클래스를 작성해보자.
 */

class Animal {
	void walk() {
		System.out.println("걸을 수 있음.");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("날 수 있음.");
	}
	void sing() {
		System.out.println("노래 부를 수 있음.");
	}
}

public class Ch12_ex03_Animal {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();	// 출력 -> 걸을 수 있음. 		// Animal 클래스에서 상속받기 때문에 
													// Bird 클래스에 walk(); 함수를 정의하지 않아도 됨.
		bird.fly();		// 출력 -> 날 수 있음.
		bird.sing();	// 출력 -> 노래 부를 수 있음.
	}

}
