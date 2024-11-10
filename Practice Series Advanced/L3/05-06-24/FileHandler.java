package Services;
import Account.Account;
import Account.UserAccount;
import Account.AdminAccount;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandler{

public List<Account> getUserAccounts(){
List<Account> accounts = new ArrayList<Account>();
File file = new File("Database\\Accounts\\UserAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNext()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Account account = new UserAccount(arr[0],arr[1],arr[2]);
accounts.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return accounts;
}

public void updateUserAccounts(List<Account> accounts){
File file = new File("Database\\Accounts\\UserAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));

for(Account account : accounts){
writer.write(account.getName("Writer")+ "::::"+account.getEmail("Writer")+"::::"+account.getPassword("Writer"));
writer.newLine();
}

writer.close();
}catch(IOException e){System.out.println("file error");}
}




public void updateAdminAccounts(List<Account> accounts){
File file = new File("Database\\Accounts\\AdminAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));

for(Account account : accounts){
writer.write(account.getName("Writer")+ "::::"+account.getEmail("Writer")+"::::"+account.getPassword("Writer"));
writer.newLine();
}

writer.close();
}catch(IOException e){System.out.println("file error");}
}


public List<Account> getAdminAccounts(){
List<Account> accounts = new ArrayList<Account>();
File file = new File("Database\\Accounts\\AdminAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNext()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Account account = new UserAccount(arr[0],arr[1],arr[2]);
accounts.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return accounts;
}


public List<Product> fetchProducts(){
List<Product> products = new ArrayList<Product>();
File file = new File("Database\\Products\\Products.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNext()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Product product = new Product(arr[0],arr[1],Double.parseDouble(arr[2]));
products.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return products;
}
}


public List<Coupan> fetchCoupans(){
List<Coupan> coupans = new ArrayList<Coupan>();
File file = new File("Database\\Products\\Coupans.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNext()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Coupan coupan = new Product(arr[0],arr[1],Double.parseDouble(arr[2]));
products.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return coupans;
}
}
