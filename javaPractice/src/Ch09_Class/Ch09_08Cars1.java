package Ch09_Class;

class Cars {
	static int wheel = 4;	// Ŭ���� ���� (�ν��Ͻ� ���� ���� �̸� �ö� �ִ�)
	int speed;				// �ν��Ͻ� ����
}

public class Ch09_08Cars1 {
	/*
	 * �ν��Ͻ� ������ ������ �ν��Ͻ����� ������ ���� ������ ������ �ֱ� ������ ������ ������ ����
	 * Ŭ���� ������
	 * 1) �ϳ��� ���� ������ ��� �ν��Ͻ��� �Բ� �����ϱ� ������
	 * 	  �ϳ��� ���������� ���� �����ϴ��� ��� �ν��Ͻ��� ���� ���ϰ� ��
	 * 2) �ν��Ͻ� ���� ���� ���� �����ϱ� ������ Ŭ���� �̸����� ������ ��
	 */

	public static void main(String[] args) {

		System.out.println(Cars.wheel);		// Ŭ���� �̸����� ���� ���� ����
		// System.out.println(Cars.speed);	// ���� �߻�! �ν��Ͻ� ���� ���� �Ұ�
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);	// �ν��Ͻ� ���� �Ŀ��� ���� ����
		
		Cars myCar2 = new Cars();
		
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed);	//0
		System.out.println("myCar2.speed: " + myCar2.speed);	//0
		System.out.println("myCar1.wheel: " + myCar1.wheel);	//4
		System.out.println("myCar2.wheel: " + myCar2.wheel);	//4
		
		myCar2.speed = 100;
		myCar2.wheel = 5; // wheel�� static�̴ϱ� �������� ������ ���. myCar2 �ϳ��� ���� �����ϴ��� �������� ���� �����.
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed);	//0
		System.out.println("myCar2.speed: " + myCar2.speed);	//100
		System.out.println("myCar1.wheel: " + myCar1.wheel);	//5
		System.out.println("myCar2.wheel: " + myCar2.wheel);	//5
		
	}

}
