package Ch08_Method;


public class Ch08_Method12_CallByString {

			/*
			 * ���ڿ��� ���� ȣ�� ���
			 * ���������� ���ڿ��� �����Ϸ��� ������ �����Ͷ� ���� ���� ȣ���� ��
			 */
			
			public void setAddress (String addr) {
				addr = "��⵵ ������ ��ȱ�";
			}
				
			public static void main(String[] args) {
				String address = "����� ������ ������" ;
				
				Ch08_Method12_CallByString st = new Ch08_Method12_CallByString();
				System.out.println("�޼��� ȣ�� ��");
				System.out.println("address : " + address); // adress : ����� ������ ������
				
				st.setAddress(address);
				
				System.out.println("�޼��� ȣ�� ��");
				System.out.println("address : " + address); // adress : ����� ������ ������
		}

	}
