package Ch04_If;

public class Ch04_If02 {

	public static void main(String[] args) {
		/*
		 * if else��
		 */
		
		int age = 15;
		
		if (age > 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		else { // ���� ���� ���� ������ ���� ����
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");

		
		// ------------- ���� if else���� ���� �����ڷ� ������ ���Ѻ��ô�
//		System.out.println(age>19? "�����Դϴ�.\n���� ����� ����˴ϴ�.":"û�ҳ��Դϴ�.\nû�ҳ� ����� ����˴ϴ�.");
//		System.out.println("������ ������ �ּ���.");
	}
}
