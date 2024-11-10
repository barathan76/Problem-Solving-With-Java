package Account;
public class AdminAccount implements Account{
String name;
String email;
String password;
public AdminAccount(String name,String email,String password){
this.name = name;
this.email = email;
this.password = password;
}
public boolean signIn(String email,String password){
return this.email.equals(email);

}
public boolean checkEmail(String email){
if(this.email.equals(email)){
	System.out.println("Admin account with same email exists");
	return false;
}
return true;
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
