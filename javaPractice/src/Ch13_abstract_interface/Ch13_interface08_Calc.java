package Ch13_abstract_interface;


interface Calc {	// �������̽� �����
	// �������̽����� ����� ������ ������ �������� ����� ��ȯ��.
	//�ڵ����� public static final�� �ٴ´�.
	double PI = 3.14;
	int ERROR = -999999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��.
	int add (int num1, int num2);
	int substact (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	// ++++++++++++++++++++++++++++++++++++ �������̽��� ����Ʈ �޼ҵ� ����
	// default ���� ������ �� ������ �Ⱥٿ��� �ڵ����� �پ�����.
	// ���⼭�� �����־�� �Ѵ�! �������� �ڵ����� public�� �پ����..?
	// ���� �ҽ������� ������ �ؾ����� �� �� �ִ�.
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();
	}
	
	// ++++++++++++++++++++++++++++++++++++  ���� �޼ҵ� ����
	// interface�� ���� ���ϴ��� �� �� �ֵ��� �������.
	static int total (int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	// private �߰��� ���� : ���� ���� �����Ѵ�.
	// �߻�޼���� private�� �� ������. static�� default�� �긦 �� �� �ִ�.
	private void myMethod() {	// ����Ʈ �޼ҵ忡�� ���
		System.out.println("private �޼����Դϴ�.");
	}
	
	// private �޼���� �ڵ带 ��� �����ؾ� �ϹǷ� �߻�޼��忡�� private ���� ����� �� ����.
	// static ������ �Բ� ��� ����.
	private static void myStaticMethod() {	// ���� �޼ҵ忡�� ���
		System.out.println("private static �޼����Դϴ�.");
	}
} 




// ----------------------------------------------------------------------------
// ------------------------------------�������̽� Calc�� �����ϴ� �߻� Ŭ���� Calulaor
//-----------------------------------------------------------------------------

abstract class Calculator2 implements Calc {
	// �������̽��� ������ �߻� Ŭ����
	// �߻�Ŭ������ ��� �������̽��� ��� �߻� �޼��带 �������� �ʾƵ� ��.

	@Override
	public int add (int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substact (int num1, int num2) {
		return num1 - num2;
	}
}

//--------------------------------------------------------------------------------------
//------------------------------------�߻� Ŭ���� Calulaor�� ��ӹ޴� �Ϲ� Ŭ���� CompleteCalc
//--------------------------------------------------------------------------------------

class CompleteCalc extends Calculator2 {
	// �������̽��� ������ �߻� Ŭ������ ��ӹ��� �Ϲ� Ŭ����.
	// �߻� Ŭ�������� add(), substract()�� ����������
	// times(), divide()�� �����ϸ� ��.
	
	@Override
	public int times (int num1, int num2) {
		return num1 * num2;
	}
	@Override
	public int divide (int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;	// � ���� 0���� ������ ��쿡 ������ ��ȯ.
	}
	
	public void showInfo() {	// CompleteCalac���� �߰��� ������ �޼ҵ�.
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

}


public class Ch13_interface08_Calc {
	/* 
	 * �������̽� interface�� Ŭ���� Ȥ�� ���α׷��� �����ϴ� ����� ��������� �����ϴ� ����
	 * �������̽��� �߻� �޼���� ����θ� �̷����.
	 * ������ �ڵ尡 ���� ������ �翬�� �������̽��� �ν��Ͻ��� ������ �� ����.
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
