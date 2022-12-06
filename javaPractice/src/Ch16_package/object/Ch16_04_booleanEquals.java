package Ch16_package.object;

class Comp {
	String name;
	Comp(String name){
		this.name = name;
	}
}

public class Ch16_04_booleanEquals {

	public static void main(String[] args) {
		/* boolean equals(Object obj)
		 * �� �ν��Ͻ��� �������� ���θ� ��ȯ.
		 * �������Ͽ� ���������� ������ �ν��Ͻ����� ������ �� ����.
		 * equals() �޼����� ���� ����� �� �ν��Ͻ��� �ּҰ��� ���Ͽ� boolean��(true/false)�� ��ȯ���ִ� ��
		 * 
		 * �ּ� ���� ���ٸ� �翬�� ���� �ν��Ͻ�������, ���� �ٸ� �ּҸ� ���� ���� ���� �ν��Ͻ���� ������ �� �ִ� ��찡 ����.
		 * ���� ������ ���ϼ�(�ν��Ͻ��� �޸� �ּҰ� ����)�� �ƴ϶� ������ ���ϼ�(���������� �� �ν��Ͻ��� ����)��
		 * ������ ���� equals()�޼��带 �������Ͽ� ���
		 */
		
		String comp1 = new String("��1");
		String comp2 = new String("��2");
		
		System.out.println(comp1 == comp2); // false. �� ��Ʈ�� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(comp1.equals(comp2)); // false. equals �޼ҵ嵵 �ּҰ��� ��
		
		// String, Integer Ŭ������ equals() �޼��� ������
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); 		// false. �� ���� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(str1.equals(str2)); 	// true. Integer Ŭ������ equals �޼ҵ尡 ������ ��.
		
// -------------------------------------------------------------------------------------------------------		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2); 		// false. �� ���� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(i1.equals(i2)); 	// true. Integer Ŭ������ equals �޼ҵ尡 ������ ��.
		
		i1 = i2;
		System.out.println(i1 == i2); // true. == �� �� �������� ������ ��
	}

}