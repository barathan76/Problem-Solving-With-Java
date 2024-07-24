import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class SubSetString{

static Map<Character,Integer> getFreqMap(String str){
Map<Character,Integer> map = new HashMap<Character,Integer>();
for(char c : str.toCharArray()){
if(map.containsKey(c))
	map.put(c,map.get(c)+1);
else
	map.put(c,1);
}
return map;
}

static Boolean check(String str,String b[],int k){
Map<Character,Integer> freqMap = getFreqMap(str);
for(String s : b){
char c = s.charAt(0);
if(freqMap.containsKey(c) && freqMap.get(c)>0)
	freqMap.put(c,freqMap.get(c)-1);
else
	return false;
}
return true;
}

static List<String> solve(String a[],String b[],int n,int k){
List<String> list = new ArrayList<String>();
for(int i =0;i<n;i++){
if(check(a[i],b,k))
	list.add(a[i]);
}
return list;
}


static void printList(List<String> ans){
for(String s:ans)
	System.out.print(s+ " ");
System.out.println();

}




public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String arr1[] = new String[n];
for(int i =0;i<n;i++){
arr1[i] = scan.nextLine();
}
System.out.println();
int k = scan.nextInt();
scan.nextLine();
String arr2[] = new String[k];
for(int i =0;i<k;i++){
arr2[i] = scan.next();
}
List<String> ans = solve(arr1,arr2,n,k);
printList(ans);
}
}
