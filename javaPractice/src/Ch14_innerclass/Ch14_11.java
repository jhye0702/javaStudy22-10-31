package Ch14_innerclass;
/*
 �͸� anonymous ��ü
 �̸��� ���� ��ü
 
 �͸� ��ü�� ����� ������ � Ŭ������ ����ϰų� �������̽��� �����ؾ� ��
 �ڽ� Ŭ������ �������� �ʰ�, ������ Ư�� ��ġ���� ����� ����� �ڽ� Ŭ������ ��������� �����ϴ� ���� ������ �۾��� ��.
 �� ��쿡 ' �͸� �ڽ� ��ü ' �� �����ؼ� ����ϴ� ����� ���
 �Ϲ������� ������ �޼ҵ尡 ���� �����µ�, �Ϲ� Ŭ�������� �������� �����ڸ� ������ �� ����.
 */

class Person {
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�");
	}
}
class Anonymous { // �̰� �� ������� ��� �ٱ��ʿ� Ŭ������ 3���� ������ �մϴ�...? ��?????
	// �ʵ� �ʱⰪ���� ����. �ʵ� ������ �͸� ��ü ����
	Person field = new Person() { 		// PersonŬ������ �ڽ��� �ȴ�.
		void work() {					// �ڽ� Ŭ������ ���� �޼���
		System.out.println("����մϴ�.");
		}
	@Override
	void wake() {
		System.out.println("6�ÿ� �Ͼ�ϴ�.");
		work();
	}
};

	void method1() {
		// ���� ���������� ����. ���� ���������� �͸� ��ü ����.
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�!");
				walk();
			}
		};
		// ���� ���� ���
		localVar.wake();
	}
	void method2 (Person person) {
		person.wake();
	}
public class Ch14_11 {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
				// �Ű������� �͸� ��ü ����
				new Person() {
					void study() {
						System.out.println("�����մϴ�.");
					}
					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}
				}
		);
	}
}
}
