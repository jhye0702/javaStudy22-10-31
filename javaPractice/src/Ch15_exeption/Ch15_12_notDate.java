package Ch15_exeption;

import java.util.*;
import java.io.*;

public class Ch15_12_notDate {

	public static void main(String[] args) {
		// PrintStream�� �����͸� ������ ���ڷ� ����ϴ� ��
		// FileOutputStream�� ���� ������ ������ ��� �������� ���Ӱ� ����� �˴ϴ�. 
		// FileOutputStream�� true ���ڸ� �߰��� �����ϸ� �߰����(append ���)�� 
		//  				  ������ ���� ���� �޺κк��� �߰��� �Է����ְ� �˴ϴ�.
		
		PrintStream ps = null; 		// ���� error.log�� ����� �غ�
		FileOutputStream fos = null;	// ���� ������ ����
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true); // error.log ���Ͽ� ����� �غ� �Ѵ�.
			ps = new PrintStream(fos); 
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // ���ܹ߻�!
			System.out.println(4); 	 // ������� �ʴ´�.
		}
		catch (Exception ae) {
			System.err.println("-------------------------------------------");
			System.err.println();
			System.err.println("���� �߻��ð� : " + new Date()); // ����ð� ���
			ae.printStackTrace(System.err);
			System.err.println("���ܸ޽��� : " + ae.getMessage()); // ȭ�� ��� error.log ���Ͽ� ����Ѵ�.
			System.err.println("-------------------------------------------");
		}// try - catch�� ��
		System.out.println(6);
	}

}


// �˾Ƶα� !
// �������� ae�� ����, ������ ArithmethicException �ν��Ͻ��� ������ �� �ִ�. (=> ArithmethicException e)