package Ch08_Method;


public class Ch08_Method10_CallByRef {
			
		/*
		 * �޼��� ȣ�� ���
		 * ============== 2. ������ ���� ȣ�� (CallByRef)
		 * �Ű������� Ÿ���� ������ Ÿ���� �� ���
		 * ������ ���� ȣ���� �޼��� ȣ�� �� ���� �������� ��ġ�� �Ű������� ����
		 */
		/*
		 * ���� ���� ȣ���� �޸𸮿� ������ ���� ���� �� ���!
		 * ������ ���� ȣ���� �޸��� �ּҸ� �ѱ�� ������ ���� �������� ����!
		 */
	
		public void increase(int[] array) {
			for (int i=0; i < array.length; i++ ) {
				array[i]++;
			}
		}

		public static void main(String[] args) {
			int[] refArray = { 100, 800, 1000 };
			Ch08_Method10_CallByRef ref = new Ch08_Method10_CallByRef();
			System.out.println("�޼��� ȣ�� ��");
			for (int i=0; i < refArray.length; i++) {
				System.out.println("refArray["+i+"]" + refArray[i]);
			}
			 
		}
	}
