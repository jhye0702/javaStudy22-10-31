package Ch13_abstract_interface_innerclass;



class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("����Ÿ�� �������� ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}
	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}
}

public class Ch13_interface02 {
	public static void main(String[] args) {
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();
		guide2.sightseeing();
		guide2.food();
		
	}
}
