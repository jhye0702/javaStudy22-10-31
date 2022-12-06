package Ch16_package.object;

/*
 book1 ��ü�� book2�� ������ �� �ְ�  clone() �޼��带 �������̵� �϶�.
 */

class MyBook implements Cloneable {
	String title;
	
	public MyBook(String title) {
		this.title = title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}


public class Ch16_10_clone_Ex {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyBook book1 = new MyBook("�ڹ�");
		MyBook book2 = (MyBook)book1.clone();
		System.out.println(book2.title);
		
		
	}

}
