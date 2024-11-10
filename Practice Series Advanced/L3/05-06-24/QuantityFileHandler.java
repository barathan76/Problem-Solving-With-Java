package Services;
import Collectives.Quantity;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuantityFileHandler{
public static List<Quantity> fetchQuantities(){
List<Quantity> quantities = new ArrayList<Quantity>();
File file = new File("Database\\Products\\Quantities.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNextLine()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Quantity quantity = new Quantity(arr[0],Integer.parseInt(arr[1]));
quantities.add(quantity);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return quantities;
}





public static void updateQuantities(List<Quantity> quantities){
File file = new File("Database\\Products\\Quantities.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));

for(Quantity quantity : quantities){
writer.write(quantity.productId()+ "::::"+quantity.getQuantity());
writer.newLine();
}

writer.close();
}catch(IOException e){System.out.println("file error");}
}

}