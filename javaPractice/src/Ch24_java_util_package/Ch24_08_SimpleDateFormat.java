package Ch24_java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Date와 SimpleDateFormat 클래스를 이용해서
 * 오늘의 날짜를 아래와 같이 출력하는 프로그램을 작성해보세요
 * 
 * 실행결과 :
 * 2022년 08월 22일 월요일 18시 09분
 */
public class Ch24_08_SimpleDateFormat {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(new Date()));
	}
}
