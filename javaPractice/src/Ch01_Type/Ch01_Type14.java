package Ch01_Type;

public class Ch01_Type14 {

	public static void main(String[] args) {
		/*
		 * 정수와 정수의 연산 결과 값은 정수.
		 * 정수와 실수의 연산 결과 값은 실수.
		 */
		
		byte kor, math, eng; 
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("총점 : " + sum); 		// 총점 : 241
		
		int avg_01 = sum / 3;					// 정수 / 정수
		System.out.println("평균 : " + avg_01); 	// 평균 : 80
		
		double avg_02 = sum / 3;				// 정수 / 정수
		System.out.println("평균 : " + avg_02); 	// 평균 : 80.8 -> 정수 연산으로 정수값이 나온 후에 실수에 저장.
		
		double avg_03 = (double)sum / 3; 		// 실수 / 정수 -> 실수값
		System.out.println("평균 : " + avg_03); 	// 평균 : 80.33333333333333
		
		double avg_04 = sum / 3.0; 				// 정수 / 실수 -> 실수값
		System.out.println("평균 : " + avg_04); 	// 평균 : 80.33333333333333
		
		double avg_05= (double)sum / 3.0; 		// 실수 / 실수 -> 실수값
		System.out.println("평균 : " + avg_05); 	// 평균 : 80.33333333333333
		
	}

}
