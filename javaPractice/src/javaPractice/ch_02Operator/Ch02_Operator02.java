package javaPractice.ch_02Operator;

public class Ch02_Operator02 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자
		 * 단독으로 사용하지 않는 경우에는 전위, 후위에 따라 결과 값이 다름
		 */
		
		int i = 5, j = 5;
		System.out.println(i++); // 5를 출력 후 1증가로 6으로 바뀌어있지만 출력은 안된 상태
		// 순서
		// print i;
		// i = i + 1;
		System.out.println(++j); // 1증가 된 후 6 출력
		// 순서
		// j = j + 1;
		// print j;
		System.out.println("i = " + i + ", j = " + j); //  6 6 실행 후에는 동일한 값
	}

}
