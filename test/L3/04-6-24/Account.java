import java.util.List;
public class Account{
private List<String> users;
private int balance = 0;
public Account(int balance,List<String> users){
this.balance = balance;
this.users = users;
}

public synchronized boolean withdraw(int amount){
if(balance - amount<0)
	return false;
balance -= amount;
return true;
}
public synchronized void deposit(int amount){
balance +=amount;
}

public synchronized int getBalance(){
return balance;
}
public boolean grantAccess(String user){
return users.contains(user);
}
}