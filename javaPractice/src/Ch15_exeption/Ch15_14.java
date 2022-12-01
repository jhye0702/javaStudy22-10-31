package Ch15_exeption;

class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}

public class Ch15_14 {

	public static void ticketing(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException ("나이 입력이 잘못되었습니다.");
		}
	}
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeException e) {
			e.printStackTrace();
		}
	}

}
