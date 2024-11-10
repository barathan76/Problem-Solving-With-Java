package Services;
import Collectives.Coupan;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoupanFileHandler{
public static List<Coupan> fetchCoupans(){
List<Coupan> coupans = new ArrayList<Coupan>();
File file = new File("Database\\Products\\Coupans.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
Scanner scan;
try{scan = new Scanner(file);
while(scan.hasNext()){
String str = scan.nextLine();
String arr[] = str.split("::::");
Coupan coupan = new Coupan(arr[0],arr[1],Double.parseDouble(arr[2]));
coupans.add(coupan);
}}catch(FileNotFoundException e){System.out.println("File not found");}
return coupans;
}





public static void updateCoupans(List<Coupan> coupans){
File file = new File("Database\\Products\\Coupans.txt");
try{file.createNewFile();}catch(IOException e){System.out.println("File error");}
try{BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));

for(Coupan coupan : coupans){
writer.write(coupan.getCode("Writer")+ "::::"+coupan.getProductId("Writer")+"::::"+coupan.getDiscount("Writer"));
writer.newLine();
}

writer.close();
}catch(IOException e){System.out.println("file error");}
}

}