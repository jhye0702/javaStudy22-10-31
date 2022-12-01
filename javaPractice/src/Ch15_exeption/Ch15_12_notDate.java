package Ch15_exeption;

import java.util.*;
import java.io.*;

public class Ch15_12_notDate {

	public static void main(String[] args) {
		// PrintStream은 데이터를 적절한 문자로 출력하는 것
		// FileOutputStream은 기존 파일의 내용은 모두 지워지고 새롭게 덮어쓰게 됩니다. 
		// FileOutputStream은 true 인자를 추가로 전달하면 추가모드(append 모드)로 
		//  				  파일을 열어 가장 뒷부분부터 추가로 입력해주게 됩니다.
		
		PrintStream ps = null; 		// 파일 error.log에 출력할 준비
		FileOutputStream fos = null;	// 파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true); // error.log 파일에 출력할 준비를 한다.
			ps = new PrintStream(fos); 
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외발생!
			System.out.println(4); 	 // 실행되지 않는다.
		}
		catch (Exception ae) {
			System.err.println("-------------------------------------------");
			System.err.println();
			System.err.println("예외 발생시간 : " + new Date()); // 현재시간 출력
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage()); // 화면 대신 error.log 파일에 출력한다.
			System.err.println("-------------------------------------------");
		}// try - catch의 끝
		System.out.println(6);
	}

}


// 알아두기 !
// 참조변수 ae를 통해, 생성된 ArithmethicException 인스턴스에 접근할 수 있다. (=> ArithmethicException e)