package Test_12_02;


public class Member {				// ȸ�� ���� �� Ŭ����
	private final String memberID;	// ���̵�
	private String password;		// ��й�ȣ
	private String name;			// �̸�
	private String address;			// �ּ�
	private String email;			// �̸���
	
	Member(String memberID, String password, String name) { // �����ڸ� ���� �Է�
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}

	public String getMemberID() {
		return memberID;
	}

	public String getPassword() {
		return password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println("ȸ������������ �Ʒ��� �����ϴ�.");
		return "���̵� : " + memberID + ", �̸� : " + name + ", �ּ� : " + address + ", �̸��� :" + email;
	}

}


