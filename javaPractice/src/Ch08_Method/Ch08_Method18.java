package Ch08_Method;


public class Ch08_Method18 {
	
	/*
	 * �޼��� �������� �޼��� ȣ��
	 * �޼��忡�� �ٸ� �޼��带 ȣ���ϸ� �޼���� ������ ���߰�, �ٸ� �޼��尡 ���� �� ������ ��ٸ�.
	 * ȣ���� �޼��尡 ���ᰡ �Ǹ� ������ �ڵ尡 ������ ��.
	 */
	
	// main() -> firstMethod() -> secondMethod()
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");	
	}
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���.");
		secondMethod();
		System.out.println("firstMethod()�� ������.");
	}
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���.");
		System.out.println("secondMethod()�� ������.");
	}
}