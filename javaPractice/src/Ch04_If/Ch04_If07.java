package Ch04_If;

public class Ch04_If07 {

	public static void main(String[] args) {

		/* ��ø for������ ������ ��� */
		// for���� �� �ٸ� for���� ������ �� �ִµ�, �̰��� ��ø for���̶�� ��.
		// �� ��� �ٱ��� for���� �� �� �����Ҷ����� ��ø�� for���� ������ Ƚ����ŭ
		// �ݺ��ؼ� ���ٰ� �ٽ� �ٱ��� for���� ���ư�.
		
		for(int dan = 2; dan <= 9; dan++) { // �ٱ� �� for��. 8�� �ݺ�
			System.out.println("==== " + dan + "�� ====");
			for(int times = 1; times <= 9; times++) { // ��ø for��. 9�� �ݺ�
				System.out.println(dan + " X " + times + " = "+ dan * times);
			}
			System.out.println();
		}
		
	}

}
