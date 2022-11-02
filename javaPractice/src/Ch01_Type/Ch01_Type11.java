package Ch01_Type;

public class Ch01_Type11 {

	public static void main(String[] args) {
		/*
		 * 명시적 형변환 : 개발자가 변수의 자료형을 강제로 바꾸는 것
		 * 형식 : (변환하고자 하는 타입) 변수명;
		 */
		
		int a = -129;
		System.out.println(a);
		
		byte b = (byte)	a; // 명시적 형변환 263 - 256 = 7
		System.out.println(b);  // 값 손실이 됨. byte에서 들어갈 수 있는 범위를 초과했기 때문
		
		// 1byte = 8bit
		// 1bit는 0,1 두 가지로 쓰여진다. 1 byte는 2^8 가지 = 256가지를 표현할 수 있다. (0 ~ 127 까지 양수 128개와 -1 ~ -128 의 음수 128 개) 
		// 1byte 표현할 수 있는 양의 정수는 0~255까지
		// 표현할 수 있는 정수는 -128 ~ 127 (총 256가지)


	}

}
