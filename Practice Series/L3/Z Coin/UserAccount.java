package Accounts;
import ZCoinExceptions.InsufficientBalanceException;
public class UserAccount implements Account{
public String hId;
public String name;
public String email;
public String password;
public String mobileNumber;
public double balance;
public String zId;
public UserAccount(String hId,String name,String email,String password,String mobileNumber,double deposit){
this.name = name;
this.email = email;
this.password = password;
this.mobileNumber = mobileNumber;
this.hId = hId;
this.balance = deposit;
}

public void setZiD(String zId){
this.zId = zId;
}

public String getName(){
return this.name;
}

public String gethId(){
return this.hId;
}

public boolean equalEmail(String email){
return this.email.equals(email);
}

public boolean login(String email,String password){
return (this.email.equals(email) && this.password.equals(password));
}
public void deposit(double d){
balance+=d;
}

public boolean equalHid(String hid){
return this.hId.equals(hid);
}
public void withdraw(double d) throws Exception{
if(balance -d>=0)
	balance-=d;
else
	throw new InsufficientBalanceException("Insufficient Balance");
}
}