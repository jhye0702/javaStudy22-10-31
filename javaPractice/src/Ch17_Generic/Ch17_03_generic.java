package Ch17_Generic;

// 제네릭은 C++ 의 템플릿이 발전한 형태
// C++ 과는 달리 제네릭 대신 Object를 사용하면 모든 데이터 타입을 사용할 수 있지만,
// 경우에 따라 형 변환해줘야 돼서 제네릭을 선호

// 01. GenericTypeTest
// .제네릭(Generic) : 일반화, 범용화 라는 의미로
// 클래스나 메서드에서 사용하는 필드나 매개변수의 자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능

class CommonData<T> { // 일반적인 방식으로는 클래스에서 미리 데이터 타입을 지정해야하지만 
					 // 제네릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정.
	// private Object data; 	// 클래스의 데이터 타입이 Object라서 모든 데이터 타입이 사용 가능.
	private T data; 			// 위의 Object 타입이 아닌 T로 타입을 지정. Type의 약자.
								// 클래스 선언에서 <> 사이에 다른 문자를 넣어도 됨
	public T getData() {
		return data;
	}
	public void setData (T data) {
		this.data = data;
	}
}

public class Ch17_03_generic {

	public static void main(String[] args) {
		CommonData<String> stringCommonData = new CommonData<String>(); // 호출하는 쪽에서 타입을 지정
		CommonData<Integer> integerCommonData = new CommonData<>();		// 선언하면서 타입을 지정하면 생성자에서는 타입을 생략 가능
		stringCommonData.setData("abc"); // 클래스의 데이터 타입이 Object라서 모든 데이터 타입이 사용 가능.
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData()); // stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData()); //integerCommonData : abc
	}

}
