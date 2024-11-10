public class Admin implements User{
String name;
String password;

public boolean signIn(String name,String password){
return this.name.equals(name) && this.password.equals(password);
}

public void signUp(String name, String password){
this.name = name;
this.password = password;
}
public String getType(){
		return "Admin";
	}
	
	
	public User getUser(String crypto){
	if(crypto.equals("System"))
		return this;
	else
		return null;	}

}