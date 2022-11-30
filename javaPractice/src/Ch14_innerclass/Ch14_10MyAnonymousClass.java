package Ch14_innerclass;

interface Anony {
	public void print();
}

public class Ch14_10MyAnonymousClass {

	public void printB (Anony a) { // �������̽� Anony Ÿ���� ��ü�� �Ű������� �޴� �޼���
		a.print();
	}
	/* �ʿ��� ������ �������̽��� ���� Ŭ������ �ν��Ͻ��� ���� �������� �߻�޼��带 ������ �Ŀ� ���.
	 * �ڹٳ� �ȵ���̵忡�� ������ ������� �͸��� ���� Ŭ������ �̿��Ͽ� ȭ�鿡�� �̺�Ʈ ó���� ��
	 */
	public static void main(String[] args) {
		Ch14_10MyAnonymousClass t = new Ch14_10MyAnonymousClass();
		// Anony Ŭ�����ν��Ͻ��� �� �κп��� �Ͻ������� ���Ǿ� ����.
		t.printB(new Anony(){ //Anony()�� �������̽�! 
			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�");
			}
		});
	}

}
