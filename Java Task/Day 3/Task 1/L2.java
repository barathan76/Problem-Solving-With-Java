abstract class Bank{
abstract int getBalance();
}

class BankA extends Bank{
private int balance;
BankA(){
balance = 0;
}
void deposit(int amount){
balance+=amount;
}
int getBalance(){
return balance;
}
}

class BankB extends Bank{
private int balance;
BankB(){
balance = 0;
}
void deposit(int amount){
balance+=amount;
}
int getBalance(){
return balance;
}
}

class BankC extends Bank{
private int balance;
BankC(){
balance = 0;
}
void deposit(int amount){
balance+=amount;
}
int getBalance(){
return balance;
}
}


class L2{
public static void main(String args[]){
BankA bankA = new BankA();
BankB bankB = new BankB();
BankC bankC = new BankC();
bankA.deposit(100);
bankB.deposit(150);
bankC.deposit(200);
System.out.println("Balance in Bank A : "+bankA.getBalance());
System.out.println("Balance in Bank B : "+bankB.getBalance());
System.out.println("Balance in Bank C : "+bankC.getBalance());
}
}