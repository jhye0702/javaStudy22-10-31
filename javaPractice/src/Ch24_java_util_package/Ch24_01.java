package Ch24_java_util_package;

//1. �ð� ó��
//�ڹٿ����� �ð��� ���� ó���� �� �ֵ��� Ŭ������ ����
//�ð��� �ٷ�� �ڷ����� ���� long �̸�, java.util.Calendar Ŭ������ java.util.Date, SimpleDataFormat �� ����
public class Ch24_01 {
	public static void main(String[] args) {
//		System.currentTimeMillis() : ���� �ü���� �ð��� long Ÿ������ ��ȯ
//		��ȯ�� �ð��� 1970�� 1�� 1���� �������� ���� �� ��������� �ð��̸� 1/1000 �� �������� ȯ���ؼ� ������
//		�޼��尡 ����Ǵ� ������ �ü�� �ð��� ��ȯ�ϱ� ������ �̿��� �ϸ� �۾� �ҿ� �ð��� ����
		
		long start = System.currentTimeMillis(); // �۾��� �����ϱ� ���� �ð� ��ȯ
		System.out.println("���۽ð� : " + start);
		int a = 0;
		for (int i = 1; i < 100000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis(); // �۾��� ���� ���� �ð� ��ȯ
		System.out.println("���� �ð� : " +  end);
		System.out.println("�ɸ� �۾� �ð� : "  + (end - start));
//		���۽ð� : 1671151512869
//		���� �ð� : 1671151512872
//		�ɸ� �۾� �ð� : 3
	}
}
