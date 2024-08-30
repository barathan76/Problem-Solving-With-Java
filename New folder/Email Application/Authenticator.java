import java.util.List;
import java.util.ArrayList;
class Authenticator{
List<Account> accounts;
Authenticator(){
	accounts = FileHandler.getUserAccounts();
}
public boolean signIn(String email,String password){
	if(accounts.size() == 0)
		return false;
	for(Account account : accounts){
		if(account.signIn(email,password))
			return true;
	}
	return false;
}
public boolean signUp(String name,String email,String password){
	if(!signIn(email,password))
		return false;
	Account account = new UserAccount();
	account.signUp(name,email,password);
	accounts.add(account);
	FileHandler.setUserAccounts(accounts);
	return true;
}
}