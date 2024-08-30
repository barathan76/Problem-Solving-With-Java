class UserAccount implements Account{
private static final long serialVersionUID = 1L;
String name;
String email;
String password;
public boolean signIn(String email,String password){
return this.email.equals(email) && this.password.equals(password);
}
public void signUp(String name,String email,String password){
	this.name = name;
	this.email = email;
	this.password = password;
}
public String getName(){
	return this.name;
}
public String getEmail(){
	return this.email;
}
}