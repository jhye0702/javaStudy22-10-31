package Ch11_Class_Inheritance;

/*
 * final ���� : 
 * final �޼��� : ������ ���̻� ������ �� ���� �޼���. �������̵� �Ұ�
 * final Ŭ���� : ������ ���̻� ������ �� ���� Ŭ����. ��� �Ұ�
 */

final class FinalClass {
	final int number = 4; // ���
}
class Parents/* extends FinalClass */ // �����߻�
{
	final void finalMethod() { // �������̵� �Ұ��� �޼���
		System.out.println("��� �Ұ��� �޼���");
	}
}
class Son extends Parents {
	// void finalMethod() { } // �������̵��� �Ұ��ϴٰ� �����߻�
}
public class Ch11_12_final {

	public static void main(String[] args) {
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		//member1.number = 5; // ����� ���� �Ұ�
		
		Son son = new Son();
		son.finalMethod();
		
		Parents parents = new Parents();
		parents.finalMethod();
		}
}
