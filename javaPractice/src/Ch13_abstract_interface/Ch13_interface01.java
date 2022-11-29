package Ch13_abstract_interface;

/*
 * A ���α׷��ӿ� B ���α׷��Ӱ� �ϳ��� ������Ʈ�� �������� ��,
 * A ���α׷��ӿ� B ���α׷��Ӱ� ������ Ŭ������ �ϼ����� �ʾҾ,
 * �����ؾ��� ��ɵ��� �̸� �����ϰ� ��ȯ Ÿ���� ���س����� ������ �۾��� �����ʹ�
 * �����ϰ� ���� ����
 * �ٷ� �̷� ��Ӱ� ���� ���� �������̽�.
 * 
 * �Ʒ� ������ Ŭ������ 3���� ���� �۾��� �ϰ�,
 * ���ÿ� ���߿� ���� ������ ����
 * �������̽��� �����ϱ� ����
 * �������̽��� �̸� ���� �����ϰ� ��. 
 * �� �۾� ������ 1) �������̽� 2) ���ÿ� 3���� Ŭ������ �۾�.
 */

interface Providable {		// �������̽�
	void leisureSports();	// �տ� public abstract ����
	void sightseeing();		// public�� �߿��� ���� - ���������� �ؾ��ؼ�
	void food();
}
class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ���� ��Ű ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}
}
class TourGuide {				// �������̽��� �������� ����� ��
	private Providable tour;	// �������̽��� Ÿ�� ����
	TourGuide (Providable providable) {
		tour = providable;
	}
	// �������̵� �ƴ�
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}

public class Ch13_interface01 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}
}
