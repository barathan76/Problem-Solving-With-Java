class Account{
String accountId;
String userName;
String password;
String email;
Props.Role role;
Account(String accountId,String userName){
	this.accountId = accountId;
	this.userName = userName;
}
public String getAccountId(){
	return this.accountId;
}
public boolean signIn(String email,String password){
	return this.email.equals(email) && this.password.equals(password);
}
public void signUp(String email,String password){
	this.email = email;
	this.password = password;
}
public void assignRole(Props.Role role){
	this.role = role;
}
public boolean matches(Props.Role role){
	return this.role == role;
}
}