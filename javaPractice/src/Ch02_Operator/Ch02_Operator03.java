package Ch02_Operator;

public class Ch02_Operator03 {

	public static void main(String[] args) {
		// 증감 연산자
		
		int i = 5;
		int j = 0;
		j = i++; 	
		// 여기서 동작이 두개인걸 알고 넘어가기. 
		// 1) j에 i값 대입		j = i;
		// 2) i가 증가 		i = i+1;
		System.out.println("j = i++; 실행 후, i=" + i + ", j = " + j);

		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		i = 5;
		j = 0;
		j = ++i;	
		// 1) i가 증가  		i = i+1;
		// 2) j에 i값 대입		j = i;
		System.out.println("j = ++i; 실행 후, i=" + i + ", j = " + j);
	}

}
