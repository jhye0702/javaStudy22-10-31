package Ch13_abstract_interface_innerclass;

abstract class Animal {	// 동물 클래스
	private String name;	// 이름
	
	public Animal(String name) {
		this.name = name;
	}
	public String getName( ) { return name; }
	
	public abstract void bark();		// 짖는다
	public abstract String toString();	// 문자열 표현을 반환
	
	public void introduce() {
		System.out.println(toString() + "입니다. ");
		bark( );
	}
}

class Cat extends Animal {	// 고양이 클래스
	private int age;		// 나이
	
	public Cat(String name, int age) { super(name); this.age = age; }
	
	public void bark() { System.out.println("야옹!!"); }
	
	public String toString () { return age + "살인 " + getName(); }
	
}

class Dog extends Animal {	// 개 클래스
	private String type;	// 견종
	
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	
	public void bark( ) { System.out.println("멍멍!"); }
	
	public String toString() { return type + "인 " + getName(); }
}

public class Ch13_02 {
	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("바둑이", "삽살개"),	// 개
				new Cat("아롱이", 7)	,		// 고양이
				new Dog("백두", "진돗개"),		// 개
		};
		
		for (Animal animal : animals) {
			animal.introduce();			// animal가 참조하고 있는 인스턴스의 형에 따라서
			System.out.println();		// 메소드가 호출된다.
		}
}
}
