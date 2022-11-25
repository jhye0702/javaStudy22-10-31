package Ch13_abstract_interface_innerclass;

/* �߻� �޼���� ����θ� �����ϰ� ��ü���� ������ ������� �޼��� 
 * ��ü���� ������ ���� �ʾұ� ������ �̸� ��ӹ��� ���� Ŭ���������� ����Ϸ��� �ݵ�� �����϶�� �ǹ�
 * �߻� �޼��带 �����ϴ� ����� '�߻�����' �̶�� ���� ������, abstract�� �޼��� �� �տ� �ٿ� ��.
 * 
 * �߻� Ŭ������ �߻� �޼��带 ����� ������ Ŭ����
 * �߻� Ŭ������ �Ϲ����� �޼��嵵 ���� �� ������ �߻� �޼��带 �ϳ��� ���� �ϴ� Ŭ����
 */

abstract class Pokemon { // ���ϸ� �߻� Ŭ����
	
	String name;
	
	
	abstract void attack();		// ���� �߻� �޼���. ��ü���� ������ �����Ƿ� ��ȣ'{ }' �� �����ϰ� �����ݷ�';'�� �ٿ���.
	abstract void sound();		// �Ҹ� �߻� �޼���
	
	public String getName() {	// ���ϸ��� �̸��� �����ϴ� �޼���
		return this.name;
	}
}

class Pikachu extends Pokemon {	// ��ī�� Ŭ����
	Pikachu()	{				// �̸��� �����ϴ� ������
		this.name = "��ī��";
	}
	@Override
	void attack() {				// ��ü������ ����
		System.out.println("���� ����");
	}

	@Override
	void sound() {
		System.out.println("��ī��!");
	}  // ��ī�� Ŭ����
}

class Squirtle extends Pokemon { // ��ī�� Ŭ����
	Squirtle() {
		this.name = "���α�";
	}
	void attack() {
		System.out.println("�� ����");
	}
	void sound() {
		System.out.println("���� ����!");
	}
}

public class Ch13_01 {

	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ��� " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle = new Squirtle();
		System.out.println("�� ���ϸ��� " + squirtle.getName());
		squirtle.attack();
		squirtle.sound();
		
	}

}
