package Ch10_Class_constructor;

class Rocket {
	int x, y;
	
	Rocket(int x, int y){		// ���� ������ ��ġ
		this.x = x;
		this.y = y;
	}
	String printInfo() {			// ���� ������ ���ڿ��� ��ȯ�ϴ� �޼�
		return "x: " + x + ", y: " + y;
	}
	void moveUp() {				// ������ y ��ǥ�� 1��ŭ ����
		y++;
	}
}

public class Ch10_05Rocket {
	/*
	 * Ŭ���� �ۼ� �� ��ü ����
	 * 
	 * ������ ��Ÿ���� Rocket Ŭ������ �ۼ��϶�.
	 * Rocket Ŭ������ ������ ���� �ʵ�� �޼��带 ������.
	 * 
	 * # �ʵ�
	 * x, y : ���� ������ ��ġ
	 * 
	 * # �޼���
	 * Rocket(x, y) : ���� ������ ��ġ
	 * printInfo() : ���� ������ ���ڿ��� ��ȯ�ϴ� �޼���
	 * moveUp() : ������ y ��ǥ�� 1��ŭ ����
	 */
	public static void main(String[] args) {
		Rocket rocket = new Rocket(10, 20);
		System.out.println(rocket.printInfo());	// x: 10, y: 20
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo());	// x: 10, y: 22
	}

}
