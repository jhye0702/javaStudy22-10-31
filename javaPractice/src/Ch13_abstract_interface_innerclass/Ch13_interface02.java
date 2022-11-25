package Ch13_abstract_interface_innerclass;



class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("초밥 투어");
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
