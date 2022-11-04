package Ch07_Array;

public class Ch07_Array04 {

	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화한다.
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화한다.
		
		for ( int i = 1; i < score.length; i++) { // i가 1부터 시작하는 이유는 최대,최소값으로 0을 넣어주었기 때문이다.
			if (score[i] > max) { 
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}// end of for
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
}
