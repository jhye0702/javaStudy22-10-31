package Ch07_Array;


public class Ch07_Array12 {

	public static void main(String[] args) {

		/*
		 * 각 행의 열의 갯수가 다른 경우
		 * 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구하세요
		 */
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//작성위치
		int count = 0; // 각각의 갯수가 다른 2차원 배열이라 식으로 구할 수 없고, 카운팅을 해야함.
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println("sum : " + sum); // 881
		System.out.println("avg : " + avg); // 88.1
		
	}
}
