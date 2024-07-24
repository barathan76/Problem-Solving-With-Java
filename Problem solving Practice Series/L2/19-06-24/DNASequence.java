import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class DNASequence{

static void solve(String str){
Map<String,Integer> map = new HashMap<String,Integer>();
for(int i =0;i<str.length()-10;i++){
String s = str.substring(i,i+10);
map.put(s,map.getOrDefault(s,0)+1);
}
for(Map.Entry<String,Integer> entry : map.entrySet()){
if(entry.getValue()>1)
	System.out.println(entry.getKey());
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
solve(str);
}
}