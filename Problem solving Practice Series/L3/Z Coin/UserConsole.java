package console;
import Accounts.AccountManager;
import Accounts.UserAccount;
import Services.Validator;
import java.util.Scanner;
public class UserConsole{
AccountManager accountManager;
UserAccount user_account;
public UserConsole(){
accountManager = new AccountManager();
/*accountManager.start();*/
}

public boolean SignIn(){
/*try{accountManager.join();}catch(InterruptedException e){}*/
Scanner scan = new Scanner(System.in);
while(true){
System.out.print("Enter email : ");
String email = scan.nextLine();
System.out.print("Enter password : ");
String password = scan.nextLine();

if(accountManager.accountExists(email,password)){
	user_account = accountManager.getCachedUserAccount();
	return true;
}
else
	System.out.println("User Account Not Found");

}
}

public AccountManager getAccountManager(){
return accountManager;
}

public UserAccount getAccount(){
return user_account;
}


public boolean SignUp(){
/*try{accountManager.join();}catch(InterruptedException e){}*/
Scanner scan = new Scanner(System.in);
while(true){
System.out.print("Enter email : ");
String email = scan.nextLine();
if(accountManager.signUp(email))
{
if(!Validator.validateEmail(email)){System.out.println("invalid email");continue;}
System.out.print("Enter password ");
String password = scan.nextLine();
if(!Validator.validatePassword(password)){System.out.println("Invalid password");continue;}
System.out.print("Enter name ");
String name = scan.nextLine();
System.out.print("Enter mobile Number : ");
String mobileNumber = scan.nextLine();
System.out.print("Enter H id  : ");
String hid = scan.nextLine();
String zid = accountManager.getZid(name,hid);
UserAccount account = new UserAccount(hid,name,email,password,mobileNumber,0);
account.setZiD(zid);
accountManager.addAccount(account);
user_account = account;
return true;
}
else{
System.out.println("An account with same email found ");
}
}
}
}