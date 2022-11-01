package javaPractice.ch_02Operator;

public class Ch02_OperatorEx02 {
	/*
	 * 다음은 십의 자리 이하는 버리는 코드.
	 * 변수 value의 값이 356이라면 300이 나올 수 있도록 코드 작성. 산술 연산자만 사용
	 * 이때 어떤 값을 넣어도 100단위로 값이 나올 수 있도록
	 */
	public static void main(String[] args) {
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println((value / 100) * 100);
	}

}
