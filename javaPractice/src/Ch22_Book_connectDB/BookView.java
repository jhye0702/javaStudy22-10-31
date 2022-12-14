package Ch22_Book_connectDB;

import java.util.Scanner;

public class BookView {
	public static void main(String[] args) {
	BookManager book = new BookManager();
	Scanner scanner = new Scanner(System.in);
	
	
	while(true) {
		printMenu();
		System.out.println("선택 : ");
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
				System.out.println("종료합니다.");
				scanner.close();
				return;
			default:
				System.out.println("잘못누르셨습니다.\n다시 입력하세요.");
		}
	}

	}
	private static void printMenu() {
		System.out.println("=============== 실행 메뉴 선택 ================");
		System.out.println(" 1. 책 등록 ");
		System.out.println(" 2. 책 검색 ");
		System.out.println(" 3. 책 대여 ");
		System.out.println(" 4. 책 반납 ");
		System.out.println(" 5. 책 전체 출력 ");
		System.out.println(" 6. 종료 ");
	}
}
