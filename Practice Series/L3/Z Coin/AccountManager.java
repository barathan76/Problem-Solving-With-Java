package Accounts;
import java.util.List;
import java.util.ArrayList;
import Services.DataFetcher;
import Services.DataWriter;
import Services.ZidGenerator;
import Services.TransactionHistory;
public class AccountManager extends Thread{
List<UserAccount> userAccounts;
DataFetcher fetcher;
DataWriter writer;
UserAccount cachedUserAccount;
public UserAccount cachedReceiver;
public AccountManager(){
fetcher = new DataFetcher();
writer = new DataWriter();
try{userAccounts = fetcher.fetchUserAccounts();}catch(Exception e){System.out.println(e);}
}

/*public void run(){
try{userAccounts = fetcher.fetchUserAccounts();}catch(Exception e){System.out.println(e);}
}*/


public boolean accountExists(String email, String password){
if(userAccounts == null)
	return false;
for(UserAccount account : userAccounts){
if(account.login(email,password)){
	cachedUserAccount = account;
	return true;
}
}
return false;
}

public UserAccount getCachedUserAccount(){
return cachedUserAccount;
}

public String getZid(String name, String hid){
return ZidGenerator.generate(name,hid);
}

public boolean signUp(String email){
if(userAccounts == null)
	return true;
for(UserAccount account : userAccounts){
if(account.equalEmail(email))
	return false;
}
return true;
}

public boolean getReceiver(String email){
if(userAccounts == null)
	return false;
for(UserAccount account : userAccounts){
if(account.equalEmail(email)){
	cachedReceiver = account;
	return true;	
}	
}
return false;
}

public UserAccount getCachedReceiver(){
return cachedReceiver;
}


public void addAccount(UserAccount account){
if(userAccounts == null)
{
userAccounts = new ArrayList<UserAccount>();
}
userAccounts.add(account);
writer.addAccount(account);

}


public void updateData(){
writer.updateData(userAccounts);
}


public void getTransactionHistory(UserAccount u){
try{List<TransactionHistory> userTransactions = fetcher.fetchUserTransactions(u.getName());
for(TransactionHistory transaction : userTransactions){
transaction.getTransaction();
}
}catch(Exception e){}
}


}