import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
List<String> users = new ArrayList<String>();
users.add("Arnab");
users.add("Monodwip");
users.add("Mukta");
users.add("Rinkel");
users.add("Shubham");
Account account = new Account(100,users);
Transaction t1 = new Transaction(account,2,20,"Arnab");
Transaction t2 = new Transaction(account,2,40,"Monodwip");
Transaction t3 = new Transaction(account,1,35,"Mukta");
Transaction t4 = new Transaction(account,2,80,"Rinkel");
Transaction t5 = new Transaction(account,2,40,"Shubham");
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
}
}