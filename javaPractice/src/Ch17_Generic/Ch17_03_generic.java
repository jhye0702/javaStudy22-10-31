package Ch17_Generic;

// ���׸��� C++ �� ���ø��� ������ ����
// C++ ���� �޸� ���׸� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������,
// ��쿡 ���� �� ��ȯ����� �ż� ���׸��� ��ȣ

// 01. GenericTypeTest
// .���׸�(Generic) : �Ϲ�ȭ, ����ȭ ��� �ǹ̷�
// Ŭ������ �޼��忡�� ����ϴ� �ʵ峪 �Ű������� �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �����ϵ��� �ϴ� ���

class CommonData<T> { // �Ϲ����� ������δ� Ŭ�������� �̸� ������ Ÿ���� �����ؾ������� 
					 // ���׸��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ���� ����.
	// private Object data; 	// Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����.
	private T data; 			// ���� Object Ÿ���� �ƴ� T�� Ÿ���� ����. Type�� ����.
								// Ŭ���� ���𿡼� <> ���̿� �ٸ� ���ڸ� �־ ��
	public T getData() {
		return data;
	}
	public void setData (T data) {
		this.data = data;
	}
}

public class Ch17_03_generic {

	public static void main(String[] args) {
		CommonData<String> stringCommonData = new CommonData<String>(); // ȣ���ϴ� �ʿ��� Ÿ���� ����
		CommonData<Integer> integerCommonData = new CommonData<>();		// �����ϸ鼭 Ÿ���� �����ϸ� �����ڿ����� Ÿ���� ���� ����
		stringCommonData.setData("abc"); // Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����.
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData()); // stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData()); //integerCommonData : abc
	}

}
