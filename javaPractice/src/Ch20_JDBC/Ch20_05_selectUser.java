package Ch20_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// ============ select

class DBSelect extends DB {
	Scanner scanner = new Scanner(System.in);
	// �߰��� �ڵ�
	protected ResultSet querySelect(String sql) {
		/* select ���� �� ��� ��ȯ*/
		try {
			preparedStatement = conn.prepareStatement(sql); // ���� ���� �غ�
			
			// SQL ���� INSERT, UPDATE, DELETE �� ��쿡�� executeUpdate() �޼ҵ带 ȣ��������,
			// �����͸� �������� SELECT ���� ��쿡�� executeQuery() �޼ҵ带 ȣ��
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("error : " + e);
		}
		// ResultSet�� SELECT ���� ����� �÷����� ������ �� row�� ����
		return resultSet;
	}
	private void printUser(String sql) throws SQLException {
		/* select ���� ����� �޾Ƽ� �ֿܼ� ���
		 * ��ü ��� ��°� �� ���� ����ϴ� ��� */
		
		int totalRow;
		int num = 1;
		ResultSet resultSet = querySelect(sql);
		
		//ResultSet�� ������ ���ؼ� 1�� ���� 1�� �ƴ� ��츦 �и�.
		//ResultSet�� ������ ���ϴ� �޼���� ��� �ٸ� ������� ������ ����.
		resultSet.last(); // ������ row�� �̵�
		totalRow = resultSet.getRow(); // row count�� ����
		resultSet.beforeFirst(); // ó�� row�� Ŀ���� �̵�. (�ʱ���·� ��������)
		if (totalRow == 1) {
			// �����Ͱ� �ϳ� -----------> if �� !!!!!!! 
			if (resultSet.next() ) {
				System.out.println("���̵� : " + resultSet.getString(1));
				System.out.println("�̸� : " + resultSet.getString(2));
				System.out.println("���� : " + resultSet.getString(3));
				System.out.println("���� : " + resultSet.getString(4));
				System.out.println();
			}
			else {
				System.out.println("�Է��Ͻ� ���̵��� �����ʹ� �������� �ʽ��ϴ�.");
			}
		}
		else {
			// ��ü ��� ��� ------------> while �� !!!!!!!!!!
			// �������� ó������ �о���Ƿ� next �� ������ ������ �о����, ���� �� �� Ŀ���� �̵�
			// ���� ���� �������鼭 �����͸� ��������, �����Ͱ� ������ ���� ����.
			while (resultSet.next()) {
				System.out.println(num + "��° ȸ��");
				System.out.println("���̵� : " + resultSet.getString(1));
				System.out.println("�̸� : " + resultSet.getString(2));
				System.out.println("���� : " + resultSet.getString(3));
				System.out.println("���� : " + resultSet.getString(4));
				System.out.println();
				num++;
			}
		}
	}
	public void getAllUser() throws SQLException {
		/* ��ü ��� */
		String sql;
		System.out.println("��ü ȸ�� ����Դϴ�.");
		sql = "SELECT * FROM tUser ";
		printUser(sql);
		System.out.println("=====================");
	}
	public void getOneUser() throws SQLException {
		/* ���� ��� */
		String sql;
		String userID;
		String validateTemp;
		boolean validate = false;
		
		do {
			System.out.println("���� �˻� �� ȸ���� ���̵� �Է��ϼ��� : ");			
			userID = scanner.next();
			
			System.out.println("�˻��� ȸ���� ���̵� " + userID + "�� �½��ϱ�? (y/n)");
			validateTemp = scanner.next();
			
			// �Է°���  y �� �ƴ� ��� true, ���� ��� false ��ȯ
			validate = !validateTemp.equals("y");
		} while (validate);
		sql = "SELECT * FROM tUser WHERE userID = '" + userID + "'";
		printUser(sql);
	}
}
public class Ch20_05_selectUser {

	public static void main(String[] args) throws SQLException {
		DBSelect myDB = new DBSelect();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.getOneUser();
		myDB.closeDB();
	}

}
