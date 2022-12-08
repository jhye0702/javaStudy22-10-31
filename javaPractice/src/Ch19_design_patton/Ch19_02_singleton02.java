package Ch19_design_patton;


public class Ch19_02_singleton02 {
	public static void main(String[] args) {
//		4. �ܺο��� ����ϴ� �ڵ� �����
//		�ܺ� Ŭ�������� Company�� ������ �� �����Ƿ� static���� �����Ǵ� getInstance() �޼��� ȣ�� 
		Company company1 = Company.getInstance();	// Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company company2 = Company.getInstance();
		// Company company = new Company(); 		// �����ڸ� �̿��ؼ� �����ϴ� ��� �Ⱦ��� ����ó�� getInstance()�� ������
		
		System.out.println(company1 == company2);	// �� ������ ���� �ּ����� Ȯ��
		System.out.println(company1); 				// Ch19_design_patton.Company@379619aa
		System.out.println(company2);				// Ch19_design_patton.Company@379619aa
		
	}
}
