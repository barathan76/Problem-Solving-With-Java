package Services;
import Account.Account;
import Account.UserAccount;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserAccountFileHandler{

public static List<Account> getUserAccounts(){
List<Account> accounts = new ArrayList<Account>();
File file = new File("Database\\Accounts\\UserAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNextLine()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Account account = new UserAccount(arr[0],arr[1],arr[2]);
accounts.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return accounts;
}

public static void updateUserAccounts(List<Account> accounts){
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

}