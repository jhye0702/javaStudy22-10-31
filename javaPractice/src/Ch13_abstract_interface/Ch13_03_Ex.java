package Ch13_abstract_interface;

/*
 * HttpServlet �߻� Ŭ������ LoginServlet, FileDownloadServlet Ŭ������ �ֽ��ϴ�.
 * ���� Ŭ������ ��� ����� ���� LoginServlet, FileDownloadServlet Ŭ������ �ϼ��ϼ���.
 * 
 * ��� ��� )))
 * 
 * �α����մϴ�.
 * ���� �ٿ�ε� �մϴ�.
 * 
 */


abstract class HttpServlet {
	public abstract void service();
}

class LoginServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("�α����մϴ�.");		
	}
}
class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("���� �ٿ�ε� �մϴ�.");
	}
	
}

public class Ch13_03_Ex {

	public static void main(String[] args) {
		method(new LoginServlet()); 	// �α��� �մϴ�.
		method(new FileDownloadServlet()); // ���� �ٿ�ε� �մϴ�.
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
