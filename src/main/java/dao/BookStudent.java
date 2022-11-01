package dao;

public interface BookStudent {
	
	public String issueBook(int studentId, int bookId);
	
	public String returnBook(int studentId, int bookId);

}
