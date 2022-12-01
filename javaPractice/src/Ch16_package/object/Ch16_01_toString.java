package Ch16_package.object;
// object 클래스는 모든 클래스의 조상 !
// object 클래스에 있는 메서드들을 봅시다 !!!!!!
// 자바에 있는 모든 클래스가 object 클래스를 오버라이딩 할 수 있습니당 그래서 봅니당
// 대표적인 것 




/* toString() */




class Book {
	int bookNumber;		// 책번호
	String bookTitle;	// 제목
	
	Book(int bookNumber, String bookTitle) {	// 책 번호와 제목을 매개변수로 입력받는 생성자
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	// toString() 메서드를 직접 재정의하면 객체의 참조 변수를 이용해 원하는 문자열을 표현.
//	@Override
//	public String toString() {
//		return bookTitle + ", " + bookNumber;
//	}
}

public class Ch16_01_toString {
	/* Object 클래스의 toString() 메서드 이용하기 */
	public static void main(String[] args) {

		Book book1 = new Book (200, "개미");
		
		// String toString() : 객체를 문자열로 표현하여 반환. 재정의하여 객체에 대한 설명이나 특정 멤버 변수를 반환
		
		// 인스턴스 정보 (클래스 이름, 주소 값)
		// println 에 들어오면서 문자열로 형변환이 됩니다.
		System.out.println(book1); 
		
		// toString 메서드로 인스턴스 정보(클래스 이름, 주소 값)을 보여줌.
		System.out.println(book1.toString()); 
	}

}
