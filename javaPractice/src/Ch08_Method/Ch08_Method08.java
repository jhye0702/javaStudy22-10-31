package Ch08_Method;


public class Ch08_Method08 {
			
		/*
		 * ���� Ÿ���� �ִ� �޼���
		 */
		public int add(int a, int b) { // public �ڿ� ����� int �޼����� ���� Ÿ�԰�
			int c = a + b;
			return c;					// ����� ��ȯ�� c�� ���������� int�� �����ؾ���.
			// return ������ ��ġ�ϴ� �����ʹ� �ݵ�� �޼����� ���� Ÿ�԰� ��ġ�ؾ���.
			// return 3.5; // ���� Ÿ�԰� �ٸ� ���������� ��ȯ�ϸ� ������ �߻�
			
		}

		public static void main(String[] args) {
			// ���� ����
			 int num1 = 50;
			 int num2 = 100;
			 int result = 0;
			 
			 // ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
			 Ch08_Method08 method = new Ch08_Method08();
			 result = method.add(num1, num2);
			 
			 System.out.println("�� ���� ���� " + result); // �޼����� ��ȯ ���� �����ؼ� ���
			 System.out.println("�� ���� ���� " + method.add(num1, num2)); // �޼����� ��ȯ ���� �ٷ� ���
			 
			 
		}
	}
