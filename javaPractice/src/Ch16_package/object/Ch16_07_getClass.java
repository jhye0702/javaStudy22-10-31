package Ch16_package.object;

/*
 * getClass() �޼���� ��ü�� Ŭ���� ������ �����ϴ� Class ��ü�� ����
 */

class Human {
	int age;
	String name;
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ� " + age + "�� " + name + "�Դϴ�.");
	}
}
public class Ch16_07_getClass {

	public static void main(String[] args) {
		Human kim = new Human(29,"��Լ�");
		System.out.println("Ŭ���� �̸�" + kim.getClass());
		kim.intro();
	}

}
