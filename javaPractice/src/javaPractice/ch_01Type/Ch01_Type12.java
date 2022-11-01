package javaPractice.ch_01Type;

public class Ch01_Type12 {

	public static void main(String[] args) {
		/* 문자열을 기본 타입으로 강제 타입 변환
		 * String은 int나 char처럼 기본 자료 타입이 아니라
		 * 클래스의 객체 형태라서 일반적인 형변환과 다름.
		 */
		
		String str = "1a";
		//int value = Integer.parseInt(str); // 문자열에 숫자외의 문자가 있으면 변환되지 않음.
				
		// String -> byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); // 10
		
		// String -> short	
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); // 200
		
		// String -> int
		String str3 = "300000";
		int value3 = Integer.parseInt(str3); // 다른 형과 다르게 int 는 Integer로 적어주어야합니당
		System.out.println(value3); // 300000
		 
		// String -> long
		String str4 = "400000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4); // 400000000
		
		// String -> float
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); // 12.345
		
		// String -> double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); // 12.345
		
		// String -> boolean
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println(value7); // true
 	}

}
// 자바는 함수가 어딘가에 소속이 되어 있어야합니다. 
// Float 클래스 안의 parseFloat이라는 함수라는 걸 나타냅니다. -> Float.parseFloat();