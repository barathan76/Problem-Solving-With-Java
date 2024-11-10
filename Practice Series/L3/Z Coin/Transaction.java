package Services;
import Accounts.UserAccount;
public class Transaction extends Thread{
UserAccount sender;
UserAccount receiver;
double amount;
public Transaction(UserAccount sender, UserAccount receiver, double amount){
this.sender = sender;
this.receiver = receiver;
this.amount = amount;
}
public void run(){
try {
        sender.withdraw(amount);
    } catch (Exception e) {
        System.out.println("Transaction failed");
        return;
    }
receiver.deposit(amount);
System.out.println("Transfering amount from "+sender.getName() + " to " + receiver.getName());
Logger.logTransaction(sender.getName(),sender.gethId(),receiver.getName(),receiver.gethId(),amount);
try{Thread.sleep(1000);}catch(InterruptedException e){}
System.out.println("Transaction successful");
}
}