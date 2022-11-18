package Ch10_Class_constructor;

/*
 * ���� ������
 * 
 * �뷡 �� ���� ��Ÿ���� Ŭ���� Song�� �ۼ��϶�
 * this()�� ����϶�.
 * Song Ŭ������ ������ ���� ���ǵȴ�.
 * 
 * # �ʵ�
 * title : �뷡�� ����
 * artist : ����
 * length : ���� ���� (����: ��)
 */

class Song {
	String title, artist;
	int length;
	Song(){
		
	}	
	Song(String title){
		this.title = title;
	}
	Song(String title, String artist){
		this(title);
		this.artist=artist;
	}
	Song(String title, String artist, int length){
		this(title, artist);
		this.length = length;
	}


//class Song {
//	String title, artist;
//	int length;
//	Song(String title, String artist, int length){
//		this.title = title;
//		this.artist = artist;
//		this.length = length;
//	}
//	Song(String title, String artist){
//		this.title = title;
//		this.artist = artist;
//	}
//	Song(String title){
//		this.title = title;
//	}
//	Song(){
//
//	}
	@Override
	public String toString() {
		return "Song {title='" + this.title +
				"', artist='" + this.artist +
				"', length='" + this.length +
				"'}";
	}
}


public class Ch10_08Song {

	public static void main(String[] args) {
		Song song1 = new Song("Outward Bound", "Nana", 180);
		Song song2 = new Song("Jambalya", "Carpenters");
		Song song3 = new Song("Yesterday");
		Song song4 = new Song();
		
		System.out.println(song1); 
		// ���: Song {title='Outward Bound', artist='Nana', length='180'}
		System.out.println(song2);
		// ��� : Song {title='Jambalya', artist='Carpenters', length='0'}
		System.out.println(song3);
		// ��� : Song {title='Yesterday', artist='null', length='0'}
		System.out.println(song4);
		// ��� : Song {title='null', artist='null', length='0'}
	}

}
