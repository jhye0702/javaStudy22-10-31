package Ch07_Array;


public class Ch07_Array09 {

	public static void main(String[] args) {

		/*
		 * 2차원 배열 초기화 및 출력
		 */
		
		int[][]arr = {
					{1, 2, 3},
					{4, 5, 6}
					}; // 2차원 배열 선언
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
 
	}
}
