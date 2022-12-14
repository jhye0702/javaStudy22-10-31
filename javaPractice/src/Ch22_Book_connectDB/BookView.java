package Ch22_Book_connectDB;

import java.util.Scanner;

public class BookView {
	public static void main(String[] args) {
	BookManager book = new BookManager();
	Scanner scanner = new Scanner(System.in);
	
	
	while(true) {
		printMenu();
		System.out.println("���� : ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1 :
				book.insertBook();
				break;
			case 2 :
//				book.search();
				break;
			case 3 :
				book.rentBook();
				break;
			case 4 :
				book.returnBook();
				break;
			case 5 :
				book.printBook();
				break;
			case 6 :
				System.out.println("�����մϴ�.");
				scanner.close();
				return;
			default:
				System.out.println("�߸������̽��ϴ�.\n�ٽ� �Է��ϼ���.");
		}
	}

	}
	private static void printMenu() {
		System.out.println("=============== ���� �޴� ���� ================");
		System.out.println(" 1. å ��� ");
		System.out.println(" 2. å �˻� ");
		System.out.println(" 3. å �뿩 ");
		System.out.println(" 4. å �ݳ� ");
		System.out.println(" 5. å ��ü ��� ");
		System.out.println(" 6. ���� ");
	}
}
