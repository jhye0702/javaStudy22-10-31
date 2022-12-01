package Ch16_package.object;

public class Ch17_03 {
	public static void main(String[] args) {
		/* boolean equals(Object obj)
		 * 두 인스턴스가 동일한지 여부를 반환.
		 * 재정의하여 논리적으로 동일한 인스턴스임을 정의할 수 있음.
		 * equals() 메서드의 원래 기능은 두 인스턴스의 주소값을 비교하여 boolean값(true/false)을 반환해주는 것
		 * 
		 * 주소 값이 같다면 당연히 같은 인스턴스이지만, 서로 다른 주소를 가질 때도 같은 인스턴스라고 정의할 수 있는 경우가 있음.
		 * 따라서 물리적 동일성(인스턴스의 메모리 주소가 같음)뿐 아니라 논리적 동일성(논리적으로 두 인스턴스가 같음)을
		 * 구현할 때도 equals()메서드를 재정의하여 사용
		 */
		
		// String, Integer 클래스의 equals() 메서드 재정의
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false. 두 스트링 인스턴스의 주소 값은 다름
		System.out.println(str1.equals(str2)); // true. String 클래스의 equals 메소드가 재정의 됨
		// 원래 false가 나와야 맞는데 String으로 객체 생성이 되면서 글자 내용만 같으면 같다고 true가 나옴!
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2); 		// false. 두 정수 인스턴스의 주소 값은 다름
		System.out.println(i1.equals(i2)); 	// true. Integer 클래스의 equals 메소드가 재정의 됨.
		
		i1 = i2;
		System.out.println(i1 == i2 ); // true. == 은 두 변수값이 같은지 비교
	}
}
