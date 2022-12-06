package Ch16_package.object;

public class Ch16_14_longCurrentTimeMillis {

	public static void main(String[] args) {
		// 문자열을 만번 출력하는데 걸리는 시간을 측정
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + "번째 줄");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " 초 걸림");
	}

}
