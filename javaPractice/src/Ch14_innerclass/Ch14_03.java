package Ch14_innerclass;

// InnerTest

class OutClass {
	/*
	 �ν��Ͻ� ���� Ŭ����
	 �ν��Ͻ� ������ ������ ���� ���� ��ġ�� �����ϸ�, �ܺ� Ŭ���� ���ο����� �����Ͽ� ����ϴ� ��ü�� ������ �� ���.
	 ���� ��� � Ŭ���� ���� ���� ������ �ְ� �̵� ���� �� �Ϻθ� ��� Ŭ������ ǥ���� �� ����
	 �� Ŭ������ �ٸ� �ܺ� Ŭ�������� ����� ���� ���� ��� ���� �ν��Ͻ� Ŭ������ ����
	 �ܺ� Ŭ������ ��ü�� ���� �������� �ʰ� �ν��Ͻ��� ���� Ŭ������ ����� �� ����
	 �ڹ� 16 (2021�� 3��) ���ʹ� ���� Ŭ�������� ���� ����� ���� �� �� �ְ� ��.
	 */
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; // ���� Ŭ������ �������� ����
	
	public OutClass() { // �ܺ� Ŭ������ ����Ʈ ������
		inClass = new InClass(); // ���� Ŭ���� ����. �ܺ� Ŭ������ ��ü�� ������ �Ŀ� ���� Ŭ������ ��ü ���� ����
	}
	//==================================== ���� Ŭ���� ====================================
	class InClass { 
		int inNum = 10;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + " (�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutClass inNum = " + inNum + " (���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sInNum = " + sInNum + " (���� Ŭ������ ����ƽ ����)");
		}
		static void sTest() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ static �޼ҵ�");
		}
	}
	//==================================== ���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ� =================================
	public void usingClass() {
		inClass.inTest(); // ���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
}

public class Ch14_03 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); 	// ���� Ŭ���� ��� ȣ��. inTest() �޼��尡 ȣ���.
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass(); 		// �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		System.out.println();
		
		// �ν��Ͻ� ���� Ŭ������ static ��� ��� => ������ ���⿡ �ּ��� ��������. �����߻� ������. �ٵ� �ڹ�16���� ���� �� ��.
		System.out.println(OutClass.InClass.sInNum);  // ��� ��� -> 200
		OutClass.InClass.sTest();   // ��°�� -> �ν��Ͻ� ���� Ŭ������ static �޼ҵ�
	}
}
