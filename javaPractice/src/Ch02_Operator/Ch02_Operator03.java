package Ch02_Operator;

public class Ch02_Operator03 {

	public static void main(String[] args) {
		// ���� ������
		
		int i = 5;
		int j = 0;
		j = i++; 	
		// ���⼭ ������ �ΰ��ΰ� �˰� �Ѿ��. 
		// 1) j�� i�� ����		j = i;
		// 2) i�� ���� 		i = i+1;
		System.out.println("j = i++; ���� ��, i=" + i + ", j = " + j);

		// ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		i = 5;
		j = 0;
		j = ++i;	
		// 1) i�� ����  		i = i+1;
		// 2) j�� i�� ����		j = i;
		System.out.println("j = ++i; ���� ��, i=" + i + ", j = " + j);
	}

}
