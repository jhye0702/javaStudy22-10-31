package javaPractice.ch_01Type;

public class Ch01_TypeEx_01 {

	public static void main(String[] args) {
		/* int result = ��
		 * 1) ���� 4���� ��� ����ϰ�
		 * 2) ��Ģ���� �� + ���길 ����ؼ�
		 * 9�� �������� �ڵ带 �ϼ�.
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int a = (int)var1;
		double b = var2 + var3;
		int c = (int)b;
		double d = Double.parseDouble(var4);
		int e = (int)d;
		
		int result = a + c + e ; // �� �κи� ����. 0��� �ڵ� �Է�.
		System.out.println(result); // 9
	}
}
