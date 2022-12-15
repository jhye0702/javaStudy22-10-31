package Ch22_Book_connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BookDAO {
	
	public BookDAO() {
		getConnection();
	}

	private Connection connection = null;

// ====== DB 연결 ========================================
	
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_book";
			String user = "root";
			String password = "8969";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

// ========= DB 해제 ========================================
	
	public void disConnect() {
		try {
			if(connection != null) {
				connection.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
// ======= 동일한 책이 있는지? ================================
	
	public boolean isBook (int bookNum) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM book WHERE bookNum = '"+bookNum+"'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
//			System.out.println(res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
// ========= 책 등록 ======================================
	
	public boolean insertBook(Book book) {
		Statement statement = null;
		
		if (isBook(book.getBookNum())) {
			System.out.println(book.getBookNum() + " 코드의 책이 존재합니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO book VALUES (%d, '%s', '%s', %d)"
					, book.getBookNum(), book.getTitle(), book.getWriter(), book.getStock());
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}

// ========== 전체 책 출력 ==========================================================
	
	public ArrayList<Book> selectAll() {
		Statement statement = null;
		ArrayList<Book> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM book ";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Book book = new Book (resultSet.getInt("bookNum"), 
									resultSet.getString("title"),
									resultSet.getString("writer"),
									resultSet.getInt("stock"));
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();             
			}
		}
		return list;
	}
	
// ====== 대여 반납이 되는 메서드 ====================================================
	
	public boolean updateStock(int bookNum, int rent, boolean flag) {
		Statement statement = null;
		boolean res = false;
		int upd = 0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE book SET stock = stock + %d WHERE (bookNum = %d)"
						, rent, bookNum);
			}
			else {
				sql = String.format("UPDATE book SET stock = stock - %d WHERE (bookNum = %d)"
						, rent, bookNum);
			}
				statement = connection.createStatement();
				upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
// ===== 책 코드를 입력받아 정보 전달 ==============================
	public Book selectOne(int bookNum) {
		Statement statement = null;
		Book book = null;
		try {
			String sql = "SELECT * FROM book WHERE bookNum = '"+bookNum+"'";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
					
			if (resultSet.next()) {
				book = new Book();
				book.setBookNum(resultSet.getInt("bookNum"));
				book.setTitle(resultSet.getString("title"));
				book.setWriter(resultSet.getString("writer"));
				book.setStock(resultSet.getInt("stock"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}

}
	

