package Library_management;

import java.util.List;
import java.util.ArrayList;

public class Library {
	private List<Book> books;
    private List<Member> members;

    public Library () {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void registerMember(Member member) {
        this.members.add(member);
    }

    public void issueBook(String bookId, String memberId) {
    	Book bookToIssue = findBookById(bookId);
    	Member member = findMemberById(memberId);
    	
    	if (bookToIssue == null) {
    		System.out.println("Book not found!");
    		return;
    	}
    	
    	if (member == null) {
    		System.out.println("Member not found! Please register.");
    		return;
    	}
    	
    	if (bookToIssue.getIsIssued()) {
    		System.out.println("Sorry, book is already issued.");
    		return;
    	}
    	
    	bookToIssue.setIsIssued(true);
    	member.borrowBook(bookToIssue);
    	System.out.println("Book " + bookToIssue.getTitle() + " issued successfully by " + member.getName());
    	
    }
    
    public void returnBook(String bookId, String memberId) {
    	Book bookToReturn = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (bookToReturn == null) {
            System.out.println("Book not found!");
            return;
        }

        if (member == null) {
            System.out.println("Member not found!");
            return;
        }

        if (!bookToReturn.getIsIssued()) {
            System.out.println("This book was not issued.");
            return;
        }

        bookToReturn.setIsIssued(false);
        member.returnBook(bookToReturn);
        System.out.println("Book returned successfully by " + member.getName());
    
    }

    public void viewAllBooks() {
        System.out.println("All the books in the Library");
        for(Book book : this.books) {
        	System.out.println(book);
        }
    }
    
    public void viewAllAvailableBooks() {
        System.out.println("All the books in the Library");
        for(Book book : this.books) {
        	if (!book.getIsIssued()) {
        		System.out.println(book);
        	}
        }
    }
    
    public void viewAllIssuedBooks() {
        System.out.println("All the books in the Library");
        for(Book book : this.books) {
        	if (book.getIsIssued()) {
        		System.out.println(book);
        	}
        }
    }
    
    private Book findBookById(String bookId) {
    	for (Book book : books) {
    		if (book.getBookId().equals(bookId)) {
    			return book;
    		}
    	}
    	return null;
    }
    
    private Member findMemberById(String memberId) {
    	for (Member member : members) {
    		if (member.getMemberId().equals(memberId)) {
    			return member;
    		}
    	}
    	return null;
    }
}
