package Ch12_Inheritance_Practice;

/*
 * 일반적인 사각형을 나타내는 Rectangle 클래스가 있다.
 * Rectangle 클래스를 상속받앙서 색이 있는 사각형을 나타내는 ColorRectangle 클래스르 ㄹ정의한다.
 * ColorRectangle 클래스는 색상을 나타내는 필드 color 가 추가된다.
 * ColorRectangle 클래스와 생성자를 작성하라
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
		System.out.println(kor + "는 올바른 값(범위 0~ 100)이 아닙니다.");
		}
	}

}

public class Ch12_ex05_Score {

	public static void main(String[] args) {
		Score score = new Score();
//		score.kor = -500; 			// private으로 바꿨기에 접근 불가함
		score.setKor(-500);			// 점수를 저장하는데 잘못된 값 (마이너스)가 입력됨.

	}

}
