package person;
import ATM.Account;
import ATM.ATM;
class Main{
public static void main(String args[])
{
Account account1 = new Account("TonyStark","121",111);
Account account2 = new Account("Bruce Banner","131",222);
Account account3 = new Account("Peter Parker", "141",333);


account1.deposit(1000);
account2.deposit(1200);
account3.deposit(1300);


ATM atm = new ATM();
atm.addAccount(account1);
atm.addAccount(account2);
atm.addAccount(account3);


System.out.println("User Login:");
if(atm.LogIn("121",111)){
System.out.println("Successfull login");
}
else{
System.out.println("Login Failure");
}

System.out.println("User Id : " +atm.getAccount());
System.out.println("Balance : " + atm.getBalance());
atm.deposit(1500);
System.out.println("Balance : " + atm.getBalance());
atm.withdraw(750);
System.out.println("Balance : " + atm.getBalance());
}
}



