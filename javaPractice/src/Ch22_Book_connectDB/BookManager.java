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
	
//=================================================등록 메서드 
	public void insertBook() {
		System.out.println("등록할 책의 정보를 입력해주세요.");
		Book book = new Book();
		
		System.out.print("책 코드 : ");
		book.setBookNum(scanner.nextInt());
		
		System.out.print("책 제목 : ");
		book.setTitle(scanner.next());
		
		System.out.print("작가 : ");
		book.setWriter(scanner.next());
		
		System.out.print("책 재고 : ");
		book.setStock(scanner.nextInt());
		
//		list.add(book);
		if (bookDAO.insertBook(book)) {
			System.out.println("책이 등록되었습니다.");
		}
		else {
			System.out.println("도서 등록에 실패했습니다.");
		}
		
//		System.out.println("도서가 등록되었습니다.");
//		System.out.println(book);
	}
	
//==============================================검색 메서드 (제목으로 검색)
//	void search() {
//		System.out.print("검색할 책 제목 : ");
//		String title = scanner.next();
//		
//		Book book = bookDAO.selectOne(title);
//		
//		if(book != null) {
//			if(book.getTitle() == title) {
//				System.out.println("책 코드\t책 제목\t작가\t재고수량");
//				System.out.println(book.getBookNum()+"\t"
//								+book.getTitle()+"\t"
//								+book.getWriter()+"\t"
//								+book.getStock());;
//				return;
//			}
//			else {
//				System.out.println("검색하신 제목의 책이 없습니다.");
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
//			System.out.println("검색된 책이 없습니다");
//		}
//		else {
//			System.out.println("검색한 책의 정보는 아래와 같습니다.");
//			for(Book book: searchlist) {
//				System.out.println(book);
//			}
//		}
//	}
// =========================================== 검색 메서드 ( 코드로 책 찾기)+
	private Book searchBook(int bookNum) {
		Book book = null;
		for (Book b : list) {
			if (b.getBookNum() == bookNum) {
				book = b;
			}
		}
		return book;
	}
//==============================================대여 메서드 
	void rentBook() {
		System.out.print("대여할 책 코드 : ");
		int bookNum = scanner.nextInt();
		
		System.out.print("대여 권수 : ");
		int rent = scanner.nextInt();
		
		if (bookDAO.isBook(bookNum)) {
			Book book = bookDAO.selectOne(bookNum);
			if (book.getStock() < rent) {
				System.out.println("대여가능한 책의 수는" + book.getStock() + "으로 대여가 불가능합니다.");
			}
			else {
				bookDAO.updateStock(bookNum, rent, false);
				System.out.println(rent +"권 대여가 완료되었습니다.");
			}
			return;
		}
		else {
			System.out.println("해당 코드의 책이 존재하지 않습니다.");
		}
		
//		Book book = searchBook(bookNum);
//		if (book == null) {
//			System.out.println("입력하신 코드의 책은 없습니다.");
//			return;
//		}
//		if (book.getStock() < rent) {
//			System.out.println("재고가 " + book.getStock() + "권이여서 대여할 수 없습니다");
//		}
//		book.setStock(book.getStock() - rent);
//		System.out.println(rent + "권이 대여되었습니다.");
		
//		for(Book book : list) {
//			if (book.getBookNum() == bookNum) {
//				if(book.getStock() < rent) {
//					System.out.println("현재 재고수량이 " +book.getStock()+ "권으로 대여수량보다 부족합니다.");
//				}
//				else if(rent <= 0) {
//					System.out.println("대여가능한 수량이 아닙니다");
//				}
//				else {
//				book.setStock(book.getStock() - rent);
//				System.out.println("대여가 완료되었습니다");
//				return;
//				}
//			}
//			else {
//				System.out.println("해당 코드의 책이 등록되어있지 않습니다.");
//			}
//		}
	}
//===============================================반납 메서드 
	void returnBook() {
		System.out.print("반납할 책 코드 : ");
		int bookNum = scanner.nextInt();
		
		System.out.print("반납 권수 : ");
		int returnBook = scanner.nextInt();
		
		if (bookDAO.isBook(bookNum)) {
			bookDAO.updateStock(bookNum, returnBook, true);
			System.out.println("반납이 완료되었습니다.");
		}
		else {
			System.out.println("해당 코드의 책이 존재하지 않습니다.");
		}

//		Book book = searchBook(bookNum);
//		if (book == null) {
//			System.out.println("입력하신 코드의 책은 없습니다.");
//			return;
//		}
//		book.setStock(book.getStock() + returnBook);
//		System.out.println();
//		System.out.println(returnBook+ "권이 반납되었습니다.");
		
//		for(Book book : list) {
//			if(book.getBookNum() == bookNum) {
//				book.setStock(book.getStock() + returnBook );
//			}
//			else {
//				System.out.println("해당 코드의 책이 등록되어있지 않습니다.");
//			}
//		}
	}
// ================================== 책 전체 목록 출력 메서드 
	void printBook() {
		ArrayList<Book> list = bookDAO.selectAll();
		System.out.println("책 코드\t제목\t작가\t재고수량");
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
