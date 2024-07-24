/*12:19 - */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class PowerSet{

static void recursive(String str,int index,int n,List<String> list,int k,String curr){

if(curr.length() == k){
	list.add(curr);
	return;
}
if(index == n)
	return;
recursive(str, index + 1, n, list, k, curr + str.charAt(index));
recursive(str, index + 1, n, list, k, curr);
}


static List<String> solve(String str,int n){
List<String> list = new ArrayList<String>();
int k  =0;
while(k<=n){
String curr = "";
recursive(str,0,n,list,k,"");
k++;
}
return list;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int n = str.length();
System.out.println(solve(str,n));
}
}