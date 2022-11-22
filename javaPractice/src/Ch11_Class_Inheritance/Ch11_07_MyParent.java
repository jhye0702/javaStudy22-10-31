package Ch11_Class_Inheritance;

class MyParent{
	public void pDisplay(){
		System.out.println("Super: Parent's Display");
	}
}
class MyChild extends MyParent {

	// ���� Ŭ������ �޼��带 ������ �Ѵ�.
	@Override
	public void pDisplay() {
		// ���е� ���� Ŭ������ �޼��带 super�� ȣ���Ѵ�.
		super.pDisplay();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
	
}

public class Ch11_07_MyParent {

	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.pDisplay(); 		// ������ �� ���� Ŭ������ �޼��带 ȣ���Ѵ�.
		c.cDisplay();
		/*
		Super: Parent's Display
		Sub Class: Parent's Display
		 */
	}

}
