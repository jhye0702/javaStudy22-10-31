package javaPractice.ch_02Operator;

public class Ch02_Operator05 {

	public static void main(String[] args) {
		/* �񱳿����� */
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		
		/*  ���ڿ��� ��� equals() �޼��带 �̿��ؼ� ���� �� */
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true
		
		/*  == �� ��ü�� �ּҰ��� �� */
		System.out.println(c1 == "Hello java!"); // false
		System.out.println(c1 == "Hello JAVA!"); // true
		
		/*  == �� ��ü�� �ּҰ��� �� */
//		String c2 = new String("Hello JAVA!");
	}

}
