package Ch04_If;

import java.util.Scanner;

public class Ch04_If09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int grade = scanner.nextInt();
		grade = (grade/10)*10; // switch�������� ������ ����ȭ ��Ű�°� �ٽ��Դϴ�!!
		
		switch (grade) {
		case 100: case 90: 
			System.out.println("A�Դϴ�");
			break;
		case 80:
			System.out.println("B�Դϴ�");
			break;
		case 70:
			System.out.println("C�Դϴ�");
			break;
		case 60:
			System.out.println("D�Դϴ�");
			break;
		default:
			System.out.println("F�Դϴ�");
		}
		scanner.close();
	}

}
