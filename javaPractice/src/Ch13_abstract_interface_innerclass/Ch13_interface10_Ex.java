package Ch13_abstract_interface_innerclass;

interface DataAccessObject {
	void insert();
	void select();
	void update();
	void delete();
}
class OracleData implements DataAccessObject {

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB���� ����");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}
class MySqlData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("MySql DB���� ����");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}


public class Ch13_interface10_Ex {

	/* 
	 * DataAccessObject �������̽��� 
	 * �� �������̽��� �����ϴ� OracleData,MySqlData Ŭ������ �ֽ��ϴ�.
	 * 
	 * ���� Ŭ������ ���� ��°���� ������ ���� �� �������̽��� Ŭ������ ���� �ϼ��ϼ���.
	 */
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleData());
		dbWork(new MySqlData());
//		Oracle DB�� ����
//		Oracle DB���� �˻�
//		Oracle DB���� ����
//		Oracle DB���� ����
//		MySql DB�� ����
//		MySql DB���� �˻�
//		MySql DB���� ����
//		MySql DB���� ����

	}

}
