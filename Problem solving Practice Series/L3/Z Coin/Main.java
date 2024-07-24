import console.UserConsole;
import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to Z coin");
while(true){
System.out.println("Enter 1 to get into user portal\nEnter 2 to exit");
int n = scan.nextInt();
switch(n){
case 1:
	UserConsole console = new UserConsole();
	while(true){
	System.out.println("Enter 1 to sign in \nEnter 2 to sign up \nEnter 3 to exit");
	int k =scan.nextInt();
	switch(k){
	case 1:
		if(console.SignIn()){System.out.println("Login Successful");
		UserWindow window = new UserWindow(console.getAccount(),console.getAccountManager());
		window.enter();}
		
	break;
	case 2:
		if(console.SignUp())System.out.println("Login Successful");
	break;
	case 3:
		return;
}
}
case 2:
	return;
	
}	
}
}
}