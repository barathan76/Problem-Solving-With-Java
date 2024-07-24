package Services;
import Collectives.Product;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ProductFileHandler{
public static List<Product> fetchProducts(){
List<Product> products = new ArrayList<Product>();
File file = new File("Database\\Products\\Products.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNextLine()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Product product = new Product(arr[0],arr[1],Double.parseDouble(arr[2]));
products.add(product);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return products;
}





public static void updateProducts(List<Product> products){
File file = new File("Database\\Products\\Products.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));

for(Product product : products){
writer.write(product.getProductId()+ "::::"+product.getProductName()+"::::"+product.getPrice());
writer.newLine();
}

writer.close();
}catch(IOException e){System.out.println("file error");}
}

}