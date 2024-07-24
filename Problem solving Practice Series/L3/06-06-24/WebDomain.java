import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class WebDomain{

static List<String> solve(String domains[],int n){
Map<String,Integer> map  = new HashMap<String,Integer>();

List<String> ans = new ArrayList<String>();

for(int i =0;i<n;i++){
String arr[] = domains[i].split(" ");
int count = Integer.parseInt(arr[0]);
String domain = arr[1];

String names[] = domain.split("\\.");
for(int j = 0;j<names.length;j++){
String name = names[j];
for(int k = j+1;k<names.length;k++){
name+="."+names[k];
}
if(map.containsKey(name))
	map.put(name,map.get(name)+count);
else
	map.put(name,count);
}
}
for(Map.Entry<String,Integer> entry : map.entrySet()){
ans.add(entry.getValue()+" "+entry.getKey());
}

return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String domains[] = new String[n];
for(int i=0;i<n;i++){
domains[i] = scan.nextLine();
}

System.out.println(solve(domains,n));


}
}