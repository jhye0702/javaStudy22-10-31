package Ch01_Type;

public class Ch01_Type09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 + 연산에서의 문자열 자동 변환
		 + 연산자는 두가지 기능
		 	1) 피연산자가 숫자일 경우에는 덧셈 연산
		 	2) 피연산자 중 하나라도 문자열이면 
		 	   나머지 피연산자도 문자열로 자동 변환되어서 문자열 결합 연산을 수행
		 !문자열과 정수 연산을 하게 되면 정수가 문자열로 형 변환됨!
		*/
		
		// 공백이 있을 경우
		String a = 7 + " ";
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		String e = "" + "";
		String f = 7 + 7 + "";
		String g = "" + 7 + 7;
		
		System.out.println(a); // (7 ) 
		System.out.println(b); // ( 7)
		System.out.println(c); // (7)
		System.out.println(d); // (7)
		System.out.println(e); // ()
		System.out.println(f); // (14)
		System.out.println(g); // (77)
	}

}
