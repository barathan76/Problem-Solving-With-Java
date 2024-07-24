package ATM;
import java.util.ArrayList;

public class ATM{
private ArrayList<Account> accounts;
private Account userAccount;

public ATM(){
accounts = new ArrayList<>();
}

public void addAccount(Account account){
accounts.add(account);
}

public Boolean LogIn(String accountId,int pin)
{
for(Account account : accounts){
if(account.getAccountId().equals(accountId) && account.getPin() == pin) {
userAccount = account;
return true;
}
}
return false;
}

public String getAccount(){
return userAccount.getAccountId();
}

public void withdraw(float amount){
if(userAccount.withdraw(amount)){
System.out.println("Amount withdrawn. Take your money");
}else{
System.out.println("Insufficient funds");
}
}

public void updatePin(int prev, int pin){
if(userAccount.getPin() == prev){
userAccount.setPin(pin);
}
}

public void deposit(float amount){
userAccount.deposit(amount);
}


public float getBalance(){
return userAccount.getBalance();
}


}



