package Ch08_Method;


public class Ch08_Method09_CallByValue {
			
		/*
		 * �޼��� ȣ�� ���
		 * ============== 1. ���� ���� ȣ�� (CallByValue)
		 * ���� ���� �޼��� ȣ�� ����� �޼��� ȣ�� �ÿ� ���� ����Ǿ� ����.
		 * �޼����� �Ű����� Ÿ���� �⺻�� �������� �� ���� ���� ȣ���� ��
		 */
	
	// �޼��� increase() ȣ�� �ÿ� n �̶�� �Ű������� �޸𸮿� �����Ǿ�
	// var 1�� ���� 100�� ���� �Ǿ� ó��.
	// �޼��� ������ ����Ǹ� �Ű����� n�� �޸𸮿��� �Ҹ�.
	// ��ó�� ���� ���� ȣ���� ȣ��� �Ű������� ���޵Ǵ� ���� ����Ǿ� ����
	// ���� var1�� ���� ������ ����.
	
		public int increase(int n) {
			++n;
			return n;
		}

		public static void main(String[] args) {
			int var1 = 100;
			Ch08_Method09_CallByValue val = new Ch08_Method09_CallByValue();
			int result = val.increase(var1);
			System.out.println("var1 : " + var1 + ", result" + result);
			 
		}
	}
