package authenticator;
import user_repo.Customer;
import java.util.Scanner;
import user_repo.Customer;
import system.UserProfileData;
public class CustomerAuthenticator{

public Customer signUp(){
UserProfileData data = new UserProfileData();
Customer customer;
Scanner scan = new Scanner(System.in);
Validator validate = new Validator();
while(true){
System.out.println("Enter name : ");
String name = scan.nextLine();
String email, password;
while(true){
System.out.println("Enter email : ");
email = scan.nextLine();
if(validate.emailValidator(email)){
	System.out.println("Invalid email address");
	continue;}
break;
}
System.out.println("Enter password  (Atleast one digit,uppercase,lowercase,special character and white space not allowed and size range from 8 to 20: ");
while(true){
password = scan.nextLine();
if(validate.passwordValidator(password)){
	System.out.println("Invalid email address, Enter password again");
	continue;}
break;
}
System.out.println("Confirm password");
while(true){
String confirm = scan.nextLine();
if(password.equals(confirm))
	break;
System.out.println("Password does not match");
}
if(data.checkUser(email)){
customer = new Customer(name,email,password);
break;
}else{
System.out.println("User already found");
}
}
return customer;
}
}