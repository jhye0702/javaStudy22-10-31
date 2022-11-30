package Ch15_exeption;

public class Ch15_03 {
	public static void main(String[] args) {
			try {
				int[] a = {2, 0};
				int b = 4 ;
				System.out.println("예외 처리 공부 중 1");
				int c = b / a[2];
				// a[0] 을 넣으면 catch문 다 뛰어넘고 공부 중 3으로 감.
				System.out.println("예외 처리 공부 중 2");
				System.out.println();
			} 
			catch(ArithmeticException e) {
				System.out.println("산술 오류 발생"); 
				// 이 오류가 뜨게 하고 싶으면 9번 줄에 a[1]로 바꾸면 산술 오류
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 길이 오류 발생");
			}
			System.out.println("예외 처리 공부 중333");
	}
}
