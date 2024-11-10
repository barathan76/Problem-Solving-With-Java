public class Member implements User{
	String name;
	String userId;
	String password;
	int age;
	String gender;
	String doj;
	int issued_books;
	public Member(String name,String userId,String password,int age,String gender,String doj,int issued_books){
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.doj = doj;
		this.issued_books = issued_books;
	}
	public boolean signIn(String name,String password){
		return this.name.equals(name) && this.password.equals(password);
	}
	public void signUp(String name,String password){
		this.name = name;
		this.password = password;
	}
	public User getUser(String crypto){
		if(crypto.equals("System"))
			return this;
		else
			return null;
	}
	
	public String getType(){
		return "Member";
	}
	public String getName(){
		return name;
	}
	public String getUserId(){
		return userId;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public String getdoj(){
		return doj;
	}
	public int getIssuedBooks(){
		return issued_books;
	}
	
	
}