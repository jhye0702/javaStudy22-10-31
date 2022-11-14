package Ch08_Method;

public class Ch08_Method21_abs {
	
	/*
	 * (1)abs() 메소드 완성
	 */
	
	public static int abs (int value) { 
		return (value > 0) ? value : value * -1; }
	
	public static void main(String[] args) {
		
		int value = 5;		
		System.out.println(value + "의 절대값 : " + abs(value)); // 5
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value)); // 10
		
	
	}
}	

