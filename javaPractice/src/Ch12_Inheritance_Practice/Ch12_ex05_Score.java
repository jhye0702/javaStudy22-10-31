package Ch12_Inheritance_Practice;

/*
 * �Ϲ����� �簢���� ��Ÿ���� Rectangle Ŭ������ �ִ�.
 * Rectangle Ŭ������ ��ӹ޾Ӽ� ���� �ִ� �簢���� ��Ÿ���� ColorRectangle Ŭ������ �������Ѵ�.
 * ColorRectangle Ŭ������ ������ ��Ÿ���� �ʵ� color �� �߰��ȴ�.
 * ColorRectangle Ŭ������ �����ڸ� �ۼ��϶�
 */

class Score {
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;
		}
		else {
		System.out.println(kor + "�� �ùٸ� ��(���� 0~ 100)�� �ƴմϴ�.");
		}
	}

}

public class Ch12_ex05_Score {

	public static void main(String[] args) {
		Score score = new Score();
//		score.kor = -500; 			// private���� �ٲ�⿡ ���� �Ұ���
		score.setKor(-500);			// ������ �����ϴµ� �߸��� �� (���̳ʽ�)�� �Էµ�.

	}

}
