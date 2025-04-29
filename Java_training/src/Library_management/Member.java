package Library_management;

import java.util.List;
import java.util.ArrayList;

public class Member {
	private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getName() {
        return this.name;
    }

    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }
    
    @Override
    public String toString() {
    	return "Member ID: " + this.memberId + "\nName: " + this.name;
    }
}

