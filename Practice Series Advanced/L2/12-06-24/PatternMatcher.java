/*12:15 - */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class PatternMatcher{
static boolean match(String str,String pattern, int i,int j, Map<Character,String> map){
int n = str.length(), m = pattern.length();
if(n<m)
	return false;

if(i == n && j == m)
	return true;
if(i == n || j == m)
	return false;



char c = pattern.charAt(j);

if(map.containsKey(c)){

String a = map.get(c);
int k = a.length();
String b = "";
if(i+k < str.length())
	b = str.substring(i,i+k);
else
	b = str.substring(i);

if(!b.equals(a))
	return false;

return match(str,pattern,i+k,j+1,map);
}
else{

for(int k = 1;k<=n - i;k++)
{
map.put(c,str.substring(i,i+k));
if(match(str,pattern,i+k,j+1,map))
	return true;
map.remove(c);
}
}
return false;

}
static void solve(String str,String pattern){
Map<Character,String> map = new HashMap<Character,String>();
if(match(str,pattern,0,0,map)){
for(Map.Entry<Character,String> entry : map.entrySet())
	System.out.println(entry.getKey()+" : "+entry.getValue());
}else
	System.out.println("String does not match");
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String pattern = scan.nextLine();
solve(str,pattern);
}
}