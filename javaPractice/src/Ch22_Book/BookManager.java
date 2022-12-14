package Ch22_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

	private ArrayList<Book> list;
	private Scanner scanner;
	
	public BookManager() {
		list = new ArrayList<Book>();
		scanner = new Scanner(System.in);
	}
	
//=================================================��� �޼��� 
	void insertBook() {
		System.out.println("����� å�� ������ �Է����ּ���.");
		Book book = new Book();
		
		System.out.print("å �ڵ� : ");
		book.setBookNum(scanner.nextInt());
		
		System.out.print("å ���� : ");
		book.setTitle(scanner.next());
		
		System.out.print("�۰� : ");
		book.setWriter(scanner.next());
		
		System.out.print("å ��� : ");
		book.setStock(scanner.nextInt());
		
		list.add(book);
		
		System.out.println("������ ��ϵǾ����ϴ�.");
		System.out.println(book);
	}
	
//==============================================�˻� �޼��� (�������� �˻�)
	void search() {
		System.out.print("�˻��� å ���� : ");
		String title = scanner.next();
		
		ArrayList<Book> searchlist = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(title)) {
				searchlist.add(book);
			}
		}
		if (searchlist.size() < 1) {
			System.out.println("�˻��� å�� �����ϴ�");
		}
		else {
			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
			for(Book book: searchlist) {
				System.out.println(book);
			}
		}
	}
// =========================================== �˻� �޼��� ( �ڵ�� å ã��)+
	private Book searchBook(int bookNum) {
		Book book = null;
		for (Book b : list) {
			if (b.getBookNum() == bookNum) {
				book = b;
			}
		}
		return book;
	}
//==============================================�뿩 �޼��� 
	void rentBook() {
		System.out.print("�뿩�� å �ڵ� : ");
		int bookNum = scanner.nextInt();
		
		System.out.print("�뿩 �Ǽ� : ");
		int rent = scanner.nextInt();
		
		Book book = searchBook(bookNum);
		if (book == null) {
			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
			return;
		}
		if (book.getStock() < rent) {
			System.out.println("��� " + book.getStock() + "���̿��� �뿩�� �� �����ϴ�");
		}
		book.setStock(book.getStock() - rent);
		System.out.println(rent + "���� �뿩�Ǿ����ϴ�.");
		
//		for(Book book : list) {
//			if (book.getBookNum() == bookNum) {
//				if(book.getStock() < rent) {
//					System.out.println("���� �������� " +book.getStock()+ "������ �뿩�������� �����մϴ�.");
//				}
//				else if(rent <= 0) {
//					System.out.println("�뿩������ ������ �ƴմϴ�");
//				}
//				else {
//				book.setStock(book.getStock() - rent);
//				System.out.println("�뿩�� �Ϸ�Ǿ����ϴ�");
//				return;
//				}
//			}
//			else {
//				System.out.println("�ش� �ڵ��� å�� ��ϵǾ����� �ʽ��ϴ�.");
//			}
//		}
	}
//===============================================�ݳ� �޼��� 
	void returnBook() {
		System.out.print("�ݳ��� å �ڵ� : ");
		int bookNum = scanner.nextInt();
		
		System.out.print("�ݳ� �Ǽ� : ");
		int returnBook = scanner.nextInt();

		Book book = searchBook(bookNum);
		if (book == null) {
			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
			return;
		}
		book.setStock(book.getStock() + returnBook);
		System.out.println();
		System.out.println(returnBook+ "���� �ݳ��Ǿ����ϴ�.");
		
//		for(Book book : list) {
//			if(book.getBookNum() == bookNum) {
//				book.setStock(book.getStock() + returnBook );
//			}
//			else {
//				System.out.println("�ش� �ڵ��� å�� ��ϵǾ����� �ʽ��ϴ�.");
//			}
//		}
	}
// ================================== å ��ü ��� ��� �޼��� 
	void printBook() {
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
}
