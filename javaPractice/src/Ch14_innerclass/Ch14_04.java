package Ch14_innerclass;

/*
 �ν��Ͻ� ���� Ŭ������ ���ǿ� ����
 
 �ܺ� Ŭ������ ���ó�� ���ǵ� Ŭ����
 ���� Ŭ������ ����Ϸ��� ���� �ܺ� Ŭ������ �ν��Ͻ��� ������ �� �����ؾ� ��.
 */

/*
 
 Inner.getCustomerInfo()�� ȣ���ؼ� �Ʒ� ������ �������� main() �޼��� �ۼ�
 '�� ���� >> �̸� : ȫ�浿, ���� : 20, �ּ� : ������ ������'
 */

class MyOuter1 {
	private String name;
	private int age;
	
	public MyOuter1 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// ====================== ���� Ŭ������ �����Ѵ�. ==========================
	public class Inner {
		private String address;
		public Inner (String address) {
			this.address = address;
		}
		
		public String getCustomerInfo() {
			return "�̸� : " +name+ ", ���� : " +age+ ", �ּ� : " + address;
		}
	}
}
public class Ch14_04 {
	// ============================= ���� =========== =================
	public static void main(String[] args) {
		MyOuter1 outClass = new MyOuter1("ȫ�浿", 20);
		MyOuter1.Inner inClass = outClass.new Inner("������ ������");
//		MyOuter1.Inner inClass = new MyOuter1("ȫ�浿", 20).new Inner("������ ������");
		
		System.out.println("������ >> " + inClass.getCustomerInfo());
		
	}
}
