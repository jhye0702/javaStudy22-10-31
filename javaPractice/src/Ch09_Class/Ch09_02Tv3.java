package Ch09_Class;

public class Ch09_02Tv3 {

	public static void main(String[] args) {

		// ���� ������ ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		// Ch09_Class.Tv@379619aa // @���� �ּҰ��� ��ǻ�� ���� �ٸ�
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		// Ch09_Class.Tv@cac736f // @���� �ּҰ��� ��ǻ�� ���� �ٸ�
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		System.out.println();
		
		t1.channel = 7; // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 7
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1 = t2; // t2�� ������ �ּҰ��� t1�� ����. ���� ������ ������ �ּҸ� ����Ŵ.
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		// Ch09_Class.Tv@cac736f
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		// Ch09_Class.Tv@cac736f
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1.channel = 27;
		System.out.println("t1�� channel���� 27�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 27
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 27
	}

}
