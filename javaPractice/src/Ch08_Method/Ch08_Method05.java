package Ch08_Method;


public class Ch08_Method05 {
	
	/*
	 * ================= void ===================
	 * �Ű������� ���� Ÿ���� ���� �޼���
	 */
	
	public void print() {
		System.out.println("�޼��带 ȣ���Ѵ�");
		// ���� Ÿ���� ������ return�� ����� �� ����.
		// �ٸ� return ������ ���� ����� ��.
		// return�� �ǹ̴� �� �κп��� �޼��� ������ �����ϰ� �����Ѵٴ� �ǹ�.
		return;
	}
	
	public static void main(String[] args) {
		
		// ������ �ڿ� �θ��� ���� ��ȯ�ϱ⵵ ������ �޼��带 �����ϱ⵵ �ϴ� 2���� ������ ��.
		
		 int a = 1;
		 int b = 2;
		 int result = 0;
		 
		 // ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
		 Ch08_Method05 method = new Ch08_Method05();
		 method.print();
		 method.print();
		 method.print();
		
	}
}
