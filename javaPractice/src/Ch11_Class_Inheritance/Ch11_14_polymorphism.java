package Ch11_Class_Inheritance;

class Car1{
	String color;
	int door;
	
	void drive() {		// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	void stop() {		// ���ߴ� ���
		System.out.println("stop!!");
	}
}
class FireEngine extends Car1 {  	// �ҹ���
	void water() {		// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}

public class Ch11_14_polymorphism {

	public static void main(String[] args) {
		
		/* �������� ����ȯ
		 * �ڽ� Ÿ�Կ��� �θ� Ÿ�����δ� �ڵ� �� ��ȯ�� ������ �θ𿡼� �ڽ� Ÿ�����δ� ����� ����ȯ.
		 */
		
		Car1 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe;		// ��Ӱ��迡 �ֱ� ������ �̷��� ���� �� ����. // car = (Car)fe; ���� �� ��ȯ�� ������ ����
		//car.water();	//	CarŸ���� ���������δ� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car;	// �θ�Ÿ�Կ��� �ڽ�Ÿ������ ������ ���� �� ��ȯ�� �������.
		fe2.water();
		
		}
}
