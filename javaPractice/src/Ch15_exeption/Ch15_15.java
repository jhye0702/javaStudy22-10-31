package Ch15_exeption;

/* ����� ���� ���� ����� */
class MyScore {
	private int score;
	public void setScore(int s) throws MyException {
		if (s < 0)
			throw new MyException("������ ������ �� �� �����ϴ�.");
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
class MyException extends Exception{ // ����� ���� ���ܸ� ���� ��
	public MyException(String msg) {
		super(msg);
	}
}
