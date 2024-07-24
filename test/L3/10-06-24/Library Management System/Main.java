import java.util.Scanner;
class Main{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
while(true){

System.out.println("Enter 1 to admin login\nEnter 2 to user login\nEnter 3 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:	AdminConsole admin = new AdminConsole();
		admin.Window(scan);
		break;
		case 2:
		MemberConsole member = new MemberConsole();
		member.Window(scan);
		break;
		case 3:
			return;
	
}

}
}
}