package Ch15_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch15_06 {

	public static void main(String[] args) {
		String path = ".\\sample_file\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("���� ���� ����");
		} catch (FileNotFoundException e) { // Exception �ڿ� ���� catch���� ���������� �̷������ ������
			// �������� �̿��� ���� ó��			// ����� ���� ��� ���� ���� ����. Exception�� �� ���ԵǱ� ����
			System.out.println("*** FileNotFoundException ***");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		}  catch (Exception e) { // IOException �� FileNotFoundException ���� ��..!
			System.out.println("*** Exception ***");
			e.printStackTrace();
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
