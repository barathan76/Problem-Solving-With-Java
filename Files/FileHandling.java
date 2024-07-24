import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
class FileHandling
{
public static void main(String args[])
{
System.out.println("*******************Welcome to File Handler*******************");
System.out.println("_____________________________________________________________");
System.out.println("Available feature : ");
Scanner scan = new Scanner(System.in);
try{
while(true)
{
System.out.println();
System.out.println("1.List the files in the directory");
System.out.println("2.Write a file into the directory");
System.out.println("3.Read a file from the directory");
System.out.println("4.Exit");
System.out.print("Enter you choice : ");
int n = scan.nextInt();
File file = new File("sample");
scan.nextLine();
switch(n){
case 1:
	System.out.println("The files in the directory are : ");
	file = new File("Test");
	String[] files = file.list();
	int i = 1;
	for(String f:files){
		System.out.println(i+"."+f);
		i++;
	}
	break;
case 2:
	System.out.print("Enter the file name to write : ");
	String fileName = scan.nextLine();
	file = new File(fileName+".txt");
	if(!file.exists()){
		file.createNewFile();
	}
	System.out.println("Enter the sentance to write in file : ");
	String sentance = scan.nextLine();
	FileWriter writer = new FileWriter(file);
	writer.write(sentance);
	writer.close();
break;
case 3:
	
	System.out.println("Enter the file name to read");
	fileName = scan.nextLine();
	file = new File("Test//"+fileName);
	if(!file.exists()){
	System.out.println("Specified file not found");
}
	Scanner reader = new Scanner(file);
	while(reader.hasNextLine())
	{
		System.out.println(reader.nextLine());
}
break;
case 4:
	return;
default:
	System.out.println("Invalid input");
	break;
}
}
	

}catch(InputMismatchException e){
System.out.println("Enter valid input");
}catch(IOException e){
System.out.println(e);
}
}
}