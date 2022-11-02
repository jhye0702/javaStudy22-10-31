package Ch01_Type;

public class Ch01_Type15 {
		
	public static void main(String[] args) {
		/*
		 * 상수 : 프로그램 실행 중에 변경할 수 없는 고정된 값. 변수와는 다르게 상수 전체를 대문자로 선언.
		 * 		대문자 선언하는 것은 개발자들이 공동작업할 때 상수임을 쉽게 확인할 수 있도록 하는 것.
		 * 형식 : final 데이터타입 상수명 = 값;
		 * 상수는 사용되는 빈도가 매우 낮은 편입니다
		 */
		
		int a = 3;
		a = 4;
		
		final double PI = 3.14;
		// PI = 3.15; // 에러발생
	
}
}
