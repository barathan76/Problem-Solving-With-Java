import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class StringPattern{
static boolean isLower(byte i){
if(i>=97 && i<=122)
	return true;
else 
	return false;
}

static boolean valid(String str,String pattern){
int i =0,j=0;
int a = str.length();
int b = pattern.length();
for(;j<b;j++,i++){
while(i<a && str.charAt(i)!=pattern.charAt(j) && isLower((byte)str.charAt(i)))
	i++;
if(i==a || str.charAt(i)!=pattern.charAt(j))
	return false;
}
while(i<a && isLower((byte)str.charAt(i)))
	i++;

return i==a;
}


static List<Boolean> solve(String arr[],int n,String pattern){
List<Boolean> ans = new ArrayList<Boolean>();
for(int i =0;i<n;i++){
	ans.add(valid(arr[i],pattern));
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String arr[] = new String[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextLine();
System.out.println();
String pattern = scan.nextLine();
System.out.println(solve(arr,n,pattern));
}
}