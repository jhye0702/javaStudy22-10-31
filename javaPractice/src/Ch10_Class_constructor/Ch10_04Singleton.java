package Ch10_Class_constructor;

public class Ch10_04Singleton {

	public static void main(String[] args) {

		
		//�������� ���� �����ڰ� private���� ������ �ȵ�.
		// Singleton singleton1 = new Singleton(); // ������ ����
		// Singleton singleton2 = new Singleton(); // ������ ����
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}

}
