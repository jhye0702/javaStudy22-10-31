package Ch09_Class;

public class Ch09_02Tv3 {

	public static void main(String[] args) {

		// 참조 변수의 복사
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
		// Ch09_Class.Tv@379619aa // @뒤의 주소값은 컴퓨터 마다 다름
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
		// Ch09_Class.Tv@cac736f // @뒤의 주소값은 컴퓨터 마다 다름
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		System.out.println();
		
		t1.channel = 7; // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 7
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); // 0
		System.out.println();
		
		t1 = t2; // t2가 저장한 주소값을 t1에 저장. 참조 변수라서 동일한 주소를 가리킴.
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
		// Ch09_Class.Tv@cac736f
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
		// Ch09_Class.Tv@cac736f
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); // 0
		System.out.println();
		
		t1.channel = 27;
		System.out.println("t1의 channel값을 27로 변경하였습니다.");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 27
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); // 27
	}

}
