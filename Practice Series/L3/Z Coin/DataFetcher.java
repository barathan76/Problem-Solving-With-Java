package Services;
import Accounts.UserAccount;
import ZCoinExceptions.DataFetchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Services.TransactionHistory;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DataFetcher{
public List<UserAccount> fetchUserAccounts() throws DataFetchException{
List<UserAccount> accounts = new ArrayList<UserAccount>();

File file = new File("Database/Accounts/UserAccounts.txt");
if(!file.exists())
	try{file.createNewFile();}catch(IOException e){throw new DataFetchException("DataBase error"); };

Scanner scan;
try{scan = new Scanner(file);}catch(FileNotFoundException e){ throw new DataFetchException("DataBase error");};

while(scan.hasNextLine()){
String line[] = scan.nextLine().split(" - ");
UserAccount account = new UserAccount(line[0],line[1],line[2],line[3],line[4],Double.parseDouble(line[5]));
account.setZiD(line[6]);
accounts.add(account);
}
if(accounts.size() == 0)
	throw new DataFetchException("DataBase error");
return accounts;
}

public List<TransactionHistory> fetchUserTransactions(String name) throws DataFetchException{
List<TransactionHistory> transactions = new ArrayList<TransactionHistory>();
File dir = new File("Database/TransactionHistory");
File userFile = new File("Database/TransactionHistory/"+name+"Transactions.txt");
if(!userFile.exists())
	throw new DataFetchException("Transaction History not found");
Scanner scan;
try{scan = new Scanner(userFile);}catch(FileNotFoundException e){ throw new DataFetchException("DataBase error");}
while(scan.hasNextLine()){
String line[] = scan.nextLine().split(" - ");
TransactionHistory transaction = new TransactionHistory(line[0],line[1],line[2],line[3],line[4]);
transactions.add(transaction);
}
if(transactions.size() == 0)
	throw new DataFetchException("Transaction History not found");
return transactions;
}
}