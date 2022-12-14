package Ch22_Book_connectDB;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

	private ArrayList<Book> list;
	private Scanner scanner;
	private BookDAO bookDAO;
	
	public BookManager() {
		list = new ArrayList<Book>();
		scanner = new Scanner(System.in);
		bookDAO = new BookDAO();
	}
	
	public void disConnect() {
		bookDAO.disConnect();
	}
	
//=================================================��� �޼��� 
	public void insertBook() {
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
		
//		list.add(book);
		if (bookDAO.insertBook(book)) {
			System.out.println("å�� ��ϵǾ����ϴ�.");
		}
		else {
			System.out.println("���� ��Ͽ� �����߽��ϴ�.");
		}
		
//		System.out.println("������ ��ϵǾ����ϴ�.");
//		System.out.println(book);
	}
	
//==============================================�˻� �޼��� (�������� �˻�)
//	void search() {
//		System.out.print("�˻��� å ���� : ");
//		String title = scanner.next();
//		
//		Book book = bookDAO.selectOne(title);
//		
//		if(book != null) {
//			if(book.getTitle() == title) {
//				System.out.println("å �ڵ�\tå ����\t�۰�\t������");
//				System.out.println(book.getBookNum()+"\t"
//								+book.getTitle()+"\t"
//								+book.getWriter()+"\t"
//								+book.getStock());;
//				return;
//			}
//			else {
//				System.out.println("�˻��Ͻ� ������ å�� �����ϴ�.");
//			}
//		}
//		
//		ArrayList<Book> searchlist = new ArrayList<>();
//		for(Book book : list) {
//			if(book.getTitle().contains(title)) {
//				searchlist.add(book);
//			}
//		}
//		if (searchlist.size() < 1) {
//			System.out.println("�˻��� å�� �����ϴ�");
//		}
//		else {
//			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
//			for(Book book: searchlist) {
//				System.out.println(book);
//			}
//		}
//	}
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
		
		if (bookDAO.isBook(bookNum)) {
			Book book = bookDAO.selectOne(bookNum);
			if (book.getStock() < rent) {
				System.out.println("�뿩������ å�� ����" + book.getStock() + "���� �뿩�� �Ұ����մϴ�.");
			}
			else {
				bookDAO.updateStock(bookNum, rent, false);
				System.out.println(rent +"�� �뿩�� �Ϸ�Ǿ����ϴ�.");
			}
			return;
		}
		else {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�.");
		}
		
//		Book book = searchBook(bookNum);
//		if (book == null) {
//			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
//			return;
//		}
//		if (book.getStock() < rent) {
//			System.out.println("��� " + book.getStock() + "���̿��� �뿩�� �� �����ϴ�");
//		}
//		book.setStock(book.getStock() - rent);
//		System.out.println(rent + "���� �뿩�Ǿ����ϴ�.");
		
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
		
		if (bookDAO.isBook(bookNum)) {
			bookDAO.updateStock(bookNum, returnBook, true);
			System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�.");
		}

//		Book book = searchBook(bookNum);
//		if (book == null) {
//			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
//			return;
//		}
//		book.setStock(book.getStock() + returnBook);
//		System.out.println();
//		System.out.println(returnBook+ "���� �ݳ��Ǿ����ϴ�.");
		
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
		ArrayList<Book> list = bookDAO.selectAll();
		System.out.println("å �ڵ�\t����\t�۰�\t������");
		for(Book book : list) {
			System.out.println(book.getBookNum()+"\t"
							+book.getTitle()+"\t"
							+book.getWriter()+"\t"
							+book.getStock());
		}
		
//		for(Book book : list) {
//			System.out.println(book);
//		}
	}
	
}
