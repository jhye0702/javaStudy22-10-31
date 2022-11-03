package Ch06_While_Break_Continue;

public class Ch04_Continue01 {

	public static void main(String[] args) {
		/*
		 * Continue문
		 * 0~100까지의 홀수만 더함
		 */

		int total = 0;
		int num;
		// ==================if문과 continue 사용하여 코딩
		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;
			}
			total += num;
			
			/* continue 없이 하는 방법
			 if (num % 2 == 1) {
			 	total += num;
			 }
			 */
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다");
	
		// ==================for문 만으로 코딩 (조건식에서 num증감식을 바꾼다)
//		for (num = 1; num <= 100; num+=2) {
//			total += num;
//		}
//		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다");
	
	}
}
