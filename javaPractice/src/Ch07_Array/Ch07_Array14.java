package Ch07_Array;

public class Ch07_Array14 {

	public static void main(String[] args) {

		/*
		 * 아래의 배열을 이용하여 랜덤으로 조 편성을 하세요
		 * 한 조의 인원은 3명 입니다.
		 */
		
		String[] students = {"김대환", "김정원", "김준혁", "김지혜", "김혜현",
				"박기훈", "박성민", "박소희", "박정혜", "박준휘",
				"배규", "손하늘", "신용화", "오범수", "오원택",
				"오해준", "유수현", "육승민", "이기행", "이성호",
				"이승재", "이영주", "장명규", "장윤영", "주민석",
				"최현지", "황희윤" };
		int numberPerTeam = 3;
		int count = 0;
		
		// 셔플
		for(int i = 0; i < 100000; i++) {
			int n = (int)(Math.random() * students.length); // 0~students.length - 1중의 한 값을 임의로 얻는다.
			String temp = students[0];
			students[0] = students[n];
			students[n] = temp;
		}
		for(int i = 0; i < students.length; i++) {
			if ( (i+1) % numberPerTeam == 1 ) {
				System.out.print( ++count + "조 : " );
			}	
			System.out.print(students[i] + " ");
			if ( (i+1) % numberPerTeam == 0 ) {
				System.out.println();
			}
		}
	}
}	
