package javaPractice.ch_01Type;

public class Ch01_Type07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ� ǥ��
		char single='\''; //single =''';�� ���� �� �� ����
		String dblQuote="\"Hello\""; //�����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
		String root="c:\\"; 
		
		System.out.println(single); //'
		System.out.println(dblQuote); //"Hello"
		System.out.println(root); //c:\
		
		//char�� �� �ϳ��� ���ڸ� ����, ���� ���ڸ� ���� �ҷ��� String ���
		//char�� '�θ� ����
		//String�� Ŭ����, �빮�ڷ� �����ϸ� Ŭ����, "�θ� �������
		
		char single2='"';
		String single3="'";
		String dblQuote2="'Hello'";
		//String dblQuote='Hello'; ����
		
		System.out.println(single2); //"
		System.out.println(single3); //'
		System.out.println(dblQuote2); //'Hello'
				
	}

}
