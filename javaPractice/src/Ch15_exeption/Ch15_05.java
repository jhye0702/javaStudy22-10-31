package Ch15_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch15_05 {
	public static void main(String[] args) {
		
		String path = ".\\sample_file\\test.txt";
		// �̽������� ���� \�� ����Ͽ� \\ �� ��Ÿ��
		FileInputStream fis = null; // FileInputStream ���� �д� ��!
									// ���� �д� �͵� ���� ���� ���� ��.
		
		try { 
			fis = new FileInputStream(path);
			System.out.println("������ ��ο� ������ �����մϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ ��ο� ������ �������� �ʽ��ϴ�.");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {;}
				System.out.println("������ �ݾҽ��ϴ�.");
			}
			System.out.println("�ڿ��� �����ϰ� �����մϴ�.");
		}
	}
}
