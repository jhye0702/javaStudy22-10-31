package Ch16_package.object;
// object Ŭ������ ��� Ŭ������ ���� !
// object Ŭ������ �ִ� �޼������ ���ô� !!!!!!
// �ڹٿ� �ִ� ��� Ŭ������ object Ŭ������ �������̵� �� �� �ֽ��ϴ� �׷��� ���ϴ�
// ��ǥ���� �� 




/* toString() */




class Book {
	int bookNumber;		// å��ȣ
	String bookTitle;	// ����
	
	Book(int bookNumber, String bookTitle) {	// å ��ȣ�� ������ �Ű������� �Է¹޴� ������
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	// toString() �޼��带 ���� �������ϸ� ��ü�� ���� ������ �̿��� ���ϴ� ���ڿ��� ǥ��.
//	@Override
//	public String toString() {
//		return bookTitle + ", " + bookNumber;
//	}
}

public class Ch16_01_toString {
	/* Object Ŭ������ toString() �޼��� �̿��ϱ� */
	public static void main(String[] args) {

		Book book1 = new Book (200, "����");
		
		// String toString() : ��ü�� ���ڿ��� ǥ���Ͽ� ��ȯ. �������Ͽ� ��ü�� ���� �����̳� Ư�� ��� ������ ��ȯ
		
		// �ν��Ͻ� ���� (Ŭ���� �̸�, �ּ� ��)
		// println �� �����鼭 ���ڿ��� ����ȯ�� �˴ϴ�.
		System.out.println(book1); 
		
		// toString �޼���� �ν��Ͻ� ����(Ŭ���� �̸�, �ּ� ��)�� ������.
		System.out.println(book1.toString()); 
	}

}
