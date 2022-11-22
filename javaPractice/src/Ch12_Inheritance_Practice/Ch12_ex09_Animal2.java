package Ch12_Inheritance_Practice;

class Animal2{
	void breath() {
		System.out.println("������");
	}
}
class Lion extends Animal2{
	@Override // Object�� toSting(); �޼��带 �������Ѵٴ� ��.
	public String toString() {
		return "����";
	}
}
class Rabbit extends Animal2{
	@Override
	public String toString() { // ���� Ŭ������ ����� �䳢 Ŭ����
		return "�䳢";
	}
}
class Monkey extends Animal2{
//	@Override
//	public String toString() { // ���� Ŭ������ ����� ������ Ŭ����
//		return "������";
//	}
}
class Zookeeper {  				// ������ Ŭ����
	void feed(Animal2 animal) {	// �����ִ� �޼���
		System.out.println(animal + "���� ���� �ֱ�");
	}
}
	// �Ʒ��� ���� �޼��带 ������ ���� �ʰ� ���� Ŭ���� Zookeeper ó�� �ϳ��� ���� �� ����
//	void feed(Rabbit rabbit) {	// �䳢���� �����ִ� �޼���
//		System.out.println(rabbit + "���� ���� �ֱ�");
//	}
//	void feed(Monkey monkey) {	// �����̿��Կ��� �����ִ� �޼���
//		System.out.println(monkey + "���� ���� �ֱ�");
//	}
// }


public class Ch12_ex09_Animal2 {
		
	public static void main(String[] args) {
		Zookeeper james = new Zookeeper();	// james ��� �̸��� ������ �ν��Ͻ� ����
		Animal2 lion = new Lion();			// Lion �ν��Ͻ� ����
		james.feed(lion);					// james �� lion ���� ��� �ֱ�
		Animal2 rabbit = new Rabbit();		// Rabbit �ν��Ͻ� ����
		james.feed(rabbit);					// james �� rabbit ���� ���� �ֱ�
		Animal2 monkey = new Monkey();		// Monkey �ν��Ͻ� ����
		james.feed(monkey);					// james �� monkey ���� ���� �ֱ�
 
		// �� Lion Rabbit Monkey Ŭ������ toString�� Object���� ��ӹ޾ұ� ������
		// Object�� ���� ��ӹ޴� Animal2 ���� ��ӵǰ� �����Ƿ� ����� �� ����.
	
	}
}


// toString
// ��ü�� ���� ������ ����
// ��ü�� ���� ���� : ��ü�� ���ڿ��� ǥ���� ��
// �⺻������ Object Ŭ������ toString(); --> "Ŭ������ @16������ �ؽ��ڵ�" �� ������ ���� ������ ����
// 
