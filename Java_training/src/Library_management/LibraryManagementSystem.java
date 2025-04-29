package Library_management;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Books");
            System.out.println("6. View Available Books");
            System.out.println("7. View Issued Books");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Take book details and call library.addBook()
                	System.out.println("Please enter the details of the book that you wish to add\nBookId: ");
                	String id = scanner.nextLine();
                	System.out.println("Book name: ");
                	String title = scanner.nextLine();
                	System.out.println("Author: ");
                	String author = scanner.nextLine();
                	Book book = new Book(id, title, author);
                	library.addBook(book);
                    break;
                case 2:
                    // Take member details and call library.registerMember()
                	System.out.print("Enter the details of the member you wish to add\nID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Name: ");
                    String memberName = scanner.nextLine();
                    Member member = new Member(memberId, memberName);
                    library.registerMember(member);
                    break;
                case 3:
                    // Issue a book
                	System.out.print("Enter Book ID to issue: ");
                    String issueBookId = scanner.nextLine();
                    System.out.print("Enter Member ID to issue to: ");
                    String issueMemberId = scanner.nextLine();
                    library.issueBook(issueBookId, issueMemberId);
                    break;
                case 4:
                    // Return a book
                	System.out.print("Enter Book ID to return: ");
                    String returnBookId = scanner.nextLine();
                    System.out.print("Enter Member ID who returns: ");
                    String returnMemberId = scanner.nextLine();
                    library.returnBook(returnBookId, returnMemberId);
                    break;
                case 5:
                    library.viewAllBooks();
                    break;
                case 6:
                    library.viewAllAvailableBooks();
                    break;
                case 7:
                    library.viewAllIssuedBooks();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();

	}
	
}
