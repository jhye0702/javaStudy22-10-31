package Ch20_JDBC;
// ���̺� ����

class DBCreate extends DB {
	private void createTable(String tableName, String sql) {
		// ���̺��� �����ϴ� �޼���
		// ������ ���̺� �̸��� �����ϴ� sql ���� �Ű� ������ ����.
		// 1) ���̺��� �����ϴ��� Ȯ�� ��
		// 2) ������ ����
		
		 try {
			 // ���̺��� �����ϴ��� Ȯ��
			 String talbeSql = "show tables";
			 boolean isTable = false;
			 
			 // �Ʒ� �� �׸��� �θ� Ŭ�������� ����
			 // SQL ���� ������ �� �ִ� PrepareStatement��ü�� ����
			 preparedStatement = conn.prepareStatement(talbeSql); // ���� ���� �غ�
			 resultSet = preparedStatement.executeQuery(); // ���� ���� �� ��� ����
			 while (resultSet.next()) {
				 if(tableName.equals(resultSet.getString(1))) { // ������ ���̺��� �ִ� ���
					 isTable = true;
				 }
//				 System.out.println(tableName);
//				 System.out.println(resultSet.getString(1));
			 }
			 if (isTable == true) { // ���̺��� �����ϴ� ���
				 System.out.println(tableName + "�̶�� �̸��� ���̺��� �̹� �����մϴ�.");
			 }
			 else { // ���̺��� ���� ��� �����Ѵ�.
				 preparedStatement = conn.prepareStatement(sql); // ���� �����غ�
				 resultSet = preparedStatement.executeQuery(); //  ���� ���� �� ��� ����
				 // System.out.println(resultSet); // org.mariadb.jdbc.client.result.CompleteResult@3c5a99da
				 
				 if (resultSet != null) {
					 System.out.println(tableName + " ���̺� ������ �����߽��ϴ�.");
				 }
				 else { 
					 System.out.println(tableName + " ���̺� ������ �����߽��ϴ�.");
				 }
			 }
		 } catch (Exception e) {
			 System.out.println("db connect err : " + e);
		 }
	}
	public void createTableUser() {
		String tableName = "tuser";
		String sql = "CREATE TABLE " + tableName + " (userID VARCHAR(100) PRIMARY KEY, "
				+ "name VARCHAR(100), age INT, job VARCHAR(100)) ";
		createTable (tableName, sql);
	}
}

public class Ch20_03_CreateTable {
	public static void main(String[] args) {
		DBCreate myDB = new DBCreate();
		myDB.connectDB();
		myDB.createTableUser();
		myDB.closeDB();
	}
}
