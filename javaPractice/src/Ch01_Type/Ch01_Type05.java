package Ch01_Type;

public class Ch01_Type05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f= 1.234567890123456789f;
		float f3=1.2f; //접미사f 없으면 에러
		
		//float f4=1.2f;
		double d = 1.2345678901234567890;
		float f2  = 0.100000001f; //0.1
		double d2 = 0.100000001; //double은 접미사 생략가능
		double d3 = 0.1000000000000001;
	
		System.out.println(f); //1.2345679 소수점 8자리에서 반올림
		System.out.println(d); // 1.2345678901234567
		System.out.println(f2); //0.1
		System.out.println(d2); //0.100000001
		System.out.println(d3); //0.1000000000000001
		
 //double은 16자리까지 float은 7개 



	}

}
