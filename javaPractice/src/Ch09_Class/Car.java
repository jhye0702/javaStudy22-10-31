package Ch09_Class;

class Car {
	boolean powerOn; 	// �õ�
	String color; 		// ������ ����
	int wheel; 			// ������ ��
	int speed; 			// �ӷ�
	boolean wiperOn; 	// ������
	
	void power() {
		powerOn = !powerOn; // �õ� �޼���
	}
	void speedUp() {
		speed++; 			//���� �޼���
	}
	void speedDown() {
		speed--; 			// �극��ũ �޼���
	}
	void wiper() {
		wiperOn = !wiperOn; // ������ �޼���
	}
	
}
// =! �����ڴ� �ݴ� �� ���� ������ �Ҵ��ϴµ� ���ȴ�.
// a=!b��� ǥ���� ������ a= !b �Դϴ�.
// ���� b�� ���� ��Ų ���� a�� �Ҵ��մϴ�.
