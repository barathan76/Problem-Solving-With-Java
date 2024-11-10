package Account;
import java.util.List;
import java.util.ArrayList;

import Services.AdminAccountFileHandler;
import Services.UserAccountFileHandler;

public class Authenticator{
List<Account> userAccounts;
List<Account> adminAccounts;


public boolean authenticateAdminAccount(String email,String password){
adminAccounts = AdminAccountFileHandler.getAdminAccounts();
if(adminAccounts.size() == 0)
	return false;
for(Account account : adminAccounts){
if(account.signIn(email,password))
	return true;
}
return false;
}


public boolean authenticateUserAccount(String email,String password){
userAccounts = UserAccountFileHandler.getUserAccounts();
if(userAccounts.size() == 0)
	return false;
for(Account account : userAccounts){
if(account.signIn(email,password))
	return true;
}
return false;
}

public Account getUserAccount(String email,String password){
userAccounts = UserAccountFileHandler.getUserAccounts();
for(Account account : userAccounts){
if(account.signIn(email,password))
	return account;
}
return null;
}


public Account getUserAccount(String name,String email,String password){
userAccounts = UserAccountFileHandler.getUserAccounts();
Account userAccount = new UserAccount(name,email,password);
userAccounts.add(userAccount);
UserAccountFileHandler.updateUserAccounts(userAccounts);
return userAccount;
}



public boolean checkEmail(String email){
userAccounts = UserAccountFileHandler.getUserAccounts();
if(userAccounts.size() == 0)
	return true;
for(Account account : userAccounts){
if(account.checkEmail(email)){
System.out.println("user already found");
return false;
}
	
}
return true;
}
}