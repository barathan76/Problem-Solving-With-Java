package ContactManagementSystem;
import java.util.Scanner;
class Main{
public static void main(String args[]){
ContactSystem contactSystem = new ContactSystem();
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("Enter 1 to add contact\n Enter 2 to make call\n Enter 3 to edit contact\n Enter 4 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
	case 1 : 
		contactSystem.addContact();
		break;
	case 2 :
		contactSystem.call();
		break;
	case 3:	
		contactSystem.editDetail();
		break;
	case 4:
		return;
}
}
}
}