package Ch01_Type;

public class Ch01_Type10 {

	public static void main(String[] args) {
		/* �ڵ� ����ȯ�� ���α׷� �ۼ��ڰ� ������ �۾��� ���� �ʾƵ�
		 * �ڹٰ� �˾Ƽ� �˸��� Ÿ������ ��ȯ.
		 * ���� �������� ū ������ ����Ǵ� ��� -> �� �ս��� ����.
		 * ū �������� ���� ������ ����� ���� ������ ������ -> �� ���������� ��ȯ�Ǵ� ���¸� �����־����..?!
		 */
		
		byte a = 127; // byte�� ���� �� �ִ� �ִ밪
		int b = a; // �ڵ� ����ȯ (byte -> int)
		System.out.println(b);
		// a = b; // float �ڷ����� byte ������ �����ϸ� �ڵ�����ȯ�� �ȵ�.
		
		float c = b; // �ڵ� ����ȯ (int -> float)
		System.out.println(c);
		
		// int d = c; // float �ڷ����� int ������ �����ϸ� �ڵ�����ȯ�� �ȵ�.
		// �ֳĸ� �� �� ��ü�� �������� �� �ƴϱ� ����...? �ڷ����� �߿���!
	}

}