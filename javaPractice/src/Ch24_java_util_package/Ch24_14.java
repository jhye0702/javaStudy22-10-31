package Ch24_java_util_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ch24_14 {
/*
 	with() 메서드는 TemporalAdjusters 타입을 인자로 받으면 특정 날짜를 리턴
 	firstDayOfYear() : 년도의 첫번째 일
 	lastDayOfYear() : 년도의 첫번째 일
 	firstDayOfMonth() : 달의 첫번째 일
 	lastDayOfMonth() : 달의 마지막 일
 	firstInMonth(DayofWeek dayOfWeek) : 달의 첫번째 요일
 	lastInMonth(DayofWeek dayOfWeek) : 달의 마지막 요일
 	next(DayOfWeek dayOfWeek) : 돌아오는 요일
 	nextOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 돌아오는 요일
 	previous(DayOfWeek dayOfWeek) : 지난 요일
 	previousOrSame(DAyOfWeek dayOfWeek) : 오늘을 포함한 지난 요일
 */
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2022-12-16T15:21:20.416512200
		LocalDateTime new_ldt;
		
		// 년도의 첫번째 일
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear()); 
		System.out.println("올해의 첫번째 날 : " + new_ldt); //2022-01-01T15:21:20.416512200
		// 년도의 마지막 일
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막 날 : " + new_ldt); //2022-12-31T15:21:20.416512200
		
		
		// 달의 첫번째 일
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫번째 날 : " + new_ldt); // 2022-12-01T15:21:20.416512200
		// 달의 마지막 일
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 첫번째 날 : " + new_ldt); // 2022-12-31T15:24:43.038069
		
		// 달의 첫번째 요일
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫 월요일 : " + new_ldt); // 2022-12-05T15:24:17.481834800
		// 달의 마지막 요일
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번달의 마지막 일요일 : " + new_ldt); // 2022-12-25T15:24:08.302853200
		
		
		// 돌아오는 요일
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일 : " + new_ldt); // 2022-12-23T15:23:59.119908100
		// 오늘을 포함한 돌아오는 요일
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일 : " + new_ldt); // 2022-12-16T15:23:45.829767100
		
		
		// 지난 요일
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + new_ldt); // 2022-12-12T15:23:32.994077600
		// 오늘을 포함한 지난 요일
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt); // 2022-12-12T15:20:00.764136400
	}
	
}
