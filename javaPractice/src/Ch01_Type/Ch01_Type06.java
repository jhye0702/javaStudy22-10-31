package Ch01_Type;

public class Ch01_Type06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long형은 숫자가 적으면 접미사를 붙여도 되고 안붙여도 됨 int숫자 범위를 벗어나면 꼭 붙어야함
		long var1 = 10;
		long var2 = 20L;
		//long var3=10000000000000; //컴파일 에러
		long var4 = 100000000000L;
		
		System.out.println(var1); //10
		System.out.println(var2); //20
		System.out.println(var4); //100000000000
	}

}
