package Ch09_Class;

public class Ch09_02Tv1 {

	public static void main(String[] args) {
		
		Tv t; 				// Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();		// Tv�ν��Ͻ��� �����Ѵ�.
		
		t.channel = 7;		// Tv�ν��Ͻ��� ��� ���� channel�� ���� 7�� �Ѵ�.
		t.channelDown();	// Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� " + t.channel + " �Դϴ�."); // ���� ä���� 6�Դϴ�.

	}

}
