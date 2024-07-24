import java.util.*;
abstract class LibraryItem
{
String title;
String author;
String genre;
String id;
}


class Book extends LibraryItem
{
final String author;
final String ISBN;
class InnerBook
{
void display_info()
{
System.out.println("Title : "+title+"\nauthor "+author+"\ngenre "+genre+"\nISBN "+ISBN);
}
}
InnerBook innerBook = new InnerBook();

Book(String title,String author,String genre,String ISBN){
super.title = title;
this.author =author;
super.genre = genre;
this.ISBN = ISBN;
}
}
class DVD extends LibraryItem
{
DVD(String title,String author, String genre, String id)
{
super.title = title;
super.author =author;
super.genre = genre;
this.id = id;
}
class InnerDVD
{
void display_info()
{
System.out.println("Title : "+title+"\nauthor "+author+"\ngenre "+genre+"\nid "+id);
}
}
}
class LibraryCatalog
{
List<Book> books;
List<DVD> dvds;
LibraryCatalog()
{
books = new ArrayList<>();
dvds = new ArrayList<>();
}
void addBook(Book book){
books.add(book);
}
void addDVD(DVD dvd){
dvds.add(dvd);
}

Book pickBook()
{
Random random = new Random();
int i = random.nextInt(books.size());
Book book = books.get(i);
books.remove(i);
return book;
}

DVD pickDVD()
{
Random random = new Random();
int i = random.nextInt(dvds.size());
DVD dvd = dvds.get(i);
dvds.remove(i);
return dvd;
}
public static void main(String args[])
{
System.out.println("hello there");
LibraryCatalog libraryCatalog = new LibraryCatalog();
libraryCatalog.addBook(new Book("Infinity War","Thanos","Action","616"));
libraryCatalog.addBook(new Book("IronMan","TonyStark","ActionRomance","100"));
libraryCatalog.addBook(new Book("Unlimited Spider man","Stanlee","ActionAdventure","322"));
libraryCatalog.addBook(new Book("Ultimate Spider man","Stanlee","Action","433"));
libraryCatalog.addBook(new Book("Lord of the rings","J.R.R Tolkein","Action Drama","200"));
Book book = libraryCatalog.pickBook();
book.innerBook.display_info();
}
}





