package Ch08_Method;


public class Ch08_Method19 {
	
	public static void main(String[] args) {
	/*
	 * �غ� 30, ���� 10 �� �簢���� ���̸� ����ϼ���
	 * ��, �޼��� calculator()�� ȣ���ؼ� ����ϼ���.
	 * ����� : 
	 *		 < ����� �����մϴ�.
	 * 		 �غ��� 30, ���̰� 10�� �簢���� ���̴� 300 �Դϴ�.
	 */
		int width = 30;
		int height = 10;
		int area = calculator(width, height);
		System.out.println("�غ��� " +width+ ", ���̰� " +height+ "�� �簢���� ���̴� " + area + "�Դϴ�.");
	}
	
	public static int calculator(int a, int b) {
		System.out.println("< ����� �����մϴ�.");
		int area = a * b; // �غ� * ���� = �簢���� ����
		return area;
	}
	
	
}