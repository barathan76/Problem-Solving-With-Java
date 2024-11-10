import Console.AdminConsole;
import Console.UserConsole;
import java.util.Scanner;
class Main{

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter 1 to Admin login\nEnter 2 to user Login\nEnter 3 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:
	AdminConsole admin_console = new AdminConsole();
	admin_console.window();
	break;
case 2:
	UserConsole user_console = new UserConsole();
	user_console.window();
	break;
	
case 3:
	return;
}
}




}


