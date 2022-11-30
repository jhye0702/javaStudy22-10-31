package Ch14_innerclass;

/*
 MyOuter2. test() �� ȣ���ؼ� �Ʒ��� ���� ����� �ǵ��� main() �޼��� �ۼ�
 '[ �� ���� ] �̸� : ȫ�浿, ���� : 20, �ּ� : ������ ������'
 */

class MyOuter2 {
	private String name;
	private int age;
	
	public MyOuter2 (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// ============================== test() �ȿ� ���� Ŭ���� Inner ===========================
	public void test() {
		int num = 4;
		
		class Inner {
			private String address;
			public Inner (String address) {
				this.address = address;
			}
			public String getCustomerInfo() {
				System.out.println("inner_test() : " + num);
				return "�̸� : " +name+ ", ���� : " +age+ ", �ּ� : " + address;
			}
		}// end Inner_class
		Inner inner = new Inner("������ ������");
		System.out.println("[ �� ���� ] " + inner.getCustomerInfo());
	}
}

public class Ch14_08 {

	public static void main(String[] args) {
		MyOuter2 outer = new MyOuter2 ( "ȫ�浿", 20 );
		
		outer.test();
	}

}
