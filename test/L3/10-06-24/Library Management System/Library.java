import java.util.List;
import java.util.ArrayList;
public class Library{
List<Book> books;
public Library(){
	books = new ArrayList<Book>();
}
public void addBook(Book b){
	books.add(b);
}

public List<Book> getBooks(){
	return books;
}
public boolean removeBook(String bookId){
	
	if(books.size() == 0)
			return true;
	for(int i =0 ;i<books.size();i++){
		if(books.get(i).getBookId().equals(bookId)){
			books.remove(i);
			return true;
		}
				
	}
	return false;
}


}