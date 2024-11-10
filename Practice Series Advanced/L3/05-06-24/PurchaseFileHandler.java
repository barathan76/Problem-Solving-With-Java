package Services;
import Collectives.Purchase;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PurchaseFileHandler{
public static List<Purchase> fetchPurchases(String name){
List<Purchase> purchases = new ArrayList<Purchase>();
File file = new File("Database\\Purchases\\"+name+".txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNextLine()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Purchase purchase = new Purchase(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),Double.parseDouble(arr[4]));
purchases.add(purchase);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return purchases;
}





public static void addPurchases(Purchase purchase){
File file = new File("Database\\Purchases\\"+purchase.getProductName()+".txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
writer.write(purchase.getEmail()+ "::::"+purchase.getProductId()+"::::"+purchase.getProductName()+"::::"+purchase.getQuantity()+"::::"+purchase.getAmount());
writer.newLine();

writer.close();
}catch(IOException e){System.out.println("file error");}
}

}