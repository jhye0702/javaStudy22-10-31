package Ch09_Class;

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm
	
	static int cv = 5;	// Ŭ���� ����
	int iv = 4;			// �ν��Ͻ� ����
	
	static void cm() {	// Ŭ���� �޼���
	}
	void im() {			// �ν��Ͻ� �޼���
	}
	static void cm_Imember() {		// Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
		//System.out.println(iv);	// �����߻�
		//im();						// �����߻�
	}
	void im_Cmember() {
		// �ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	static void cm_Cmember() {
		// Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	void im_Imember() {
		// �ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}

public class Ch09_10Check {

	public static void main(String[] args) {
		
		// Check.im_Imember();		// ���� ! Check Ŭ�������� im_Imember(�ν��Ͻ� �޼���)�� ȣ���� �� ����.
									//		ȣ���Ϸ��� Check�� ��������(��ü) ���� "��������.�ν��Ͻ��޼���"�� �̿밡���ϴ�.
		Check.cm_Cmember();			//����
		
		Check myinstance = new Check();
		myinstance.im_Cmember();	//����
		myinstance.im_Imember();	//����
	}
	
	
}

