package javaPractice.ch_01Type;

public class Ch01_Type13 {

	public static void main(String[] args) {
		/* �⺻ Ÿ�԰� ���ڿ� ���� ��ȭ
		 * �⺻ Ÿ���� ���� ���ڿ��� �����ϴ� ��쿡�� String.valueOf(); �޼ҵ带 �̿�
		 * String str = String.valueOf(�⺻Ÿ�԰�);
		 */
		
		// �⺻ Ÿ���� ���ڿ��� ��ȯ
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}

}
