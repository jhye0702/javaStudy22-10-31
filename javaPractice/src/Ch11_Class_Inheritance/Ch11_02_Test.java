package Ch11_Class_Inheritance;

public class Ch11_02_Test {

	public static void main(String[] args) {

		Ch11_02_GeneralChick2 generalChick = new Ch11_02_GeneralChick2();
		// generalChick �� �ƹ��͵� ���� ��ӹ޴°� ����!
		generalChick.display();
		Ch11_02_RedChick redChick = new Ch11_02_RedChick();
		redChick.display();
		// redChick �� �ƹ��͵� ���� ��ӹ޴°� ����!
		System.out.println(redChick.x);		// �θ� �����ڰ� �ڵ����� ����
	}

}
