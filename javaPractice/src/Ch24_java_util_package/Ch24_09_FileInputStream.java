package Ch24_java_util_package;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ch24_09_FileInputStream {

	public static void main(String[] args) {
		// 파일로 부터 입력 받는 프로그램
		// FileInputStream 클래스를 통해 파일을 처리하고 이를 Scanner 클래스를 통해 출력
		try {
			FileInputStream fs = new FileInputStream("./sample_file/sample.txt");
			Scanner scanner = new Scanner(fs);
			while(scanner.hasNext()) { // 값이 존재 하면 계속해서 반복
				System.out.println(scanner.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
