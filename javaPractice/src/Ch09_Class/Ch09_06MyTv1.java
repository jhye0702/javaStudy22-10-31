package Ch09_Class;

class MyTv {
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	//����� ���� ���� ���ϴ°� ���� ū Ư¡! ��������� ��ó�� �ؼ� �տ� final�� ����.
	
	void turnOff() {
		// (1) isPowerON�� ���� true�� false��, false�� true�� ����
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ��쿡�� 1 ����.
		volume = (volume < MAX_VOLUME)? volume+1 : volume;
	}
	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� ���� ��쿡�� 1 ����.
		volume = (volume > MIN_VOLUME)? volume-1 : volume;
	}
	void channelUp() {
		// (4) channel�� ���� 1 ����.
		// MAX_CHANNEL ���� �ö� �� ����.
		channel = (channel == MAX_CHANNEL)? MAX_CHANNEL : channel + 1;
	}
	void channelDown() {
		// (5) channel�� ���� 1 ����.
		// MIN_CHANNEL ���� ������ �� ����.
		channel = (channel == MIN_CHANNEL)? MIN_CHANNEL : channel - 1;
	}
}

public class Ch09_06MyTv1 {

	public static void main(String[] args) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// ��� -> CH:100, VOL:0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// ��� -> CH:99, VOL:0
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// ��� -> CH:100, VOL:100
		
		t.turnOff();
		System.out.println("Tv ���� : " + t.isPowerOn);
		t.turnOff();
		System.out.println("Tv �ٽõ��� : " + t.isPowerOn);
		t.channelUp();
		System.out.println("CH:" + t.channel);
		t.channel = 0;
		t.channelDown();
		System.out.println("CH:" + t.channel);
		
	}

}