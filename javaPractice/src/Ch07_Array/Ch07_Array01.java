package Ch07_Array;

public class Ch07_Array01 {

	public static void main(String[] args) {

		int[] student = new int[3]; //���̰� 3�� �迭 ����
		System.out.println("���� �ڵ����� �ʱ�ȭ �� ��: " + student[0]);
		
		student[0] = 30; // �迭�� ù ��° ��ҿ� 30�� ����
		student[1] = 20; // �迭�� �� ��° ��ҿ� 30�� ����
		student[2] = 10; // �迭�� �� ��° ��ҿ� 30�� ����
		
		System.out.println("���� ù ��° ����� ��:" + student[0]);
		
	}
}
