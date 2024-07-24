import java.io.IOException;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileOutputStream;
class FileReadWrite{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a sentance");
String str = scan.nextLine();
try{
File file = new File("car.txt");
if(file.createNewFile()){
System.out.println("File is created");
}else{
System.out.println("file already exists");
}

byte[] data = str.getBytes();
for(int i =0; i<data.length;i++){
if(data[i] >=97 && data[i]<=122){
data[i]-=32;
}}
OutputStream os = new FileOutputStream("car.txt"); 
os.write(data);
System.out.println("The data is written in the file");
Reader reader = new FileReader("car.txt");

int d;
while((d = reader.read())!=-1){
System.out.print((char)d);
}
System.out.println();

reader.close();

Writer writer = new FileWriter("car.txt",true);
System.out.println("Enter a sentance to append in the file : ");
String dude = scan.nextLine();
writer.append("\n" + dude);
writer.close();
reader = new FileReader("car.txt");
while((d = reader.read())!=-1){
System.out.print((char)d);
}

reader.close();
os.close();
}catch(IOException e){
System.out.println(e);
}
}
}