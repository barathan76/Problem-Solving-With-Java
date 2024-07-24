import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
class FileOperations{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
File file = new File("thanos.txt");
try{
if(!file.exists()){
file.createNewFile();
System.out.println("File Created Successfully");}
else{
System.out.println("The file already exists");
}
System.out.println("Enter the sentance to write in the document : ");
String str = scan.nextLine();

FileWriter writer = new FileWriter(file);
writer.write(str);
writer.close();
System.out.println("The sentance is written in the document successfully");
file = new File("Test");
String[] files = file.list();
System.out.println("The list of files available in the directory : ");
int i =1;
for(String f:files){
System.out.println(i+"."+f);
i++;
}
System.out.println("Select the file to Read. Enter the number of the file (1,2,3 .. etc) : ");
int n = scan.nextInt();
scan.nextLine();
file = new File("Test/"+files[n-1]);
Scanner reader = new Scanner(file);
while(reader.hasNextLine()){
System.out.println(reader.nextLine());
}


}catch(IOException e){
System.out.println(e);
}





}
}