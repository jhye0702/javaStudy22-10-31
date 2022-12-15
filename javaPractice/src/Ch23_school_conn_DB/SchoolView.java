package Ch23_school_conn_DB;

import java.util.Scanner;

public class SchoolView {
	public static void main(String[] args) {
		
		SchoolManage studentManage = new SchoolManage();
		Scanner input = new Scanner(System.in);
		System.out.println("teacher�л� ���� ���α׷��� �����մϴ�.");
		
		while(true) {
			System.out.println("�޴��� �����ϼ���. >>> ");
			System.out.println("1. �л��߰� �� ���� / 2. �л����� / 3. ������û/ 4. �����Է�"
							+ "/ 5. ������ȸ / 6. �������� ���� / 7.���α׷� ����");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�л� �߰� �� ���� �޴��Դϴ�.");
				studentManage.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴��Դϴ�.");
				studentManage.removeStudent();
				// ��ü ������ ���� �ʰ�, Ŭ�������� �ٷ� �޼���� ������ �߱� ������
				// �޼���� static���� ����Ǿ�� �ٷ� ����� �����ϴ�.
				break;
			case 3:
				System.out.println("���� ��û �޴��Դϴ�.");
				studentManage.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴��Դϴ�.");
				studentManage.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴��Դϴ�.");
				studentManage.informStudent();
				break;
			case 6:
				System.out.println("�������� ���� �޴��Դϴ�.");
				System.out.println("���� �޴��� �����ϼ���. >>> ");
				while(true) {
					System.out.println("1.�������� ��� / 2.�������� ���� / 3. ��ϰ��� ��ȸ / 4. ���θ޴���");
					int manageMenu;
					manageMenu = input.nextInt();
					
					switch (manageMenu) {
						case 1 : 
							System.out.println("===== �������� ��� �޴� =====");
							studentManage.insertSubject();
							continue;
						case 2 : 
							System.out.println("===== �������� ���� �޴� =====");
							studentManage.removeSubject();
							continue;
						case 3 :
							System.out.println("===== ��ϰ��� ��ȸ =====");
							studentManage.printSubjectAll();
							continue;
						case 4 : 
							 break;
						default :
							System.out.println("���� �޴��� �����Ͽ����ϴ�.");
							continue;
					}
					break;
				}
				break;
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			}
		}
	}
}