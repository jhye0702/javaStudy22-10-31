package Ch16_package.object;

public class Ch16_17_ {

	public static void main(String[] args) {
		/* StringBuffer �� StringBuilder Ŭ���� Ȱ��
		 * 
		 * ���α׷��� ����ٺ��� ���ڿ��� �����ϰų� �����ؾ��ϴ� ��찡 ����.
		 * ������ String Ŭ������ �ѹ� �����Ǹ� �� ������ ���ڿ��� ������� �ʱ� ������
		 * String Ŭ������ ����Ͽ� ��� ���ڿ��� �����ϰų� �����ϴ� ���α׷��� �ۼ��ϸ� �޸𸮰� ���� ����
		 * �� ������ �ذ��ϴ� ���� StringBuffer �� StringBuilder Ŭ����
		 * 
		 * StringBuffer  ��  StringBuilder Ŭ������ ���ο� ���� ������ (final�� �ƴ�)
		 * char[]�� ������ ������ ����.
		 * �� Ŭ������ ����Ͽ� ���ڿ��� �����ϸ� ������ ����ϴ� char[] �迭�� Ȯ��ǹǷ� �߰� �޸𸮸� ������� ����.
		 * ���� ���ڿ��� �����ϰų� ������ ��� �� Ŭ���� �� �ϳ��� ����ϸ� ��.
		 * 
		 * �� Ŭ������ ���̴� ���� �۾�(������)�� ���ÿ� ���ڿ��� �����Ϸ� �� ��
		 * ���ڿ��� �����ϰ� ����ǵ��� �������ִ°�, �׷��� �������� ����
		 * StringBuffer Ŭ������ ���ڿ��� �����ϰ� ����ǵ��� ����������, StringBuilder Ŭ������ ������� ����.
		 * ���� �����带 �����ϴ� ��Ƽ������ ���α׷��� �ƴ϶�� StringBuilder�� ����ϴ� ���� ����ӵ��� �� ����.
		 */
		
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ� :" + System.identityHashCode(javaStr));
		// 474675244   ó�� ������ �޸� �ּ�
		
		StringBuilder buffer = new StringBuilder(javaStr); // String���κ��� StringBuilder����
		System.out.println("���� �� buffer �޸� �ּ� :" + System.identityHashCode(buffer));
		// 932583850   buffer �޸� �ּ�
		buffer.append(" and");						//���ڿ� �߰�
		buffer.append(" android");					// ���ڿ� �߰�
		buffer.append(" programming is fun !!! ");  // ���ڿ� �߰�
		System.out.println("���� �� buffer �޸� �ּ� :" + System.identityHashCode(buffer));
		// 932583850   buffer �޸� �ּ�
		
		javaStr = buffer.toString();	// String Ŭ������ ��ȯ
		System.out.println(javaStr);	// Java and android programming is fun !!! 
		System.out.println("���� ������� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		// 212628335   ���� ������ �޸� �ּ�
	}

}
