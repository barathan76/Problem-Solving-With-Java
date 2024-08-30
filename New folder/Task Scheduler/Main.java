import java.util.Scanner;

import static java.lang.Long.sum;


public class Main {

    public static void main(String args[]){
        Console console = new Console();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome...................");
        while(true){
            System.out.println("Enter 1 to create account");
            System.out.println("Enter 2 to login");
            System.out.println("Enter 3 to exit");
            int n = scan.nextInt();
            switch(n){
                case 1:

                    System.out.println("Enter accountId");
                    String accountId = scan.nextLine();
                    System.out.println("Enter userName");
                    String userName = scan.nextLine();
                    System.out.println("Enter password");
                    String password = scan.nextLine();
                    Props.Role roleType;
                    System.out.println("Select Role enter 1 for Manager, enter 2 for Staff");
                    int role = scan.nextInt();
                    scan.nextLine();
                    if(role == 1)
                        roleType = Props.Role.Manager;
                    else
                        roleType = Props.Role.Staff;
                    System.out.println("Enter email");
                    String email = scan.nextLine();
                    console.createAccount(accountId,userName,roleType,password,email);
                    break;
                case 2:
                    System.out.println("Enter email");
                    String emailId = scan.nextLine();
                    System.out.println("Enter password");
                    String passwordL = scan.nextLine();
                    console.login(emailId,passwordL);
                    break;
                case 3:
                    return;
            }
        }

        }

}
