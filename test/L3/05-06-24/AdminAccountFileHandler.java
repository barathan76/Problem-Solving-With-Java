package Services;
import Account.Account;
import Account.AdminAccount;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AdminAccountFileHandler{
public static void updateAdminAccounts(List<Account> accounts){
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


public static List<Account> getAdminAccounts(){
List<Account> accounts = new ArrayList<Account>();
File file = new File("Database\\Accounts\\AdminAccounts.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNextLine()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Account account = new AdminAccount(arr[0],arr[1],arr[2]);
accounts.add(account);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return accounts;
}

}