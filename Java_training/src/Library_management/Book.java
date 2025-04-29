package Library_management;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private boolean isIssued;
	
	public Book(String bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}
	
	public String getBookId() { return this.bookId; }
	public String getTitle() { return this.title; }
	public String getAuthor() { return this.author; }
	public boolean getIsIssued() { return this.isIssued; }
	
	public void setIsIssued(boolean isIssued) { this.isIssued = isIssued; }
	
	@Override
	public String toString() {
		return "Book ID: " + this.bookId + "\nTitle: " + this.title + "\nAuthor: " + this.author + "\nIssued: " + this.isIssued;
	}

}
