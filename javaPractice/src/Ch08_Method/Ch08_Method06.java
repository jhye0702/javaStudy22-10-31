package Ch08_Method;


public class Ch08_Method06 {
	
		/*
		 * �Ű� ������ �ִ� �޼���.
		 * �Ű� ������ �޼��� ȣ��� �޸𸮿� �����ǰ�, ȣ�� �� ���� �� �Ҹ�
		 * 
		 * �߰��� ���⼭ main �ȿ� �ִ� int a �� �� ���� �ִ� �޼����� int a�� �������� ������ ������ ���� �ʴ´�.
		 * �̷��� ������ for�� ���� ���������� ������ ���ϴ� �߰�ȣ �ȿ����� ��ȿ�ϹǷ� 
		 * ���� �ٸ� ������ �ִ� ���̶�� �����ϸ�.. ��?
		 */
		
		public void print(int a) { // return���� ���� ���� ������ void�� ����..?
			System.out.println("����� : " + a);
		}
		
		public static void main(String[] args) {
			
			 int a = 11;
			 int b = 22;
			 int result = 0;
			 
			 // ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
			 Ch08_Method06 method = new Ch08_Method06();
			 method.print(10);
			 method.print(b);
			 method.print(result);
			
		}
	}
