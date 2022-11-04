package Ch07_Array;


public class Ch07_Array10 {

	public static void main(String[] args) {

		/*
		 * 5명 학생의 국어, 영어, 수학 성적 테이터를 가지고
		 * 1) 각 학생의 3과목 총점과 평균
		 * 2) 각 과목의 모든 학생의 총점을 구하기
		 */
		
		int[][] score = {
				{ 100, 100, 100 }, // 국어, 영어, 수학
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 },
		};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		
		//System.out.println(score.length); // 5
		for (int i = 0; i < score.length; i++) { // 행
			int sum = 0; // 총점
			
			koreanTotal  += score[i][0];
			englishTotal += score[i][1];
			mathTotal 	 += score[i][2];
			System.out.print(" " + (i + 1) + "\t"); // 번호
			//System.out.println(score[i].length); // 3
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j]; //총점
				System.out.print(score[i][j]+ "\t"); //국어 영어 수학
			}
			System.out.println(sum + "\t" + sum/(float)score[i].length); // 총점 평균
		}
		System.out.println("=======================================");
		System.out.println("총점: \t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal);
	}
}
