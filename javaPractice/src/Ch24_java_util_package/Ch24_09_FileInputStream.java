package Ch24_java_util_package;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ch24_09_FileInputStream {

	public static void main(String[] args) {
		// ���Ϸ� ���� �Է� �޴� ���α׷�
		// FileInputStream Ŭ������ ���� ������ ó���ϰ� �̸� Scanner Ŭ������ ���� ���
		try {
			FileInputStream fs = new FileInputStream("./sample_file/sample.txt");
			Scanner scanner = new Scanner(fs);
			while(scanner.hasNext()) { // ���� ���� �ϸ� ����ؼ� �ݺ�
				System.out.println(scanner.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
