public class Book{
	String bookId;
	String title;
	String description;
	String author_details;
	String publication_date;
	String edition;
	double price;
	int count;
	public Book(String bookId, String title, String description, String author_details, String publication_date, String edition, double price, int count){
	this.bookId = bookId;
	this.title = title;
	this.description = description;
	this.author_details = author_details;
	this.publication_date = publication_date;
	this.edition = edition;
	this.price = price;
	this.count = count;
	}
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
	public String getBookId(){
		return bookId;
		
	}
	public String getDescription(){
		return description;
		
	}
	public String get_author_details(){
		return author_details;
		
	}
	public String get_publication_date(){
		return publication_date;
		
	}
	public String getEdition(){
		return edition;
		
	}
	public boolean reduce(){
	if(count>0){
			count--;
			return true;
	}
	else 
			return false;
	}
	public boolean increase(){
	
			count++;
			return true;

	}
}