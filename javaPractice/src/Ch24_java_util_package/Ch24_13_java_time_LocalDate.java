package Ch24_java_util_package;

import java.time.LocalDate;

public class Ch24_13_java_time_LocalDate {

	public static void main(String[] args) {
// 		1900년 부터 2100년까지 윤년이 언제인지, 몇 년인지 알아보는 코드
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1;
		int count = 0; // 윤년의 횟수를 저장
		
		for (int i = 1900; i <= 2100; i++) {
			localDate1 = localDate.withYear(i); // 년을 i로 변경 
			if(localDate1.isLeapYear()){  		// isLeapYear() 메서드는 윤년이면 true 반환
				System.out.println(localDate1.getYear() + "은 윤년입니다.");
				count ++; // 윤년일 경우 1을 더함.
			}
		}
		System.out.println("1900년부터 2100년까지 윤년은 총 " + count + "번 있습니다.");
	}

}
