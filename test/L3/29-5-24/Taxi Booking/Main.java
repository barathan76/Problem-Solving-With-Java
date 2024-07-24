import java.util.Scanner;

class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of cabs " );
int n = scan.nextInt();
scan.nextLine();
Booker booker = new Booker(n);
while(true){
System.out.println("Book cab enter 1");
System.out.println("Get stats enter 2");
System.out.println("To exit enter 3");

int k = scan.nextInt();
scan.nextLine();
switch(k){
case 1:
	booker.getBooking();break;
case 2:	
	booker.getBookingStats();break;
case 3:
	return;
	
}

}
}
}