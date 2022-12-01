package Ch15_exeption;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	/* ���� ������ �� */
	public void input() throws IndexOutOfBoundsException {
		System.out.print("���� ���� = ");
		kor = in.nextInt();
		if(kor < 0 || kor > 100) {
			throw new IndexOutOfBoundsException("0~100���� �Է� ����");
		}
	}
	
	public void output() {
		System.out.printf("���� ������ %d �� �Դϴ�.\n", kor);
	}
}

public class Ch15_19 {

	public static void main(String[] args) {
		ExceptionOccur exceptionOccur = new ExceptionOccur();
		try {
			exceptionOccur.input();
			exceptionOccur.output();
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("0~100���� �Է� ����");
		}
	}

}
