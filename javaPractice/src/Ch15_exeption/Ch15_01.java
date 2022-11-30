package Ch15_exeption;

public class Ch15_01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int a = 0;
		int b = 2;
		int c = b / a ; // 0으로 나눌 수 없어서 예외 발생 (산술적 오류)
		System.out.println("프로그램 종료");
	}
}
