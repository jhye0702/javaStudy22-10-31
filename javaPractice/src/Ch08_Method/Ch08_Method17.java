package Ch08_Method;


public class Ch08_Method17 {
	
	/*
	 * ���� ���� ���ڿ� �Ϲ� ���ڸ� ȥ�� ���.
	 <���� ������>
	 1. ���� ���� ���ڰ� ���� �����ʿ� �־����.
	 2. ���ÿ� 2���� ���� ���� ���� ����� �ȵ�. 
	 */
	
	static void test(String name, int ... v) {
		System.out.print(name + " : ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("�輺ȣ", 98, 85, 88);
		test("����ȣ", 90, 95, 92);
		test("���¼�", 80, 98, 95);
	}
}
