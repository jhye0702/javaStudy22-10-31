package Ch13_abstract_interface_innerclass;

abstract class Animal {	// ���� Ŭ����
	private String name;	// �̸�
	
	public Animal(String name) {
		this.name = name;
	}
	public String getName( ) { return name; }
	
	public abstract void bark();		// ¢�´�
	public abstract String toString();	// ���ڿ� ǥ���� ��ȯ
	
	public void introduce() {
		System.out.println(toString() + "�Դϴ�. ");
		bark( );
	}
}

class Cat extends Animal {	// ����� Ŭ����
	private int age;		// ����
	
	public Cat(String name, int age) { super(name); this.age = age; }
	
	public void bark() { System.out.println("�߿�!!"); }
	
	public String toString () { return age + "���� " + getName(); }
	
}

class Dog extends Animal {	// �� Ŭ����
	private String type;	// ����
	
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	
	public void bark( ) { System.out.println("�۸�!"); }
	
	public String toString() { return type + "�� " + getName(); }
}

public class Ch13_02 {
	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("�ٵ���", "��찳"),	// ��
				new Cat("�Ʒ���", 7)	,		// �����
				new Dog("���", "������"),		// ��
		};
		
		for (Animal animal : animals) {
			animal.introduce();			// animal�� �����ϰ� �ִ� �ν��Ͻ��� ���� ����
			System.out.println();		// �޼ҵ尡 ȣ��ȴ�.
		}
}
}
