package Ch12_Inheritance_Practice;

/*
 * ������ �Է¹޴� �����ڸ� �����
 * ��� ������ ������ �� �� �ִ� display() ����.
 */

class Score2 {
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	Score2(int kor, int math, int eng, int com){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	public void display() {
		System.out.println("OK : �ܺο��� ���� ����");
		System.out.println("����=" + kor + " ����=" + math + " ����=" + eng + " ��ǻ��=" + com );
	}

}

public class Ch12_ex06_Score {

	public static void main(String[] args) {
		Score2 score = new Score2(100, 80, 95, 84);
//		s.kor;
		score.display();		// ��� -> OK : �ܺο��� ���� ����

	}

}
