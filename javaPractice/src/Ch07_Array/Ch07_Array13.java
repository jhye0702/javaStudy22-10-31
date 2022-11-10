package Ch07_Array;

import java.util.Scanner;

public class Ch07_Array13 {

	public static void main(String[] args) {

		/*
		 * 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다
		 * 실행 결과를 보고 알맞게 작성해보세요
		 */
		
		boolean run = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료
		int studentNum = 0; // 학생수
		int[] scores = null; // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				// 학생 수를 입력 받아서 배열 생성
				System.out.print("학생 수 입력 : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				// 생성된 배열의 갯수만큼 점수 입력
				for( int i = 0; i < scores.length; i++ ) {
					System.out.print("scores[" +i+ "] >");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				// 입력받은 배열의 값을 출력
				for( int i = 0; i < scores.length; i++ ) {
				System.out.println( "scores[" +i+ "] :" + scores[i] );
				}
			} else if (selectNo == 4) {
				// 최고 점수, 평균 점수 출력
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수는 " + max );
				System.out.println("평균은 " + avg  );
			} else if (selectNo == 5) {
				// run값 변경
				run = false;
			}
		}
		System.out.print("프로그램 종료");
		

		
	}
}
