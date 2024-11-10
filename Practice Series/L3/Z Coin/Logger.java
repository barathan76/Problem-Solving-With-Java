package Services;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
class Logger{
static void logTransaction(String senderName, String senderId, String receiverName, String receiverId, double amount){

try{
File dir = new File("Database/TransactionHistory");
File logFile = new File("Database/TransactionHistory/"+senderName+"Transactions.txt");
logFile.createNewFile();
FileWriter fileWriter = new FileWriter(logFile,true); 
BufferedWriter writer = new BufferedWriter(fileWriter);
writer.write(senderName + " - " +senderId + " - " +amount + " - " + receiverName + " - "  + receiverId);
writer.newLine();
writer.close();
fileWriter.close();
}catch(IOException e){}
/*Logger.logTranscation(sender.getName()+ " " +sender.getZid+ " "+ amount + " " receiver.getZid + " " receiver.getName());*/
}
}