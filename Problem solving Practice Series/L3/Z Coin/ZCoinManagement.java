public class AccountManager{
List<UserAccount> userAccounts;
DataFetcher fetcher;
public ZCoinManagement(){
fetcher = new DataFetcher();
userAccounts = fetcher.fetchUserAccounts();
}


boolean accountExists(String email, String password){
for(UserAccount account : userAccounts){
if(account.login(email,password))
	return true;
}
return false;
}


boolean signUp(String email, String password){
for(UserAccount account : userAccounts){
if(account.login(email,password))
	return false;
}
return true;
}


}