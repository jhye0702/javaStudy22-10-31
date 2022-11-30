package Ch15_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch15_06 {

	public static void main(String[] args) {
		String path = ".\\sample_file\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("파일 열기 성공");
		} catch (FileNotFoundException e) { // Exception 뒤에 오면 catch문이 순차적으로 이루어지기 때문에
			// 다형성을 이용한 예외 처리			// 실행될 일이 없어서 빨간 줄이 생김. Exception에 다 포함되기 때문
			System.out.println("*** FileNotFoundException ***");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		}  catch (Exception e) { // IOException 과 FileNotFoundException 조상 격..!
			System.out.println("*** Exception ***");
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
