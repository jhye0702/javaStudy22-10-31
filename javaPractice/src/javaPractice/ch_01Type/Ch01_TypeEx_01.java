package javaPractice.ch_01Type;

public class Ch01_TypeEx_01 {

	public static void main(String[] args) {
		/* int result = 에
		 * 1) 변수 4개를 모두 사용하고
		 * 2) 사칙연산 중 + 연산만 사용해서
		 * 9가 나오도록 코드를 완성.
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int a = (int)var1;
		double b = var2 + var3;
		int c = (int)b;
		double d = Double.parseDouble(var4);
		int e = (int)d;
		
		int result = a + c + e ; // 이 부분만 수정. 0대신 코드 입력.
		System.out.println(result); // 9
	}
}
