package Ch08_Method;


public class Ch08_Method19 {
	
	public static void main(String[] args) {
	/*
	 * 밑변 30, 높이 10 인 사각형의 넓이를 출력하세요
	 * 단, 메서드 calculator()를 호출해서 출력하세요.
	 * 결과값 : 
	 *		 < 계산을 시작합니다.
	 * 		 밑변이 30, 높이가 10인 사각형의 넓이는 300 입니다.
	 */
		int width = 30;
		int height = 10;
		int area = calculator(width, height);
		System.out.println("밑변이 " +width+ ", 높이가 " +height+ "인 사각형의 넓이는 " + area + "입니다.");
	}
	
	public static int calculator(int a, int b) {
		System.out.println("< 계산을 시작합니다.");
		int area = a * b; // 밑변 * 높이 = 사각형의 넓이
		return area;
	}
	
	
}
