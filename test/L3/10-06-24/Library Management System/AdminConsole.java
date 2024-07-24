import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class AdminConsole{
User cachedUser;

Authenticator authenticator;
Library library;
AdminConsole(){
authenticator = new Authenticator();
library = new Library();
cachedUser = null;
}

public boolean signIn(Scanner scan){
	System.out.println("Enter user name : ");
	String name = scan.nextLine();
	System.out.println("Enter password : ");
	String password = scan.nextLine();
	List<User> adminUsers = authenticator.getAdminUsers();
	for(User user: adminUsers){
		if(user.signIn(name,password)){
			System.out.println("Login Successfull");
			cachedUser = user;
			return true;
		}
			
	}
	System.out.println("Access denied");
	return false;	
}

public boolean addBook(Scanner scan){
	System.out.println("Enter title : ");
	String title = scan.nextLine();
	System.out.println("Enter description: ");
	String description = scan.nextLine();
	System.out.println("Enter author details : ");
	String author_details = scan.nextLine();
	System.out.println("Enter publication date : ");
	String publication_date = scan.nextLine();
	System.out.println("Enter edition : ");
	String edition = scan.nextLine();
	System.out.println("Enter price : ");
	double price = scan.nextDouble();
	scan.nextLine();
	System.out.println("Enter count : ");
	int count = scan.nextInt();
	scan.nextLine();
	
	String bookId = IdGenerator.getBookId(title);
	
	Book book = new Book(bookId,title,description,author_details,publication_date,edition,price,count);
	library.addBook(book);
	return true;
}





public void viewListOfBooks(){
	List<Book> books = library.getBooks();
	for(Book book : books){
		System.out.println("Title : "+book.getTitle()+"\nPrice : "+book.getPrice());
	}
}


public void addUser(Scanner scan){
	System.out.println("Enter user name : ");
	String name = scan.nextLine();
	System.out.println("Enter password : ");
	String password = scan.nextLine();
	System.out.println("Enter age : ");
	int age = scan.nextInt();
	scan.nextLine();
	System.out.println("Enter gender : ");
	String gender = scan.nextLine();
	System.out.println("Enter date of joining : ");
	String doj = scan.nextLine();
	String userId = IdGenerator.getUserId(name);
	User member = new Member(name,userId,password,age,gender,doj,0);
	authenticator.addMember(member);
	
}

public boolean removeUser(Scanner scan){
	System.out.println("Enter user id");
	String userId = scan.nextLine();
	authenticator.removeMember(userId);
	return true;
}


public void viewListOfUser(){
	
	List<User> users = authenticator.getMembers();
	for(User user : users){
		Member member  = (Member) user;
		System.out.println("Name : "+member.getName() + "\tUser id : "+member.getUserId()+"\t Age : "+member.getAge()+"\t Gender"+member.getGender()+"\t Date of joingin "+member.getdoj());
	}
}

public void removeBook(Scanner scan){
	System.out.println("Enter bookid");
	String bookId = scan.nextLine();
	library.removeBook(bookId);
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

public void console(Scanner scan){
	while(true){
System.out.println("Enter 1 to add a new book\nEnter 2 to remove an existing book\nEnter 3 to view list of books\nEnter 4 to add a new user\nEnter 5 to remove an existing user\nEnter 6 to view list of users");
int n = scan.nextInt();
scan.nextLine();	
switch(n){
		case 1: addBook(scan);break;
		
		case 2: removeBook(scan);break;
		case 3: viewListOfBooks();break;
		case 4: addUser(scan);break;
		case 5: removeUser(scan);break;
		case 6: viewListOfUser();break;
		case 7: return;
	}
	
	}}


}