package Ch02_Operator;

public class Ch02_OperatorEx01 {
	/*
	 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇개를 가질 수 있고,
	 * 최종적으로 몇 개가 남는지 구하는 코드.
	 * 1 대신에 알맞은 코드를 작성하시오.
	 */
	public static void main(String[] args) {
	
			int pencils = 534;
			int students = 30;
			
			// 학생 한 명이 가지는 연필 수
			int pencilsPerStudent = pencils / students;
			System.out.println(pencilsPerStudent);
			
			// 남은 연필 수
			int pencilsLeft = pencils % students;
			System.out.println(pencilsLeft);

	}
}
