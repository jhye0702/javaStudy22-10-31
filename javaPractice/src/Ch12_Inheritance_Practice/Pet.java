package Ch12_Inheritance_Practice;

public class Pet {
	private String name;		// �ֿ� ������ �̸�
	private String masterName;	// ������ �̸�
	
	public Pet(String name, String masterName) {		// ������
		// super();				// ������, ���ֵ� �����
		this.name = name;							// �ֿϵ����� �̸�
		this.masterName = masterName;					// ������ �̸�
	}
	
	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public void introduce( ) {
		System.out.print("�� �� �̸��� " + name + "�Դϴ�!");
		System.out.println(" �� ���δ��� " + masterName + "�Դϴ�!");
	}
	
}
