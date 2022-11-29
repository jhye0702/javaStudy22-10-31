package Ch13_interface11_IShop;

// ���θ� ��ǰ ���Ǹ� ���� �߻�Ŭ����,
// �پ��� ��ǰ ������ �����ϱ� ���� �⺻ ���� ���� �� ��¸� �߻�Ŭ�������� �����ϰ�
// �߰� ������ ���� Ŭ�������� �����ϵ��� ������.

public abstract class Product {
	String pname; 	// ��ǰ��
	int price;		// ����
	int pnumber;	// +++  ��ǰ�ڵ� �߰�
	
	// ��ǰ��� ������ ����ϴ� �⺻���� ��� �޼���
	// ��ǰ�� �⺻ ������ ��ǰ �̸��� ������ ���
	// �� ������ ����Ϸ���  printExtra() �޼��带 ȣ��.
	
	public void printDetail() {
		System.out.print("��ǰ�� : " +pname+ ", ");
		System.out.print("����: " +price+ ", ");
		System.out.print("��ǰ�ڵ� : " +pnumber+ ", ");
		printExtra(); // ��ǰ��, ���� �� �ٸ� ����� ������ �߰��ϴ� ��
	}
	
	// �߻�޼���. ���� ������ ���� Ŭ�������� ��.
	// printDetail()���� �ڵ����� ȣ���ϹǷ�, 
	// printDetail()���� ������ ���뵵 �ڵ����� �Բ� ���
	public abstract void printExtra();
	
}
