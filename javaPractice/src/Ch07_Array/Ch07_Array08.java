package Ch07_Array;


public class Ch07_Array08 {

	public static void main(String[] args) {

		/*
		 * 2차원 배열 선언 및 출력
		 */
		
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length ; i++) {
			for (int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("행: " + arr.length); // 2
		System.out.println("열: " + arr[0].length); // 3
	}
}
