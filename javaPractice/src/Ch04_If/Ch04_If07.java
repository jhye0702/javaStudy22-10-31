package Ch04_If;

public class Ch04_If07 {

	public static void main(String[] args) {

		/* 중첩 for문으로 구구단 출력 */
		// for문은 또 다른 for문을 내포할 수 있는데, 이것을 중첩 for문이라고 함.
		// 이 경우 바깥쪽 for문이 한 번 실행할때마다 중첩된 for문은 지정된 횟수만큼
		// 반복해서 돌다가 다시 바깥쪽 for문이 돌아감.
		
		for(int dan = 2; dan <= 9; dan++) { // 바깥 쪽 for문. 8번 반복
			System.out.println("==== " + dan + "단 ====");
			for(int times = 1; times <= 9; times++) { // 중첩 for문. 9번 반복
				System.out.println(dan + " X " + times + " = "+ dan * times);
			}
			System.out.println();
		}
		
	}

}
