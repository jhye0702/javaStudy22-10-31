package Ch08_Method;


public class Ch08_Method16 {
	
	/*
	 * ���� ���� ����
	 * ���� ���� ���ڴ� �޼��� ȣ�� �� �ڵ����� �迭�� �����ǰ� 
	 * �迭�� ���ڰ����� ������ �� �迭�� ó���ϴ� ��.
	 * �ڵ����� �����Ǵ� �迭�� Ÿ���� ����� Ÿ������ �����Ǹ� �迭�� ũ��� ������ ������ ����
	 * 
	 * ������ Ÿ�� ������ ���� 3�� �� ����!
	 */
	
	static void test(int... v) {
		System.out.print(v.length + " : ");
//		for (������κ����� : v) {
//			
//		}
		for (int x : v) {		  // x�� �����̸����� ������� �ᵵ �˴ϴ�.	�迭 v�� �������� x. x�� Ÿ���� int��
			System.out.print(x + " ");		
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}
}
