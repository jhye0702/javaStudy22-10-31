package Ch22_Book;

public class Book {
	
	private int bookNum;	// 책 코드
	private String title;	// 책 제목
	private String writer;	// 책 작가
	private int stock;		// 책 재고수
	
	public Book () {
		
	}
	
	public Book(int bookNum, String title, String writer, int stock) {
		this.bookNum = bookNum;
		this.title = title;
		this.writer = writer;
		this.stock = stock;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "book [bookNum=" + bookNum + ", name=" + title + ", writer=" + writer + ", stock=" + stock + "]";
	}
}
