import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.util.Map.Entry;
import java.util.HashMap;
import java.io.FileNotFoundException;
class FreqWord{

public static void main(String args[]) throws FileNotFoundException{
Map<String,Integer> map = new HashMap<String,Integer>();
File file = new File("words.txt");
Scanner scan = new Scanner(file);
while(scan.hasNext()){
String s =scan.next();
map.put(s,map.getOrDefault(s,0)+1);
}
scan.close();
for(Entry<String,Integer> entry : map.entrySet())
	System.out.println(entry.getKey()+ " "+entry.getValue());
}
}