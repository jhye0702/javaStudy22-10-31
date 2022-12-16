package Ch24_java_util_package;

import java.util.Calendar;

public class Ch24_03 {
	
	/* get() 메서드로 정보 가져오기 */
	public static String getDayToStr(int day) {
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		return days[day - 1];
	}
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		// Calendar 클래스에서 데이터를 얻어 오려면 get() 메서드를 사용.
		// get() 메서드의 반환 타입은 int 이며, 주의할 점은 월 (MONTH) 반환시 실제 월보다 1이 작은 값이 반환.
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 실제 월보다 1 작은 값이 반환
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 요일을 반환하는데, 반환 타입이 정수
		// 1 = 일요일, = 2 = 월요일 7, = 토요일
		System.out.println("오늘은 " +getDayToStr(calendar.get(Calendar.DAY_OF_WEEK))+ "요일입니다.");
		System.out.println("이번 년도에서 오늘이 몇일 째인가? : ");
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 이번 년도의 며칠인지
		
		System.out.println("이번 달은 며칠까지 있는가? : ");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		
	}
}
	
