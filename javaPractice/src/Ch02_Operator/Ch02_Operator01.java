package Ch02_Operator;

public class Ch02_Operator01 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자
		 * 단독으로 사용할 때는 전위나 후위나 값이 동일.
		 */
		
		int i = 5;
		i++;					// i = i + 1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
		System.out.println(i);
		
		i = 5;					// 결과를 비교하기 위해 i값을 다시 5로 변경.
		++i;
		System.out.println(i);
	}

}
