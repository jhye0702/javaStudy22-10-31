package Ch09_Class;


public class Ch09_07MyAccount2 {

	public static void main(String[] args) {
		
		// MyAccount chulsoo = new MyAccount(); // ö���� ����
		MyAccount chulsoo;
		chulsoo = new MyAccount();
		
		MyAccount younghee = new MyAccount(); 	// ������ ����
		
		chulsoo.name 	= "ö��";		// ö���� ���¸���
		chulsoo.no 		= "777777"; 	// ö���� ���¹�ȣ
		chulsoo.balance = 1000;			// ö���� �����ܰ�
		
		younghee.name	 = "����";		// ������ ���¸���
		younghee.no		 = "222222";	// ������ ���¹�ȣ
		younghee.balance = 200;			// ������ �����ܰ�
		
		chulsoo.balance  -= 200;		// ö���� 200�� ����
		younghee.balance += 100;		// ���� 100�� ����
		
		chulsoo.printAccount();
		younghee.printAccount();

	}

}
