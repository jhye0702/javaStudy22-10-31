package Ch12_Inheritance_Practice;

/*
 * 점수를 입력받는 생성자를 만들고
 * 모든 과목의 점수를 볼 수 있는 display() 생성.
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
		System.out.println("OK : 외부에서 접근 가능");
		System.out.println("국어=" + kor + " 수학=" + math + " 영어=" + eng + " 컴퓨터=" + com );
	}

}

public class Ch12_ex06_Score {

	public static void main(String[] args) {
		Score2 score = new Score2(100, 80, 95, 84);
//		s.kor;
		score.display();		// 출력 -> OK : 외부에서 접근 가능

	}

}
