package javaPractice.ch_01Type;

public class Ch01_Type07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 표현
		char single='\''; //single =''';와 같이 할 수 없다
		String dblQuote="\"Hello\""; //겹따옴표를 출력하려면 이렇게 한다.
		String root="c:\\"; 
		
		System.out.println(single); //'
		System.out.println(dblQuote); //"Hello"
		System.out.println(root); //c:\
		
		//char은 단 하나의 문자만 저장, 여러 문자를 저장 할려면 String 사용
		//char은 '로만 묶임
		//String은 클래스, 대문자로 시작하면 클래스, "로만 묶어야함
		
		char single2='"';
		String single3="'";
		String dblQuote2="'Hello'";
		//String dblQuote='Hello'; 에러
		
		System.out.println(single2); //"
		System.out.println(single3); //'
		System.out.println(dblQuote2); //'Hello'
				
	}

}
