package Ch16_package.object;

public class Ch16_14_longCurrentTimeMillis {

	public static void main(String[] args) {
		// ���ڿ��� ���� ����ϴµ� �ɸ��� �ð��� ����
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + "��° ��");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " �� �ɸ�");
	}

}
