import java.util.Scanner;
import Accounts.AccountManager;
import Accounts.UserAccount;
import Services.Transaction;
public class UserWindow{
UserAccount account;
AccountManager manager;
public UserWindow(UserAccount account,AccountManager manager){
this.account = account;
this.manager = manager;
}
public void enter(){
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("Enter 1 to view account details\nEnter 2 to transfer amount\nEnter 3 to add Amount\nEnter 4 to view transaction history\n Enter 5 to exit");
int n = scan.nextInt();
switch(n){
case 1:
	viewAccount();
	break;
case 2:
	System.out.println("Enter amount to transfer : ");
	double amount = scan.nextDouble();
	scan.nextLine();
	System.out.println("Enter email to send : ");
	String email = scan.nextLine();
	if(manager.getReceiver(email)){	
	UserAccount receiver = manager.getCachedReceiver();
	Transaction transaction = new Transaction(account,receiver,amount);
	transaction.start();
	try{transaction.join();}catch(InterruptedException e){}
}else{
System.out.println("Receiver not found");
}
	break;
case 3:
	System.out.println("Enter amount  : ");
	double w_amount = scan.nextDouble();
	account.deposit(w_amount);
	break;
case 4:
	manager.getTransactionHistory(account);
	break;
case 5:
	manager.updateData();
	return;
}
}
}

void viewAccount(){
System.out.println("Name : "+account.name);
System.out.println("email : "+account.email);
System.out.println("hid : "+account.hId);
System.out.println("mobileNumber  : "+account.mobileNumber);
System.out.println("Z Balance : "+account.balance);
return;
}

}