package Ch15_exeption;

public class Ch15_07 {

	public static void main(String[] args) {
		// ���� Ŭ������ �ν��Ͻ��� ������ ���� Ű���� throw�� �̿��ϸ� ���� ���ܸ� �߻���ų �� ����.
		try {
			Exception e = new Exception("���� ����"); 
			// ����Ŭ������ �ν��Ͻ� ����. �����ڿ� ���ܹ��� ����
			throw e; // ���ܸ� ����
		//  throw new Exception("���� ����"); // ���� �� ���� �� �ٷ� �ٿ� �� �� �ִ�.
		}
		catch (Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage()); // e.getMessage() : �����ڿ��� ������ ���� ���� ���.
		}
	}

}
