package Services;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;
import Accounts.UserAccount;
public class DataWriter{
public void addAccount(UserAccount account){
File file = new File("Database/Accounts/UserAccounts.txt");
try{
file.createNewFile();
FileWriter fileWriter = new FileWriter(file,true);
BufferedWriter writer = new BufferedWriter(fileWriter);
writer.write(account.hId + " - "+account.name+" - "+account.email+ " - "+account.password+" - "+account.mobileNumber+" - "+account.balance+ " - "+account.zId);
writer.newLine();
writer.close();
fileWriter.close();
}catch(IOException e){}
}


public void updateData(List<UserAccount> accounts){
try{
File file = new File("Database/Accounts/UserAccounts.txt");
FileWriter fileWriter = new FileWriter(file,false);
BufferedWriter writer = new BufferedWriter(fileWriter);
for(UserAccount account : accounts){
writer.write(account.hId + " - "+account.name+" - "+account.email+ " - "+account.password+" - "+account.mobileNumber+" - "+account.balance+ " - "+account.zId);
writer.newLine();
}
writer.close();
}catch(IOException e){}
}
}