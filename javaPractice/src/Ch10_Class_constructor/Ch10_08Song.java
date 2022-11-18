package Ch10_Class_constructor;

/*
 * 다중 생성자
 * 
 * 노래 한 곡을 나타내는 클래스 Song을 작성하라
 * this()를 사용하라.
 * Song 클래스는 다음과 같이 정의된다.
 * 
 * # 필드
 * title : 노래의 제목
 * artist : 가수
 * length : 곡의 길이 (단위: 조)
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
		// 결과: Song {title='Outward Bound', artist='Nana', length='180'}
		System.out.println(song2);
		// 결과 : Song {title='Jambalya', artist='Carpenters', length='0'}
		System.out.println(song3);
		// 결과 : Song {title='Yesterday', artist='null', length='0'}
		System.out.println(song4);
		// 결과 : Song {title='null', artist='null', length='0'}
	}

}
