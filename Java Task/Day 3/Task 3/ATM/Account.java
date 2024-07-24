package ATM;
public class Account
{
private String accountHolderName;
private String accountId;
private int pin;
private float balance;

public Account(String name,String id,int pin)
{
accountHolderName = name;
accountId = id;
this.pin = pin;
balance = 0;
}

void setPin(int pin){
this.pin = pin;
}

int getPin(){
return pin;
}
public void deposit(float amount){
balance +=amount;
}

String getAccountId(){
return accountId;
}

Boolean withdraw(float amount){
if(balance-amount<0){
return false;
}
balance -=amount;
return true;
}

float getBalance(){
return balance;
}
}

