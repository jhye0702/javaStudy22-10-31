package Ch24_java_util_package;

import java.util.Calendar;

/*
 	Calendar 클래스는 달력을 표현한 클래스입니다.
 	
 	Calendar 클래스를 사용하여 현재 시간이 나오도록 구현하세요
 	
 	 실행결과:
 	 2022년 12월 16일
 	 금요일 오전 
 	 11시 10분 58초 
 	 
 */
public class Ch24_05 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH) +1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null; // 요일
//		switch (week) {
//			case Calendar.MONDAY;
//				strWeek = "월";
//				break;
//			case Calendar.TUESDAY;
//				strWeek = "화";
//				break;
//			case Calendar.WENDESDAY;
//				strWeek = "수";
//				break;
//			case Calendar.THURSDAY;
//				strWeek = "목";
//				break;
//			case Calendar.FRIDAY;
//				strWeek = "금";
//				break;
//			case Calendar.SATURDAY;
//				strWeek = "토";
//				break;
//			case Calendar.SUNDAY;
//				strWeek = "일";
//				break;
//		}
		String strAmPm = null; // 오전 오후
		int hour = 0; // 시
		int minute = 0; // 분
		int second = 0; // 초
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.print( year + "년 " );
		System.out.print( month + "월 " );
		System.out.println( day + "일 " );
		System.out.print( strWeek + "요일 " );
		System.out.println( strAmPm + " " );
		System.out.print( hour + "시 " );
		System.out.print( minute + "분" );
		System.out.print( second + "초" );
	}

}
