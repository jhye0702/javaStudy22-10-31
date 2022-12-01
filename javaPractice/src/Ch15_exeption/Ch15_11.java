package Ch15_exeption;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ch15_11 {

	public static void main(String[] args) {
		// PrintStream은 데이터를 적절한 문자로 출력하는 것
		// FileOutputStream은 기존 파일의 내용은 모두 지워지고 새롭게 덮어쓰게 됩니다. 
		// FileOutputStream()은 
		// 괄호 안에 true 인자를 추가로 전달하면 추가모드(append 모드)로 !!!
		// 파일을 열어 가장 뒷부분부터 추가로 입력해주게 됩니다.
		
		PrintStream ps = null; 		// 파일 error.log에 출력할 준비
		FileOutputStream fos = null;	// 파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외발생!
			System.out.println(4); 	 // 실행되지 않는다.
		}
		catch (Exception ae) {
			// 참조변수 ae를 통해, 생성된 ArithmethicException 인스턴스에 접근할 수 있다. (ArithmethicException e)
			ae.printStackTrace(ps);
			ps.println("예외메시지 : " + ae.getMessage()); // 화면 대신 error.log 파일에 출력한다.
		}// try - catch의 끝
		System.out.println(6);
	}

}
