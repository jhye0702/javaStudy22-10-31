package Ch09_Class;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	Cellphone(String color, int capacity) { // => �Ű� ������ �ִ� ������ 
											// this�� ���� ���� Ŭ������ String color;����???? �������� String color; ����???? 
		this.color = color;					// this�� ��ü�� ����. this.color => ��ü ������ color�� ����. ��, Ŭ������ color !!
											// ������ �Ȱ���! ������ �ٸ� �� �ε��� ��� )
		this.capacity = capacity;
	/*
	 * �������� Ư¡
	 * 1) Ŭ������ �̸��� ����. 		2) ��ȯ���� ����. 		3) �ν��Ͻ� ������ �� �ѹ��� �ڵ� ����ȴ�.
	 * 
	 * �����ڸ� �������� ������ void �����ڰ� �⺻���� ����
	 * �����ڸ� �����ϸ� �ڹٰ� ������ �Ǵ� void �����ڰ� �����
	 * void �����ڸ� ����Ϸ��� ���� ���Ǹ� ���������
	 */
	}
}


public class Ch09_16 {

	public static void main(String[] args) {

		//Cellphone myphone1 = new Cellphone(); // ���� �߻� Cellphone�� �Ű������� ���� �����ڰ� �ƴϱ� ����,,?
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
