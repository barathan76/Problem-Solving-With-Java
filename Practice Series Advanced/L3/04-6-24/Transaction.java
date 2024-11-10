class Transaction extends Thread{
private Account account;
private int choice;
private int amount;
private String user;
Transaction(Account account,int choice,int amount,String user){
this.account = account;
this.choice = choice;
this.amount = amount;
this.user = user;

}

public void run(){
if(!account.grantAccess(user)){
System.out.println("Access denied");
return;
}
switch(choice){
case 1: account.deposit(amount); 
	System.out.println(user + " deposited " +amount +"\nBalance after deposit: "+account.getBalance());
	break;
case 2: if(account.withdraw(amount))
		System.out.println(user + " has withdrawn "+amount+"\nBalance after withdrawal: "+account.getBalance());
	else
		System.out.println(user + " you cannot withdraw "+amount+"\nYour Balance is: "+account.getBalance());
	break;
default: return;
}
}

}