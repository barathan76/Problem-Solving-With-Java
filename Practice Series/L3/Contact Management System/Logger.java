package ContactManagementSystem;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
class Logger{
void log(Contact c,long a,long b){
String fileName = "logs/callLog.txt";
try{
System.out.println("Logger called");
FileWriter fileWriter = new FileWriter(fileName, true); 
BufferedWriter writer = new BufferedWriter(fileWriter);
writer.write(c.getName() + " "+c.getPhoneNumber()+" " +a+ "-" +b);

writer.newLine();
writer.close();
System.out.println("logger exited");
}catch(IOException e){
System.out.println("issues in logger");
}
}
}