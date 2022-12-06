package Ch18_collection;

import java.util.ArrayList;
import java.util.List;

// BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴
// main() 메소드 실행시에 아래와 같이 출력될 수 있도록 BoardDao의 getBoardList() 메소드를 작성할 것

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}
// ========================== 첫번째 방법
//class BoardDao {
//	public List<Board> getBoardList(){
//		List<Board> boardList = new ArrayList<Board>();
//		boardList.add(new Board("제목1", "내용1"));
//		boardList.add(new Board("제목2", "내용2"));
//		boardList.add(new Board("제목3", "내용3"));
//		return boardList;
//	}
//}

// ============================ 두번째 방법
class BoardDao {
	List<Board> boardList = new ArrayList<Board>();
	
	public BoardDao() {
		boardList.add(new Board("제목1", "내용1"));
		boardList.add(new Board("제목2", "내용2"));
		boardList.add(new Board("제목3", "내용3"));
	}

	public List<Board> getBoardList() {
		return boardList;
	}
}

//===========================================


public class Ch18_05_Ex {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
