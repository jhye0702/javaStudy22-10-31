package Ch08_Method;


public class Ch08_Method07 {
			
		//�Ű� ���� 2���� ����ϴ� �޼���
		public void print(int a, int b) { 
			int c = a + b;
			System.out.println("����� : " + c);
		}
		// �Ű� ������ ���ڿ��� �޴� �޼��� ����.
		public void print(String str) {
			System.out.println(str);
		}
		public static void main(String[] args) {
			// ���� ����
			 int num1 = 100;
			 int num2 = 200;
			 int result = 0;
			 
			 // ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
			 Ch08_Method07 method = new Ch08_Method07();
			 // �޼��� ȣ��
			 method.print(10, 20);
//			 method.print(10, 30.0f); // ������ Ÿ���� int�� �����Ǿ� �ִµ� 30.0f�� �Ǽ������̱� ������ ���� ����.
			 method.print(num1, num2);
			 
			 method.print("�ȳ��ϼ���.");
		}
	}
