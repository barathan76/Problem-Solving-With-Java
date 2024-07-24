import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
class Interleave{
static void interleave(String str1,String str2,int i,int j,int n,int m,String current,Set<String> set){
if(current.length() == n+m){
	set.add(current);
	return;
}
if(i<n)
	interleave(str1,str2,i+1,j,n,m,current+str1.charAt(i),set);
if(j<m)
	interleave(str1,str2,i,j+1,n,m,current+str2.charAt(j),set);
}
static void solve(String str1,String str2){
Set<String> set = new HashSet<String>();
interleave(str1,str2,0,0,str1.length(),str2.length(),"",set);
Iterator<String> iterate = set.iterator();
while(iterate.hasNext())
	System.out.println(iterate.next());
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str1 = scan.nextLine();
String str2 = scan.nextLine();
solve(str1,str2);
}
}