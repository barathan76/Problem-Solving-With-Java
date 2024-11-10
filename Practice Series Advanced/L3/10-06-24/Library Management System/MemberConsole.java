import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MemberConsole{
Authenticator authenticator;
Library library;
User cachedUser;
public MemberConsole(){
	authenticator = new Authenticator();
	library = new Library();
}

public void Window(Scanner scan){
	
	System.out.println("Enter 1 to login\nEnter 2 to exit");
	int n = scan.nextInt();
	scan.nextLine();
	switch(n){
		case 1: if(signIn(scan)){
			console(scan);
		}
		case 2: return;
	}
	
}
public boolean signIn(Scanner scan){
	System.out.println("Enter user name : ");
	String name = scan.nextLine();
	System.out.println("Enter password : ");
	String password = scan.nextLine();
	List<User> members = authenticator.getMembers();
	for(User user: members){
		if(user.signIn(name,password)){
			System.out.println("Login Successfull");
			cachedUser = user;
			return true;
		}
			
	}
	System.out.println("Access denied");
	return false;	
}


public void console(Scanner scan){
	while(true){
	System.out.println("Enter 1 to search a book\nEnter 2 to get a book\nEnter 3 to return a book\nEnter 4 to exit");
	int n = scan.nextInt();
	scan.nextLine();
	switch(n){
	case 1: searchBook(scan);break;
case 2 : getBook(scan);break;
case 3: returnBook(scan);break;
case 4: return;	
	}
	}
	
}


public void searchBook(Scanner scan){
	System.out.println("Enter the book title");
	String title = scan.nextLine();
	List<Book> books = library.getBooks();
	for(Book book : books){
		if(book.getTitle().equals(title)){
			System.out.println("Book Title : "+book.getTitle()+"\nDescription : "+book.getDescription()+"\nAuthor details : "+book.get_author_details()+"\nPublication Date : "+book.get_publication_date()+"\nEdition : "+book.getEdition()+"\nPrice :"+book.getPrice());
			return;
		}
	}
	System.out.println("unable to find the book");
	
}

public void getBook(Scanner scan){
	System.out.println("Enter the book id");
	String bookId = scan.nextLine();
	List<Book> books = library.getBooks();
	Member temp = (Member) cachedUser;
	for(int i =0 ;i<books.size();i++){
		if(books.get(i).getBookId().equals(bookId)){
			if(books.get(i).reduce() && temp.getIssuedBooks()<5 ){
				System.out.println("You have got the book");
				return;
			}
			
		}
				
	}
	System.out.println("Book is unavailable right now");
}

public void returnBook(Scanner scan){
	System.out.println("Enter the book id");
	String bookId = scan.nextLine();
	List<Book> books = library.getBooks();
	for(int i =0 ;i<books.size();i++){
		if(books.get(i).getBookId().equals(bookId)){
			if(books.get(i).increase()){
				System.out.println("You have returned the book");
				return;
			}
			
		}
				
	}
	System.out.println("Book is unavailable right now");
}
}

