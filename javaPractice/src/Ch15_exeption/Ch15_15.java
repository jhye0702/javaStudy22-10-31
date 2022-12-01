package Ch15_exeption;

/* 사용자 정의 예외 만들기 */
class MyScore {
	private int score;
	public void setScore(int s) throws MyException {
		if (s < 0)
			throw new MyException("점수는 음수가 될 수 없습니다.");
		else
			this.score = s;
	}
}



public class Ch15_15 {

	public static void main(String[] args) {
		MyScore obj = new MyScore();
		try {
			obj.setScore(-10);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
class MyException extends Exception{ // 사용자 정의 예외를 만든 것
	public MyException(String msg) {
		super(msg);
	}
}
