package javaPractice.ch_01Type;

public class Ch01_Type10 {

	public static void main(String[] args) {
		/* 자동 형변환은 프로그램 작성자가 별도의 작업을 하지 않아도
		 * 자바가 알아서 알맞은 타입으로 변환.
		 * 작은 범위에서 큰 범위로 변경되는 경우 -> 값 손실이 없음.
		 * 큰 범위에서 작은 범위로 변경될 때는 무조건 에러남 -> 꼭 명시적으로 변환되는 형태를 적어주어야함..?!
		 */
		
		byte a = 127; // byte가 가질 수 있는 최대값
		int b = a; // 자동 형변환 (byte -> int)
		System.out.println(b);
		// a = b; // float 자료형을 byte 변수에 대입하면 자동형변환이 안됨.
		
		float c = b; // 자동 형변환 (int -> float)
		System.out.println(c);
		
		// int d = c; // float 자료형을 int 변수에 대입하면 자동형변환이 안됨.
		// 왜냐면 그 값 자체를 가져오는 게 아니기 때문...? 자료형이 중요함!
	}

}
