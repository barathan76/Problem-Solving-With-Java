package Account;
public class UserAccount implements Account{
String name;
String email;
String password;
public UserAccount(String name,String email,String password){
this.name = name;
this.email = email;
this.password = password;
}
public boolean signIn(String email,String password){
return this.email.equals(email) && this.password.equals(password);
}
public boolean checkEmail(String email){
if(this.email.equals(email)){
	return true;
}
return false;
}
public String getName(String crypto){
if(crypto.equals("Writer"))
	return name;
else
	return "";
}

public String getName(){
return name;
}
public String getEmail(String crypto){
if(crypto.equals("Writer"))
	return email;
else
	return "";

}
public String getPassword(String crypto){
if(crypto.equals("Writer"))
	return password;
else
	return "";
}
}
