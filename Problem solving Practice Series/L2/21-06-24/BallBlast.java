import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
class BallBlast{
static Set<String> probSet = new HashSet<String>();
static void recursive(int arr[],int index,int n,String str){


if(str.length() == n){
probSet.add(str);
return;
}

if(index== n)
	return;


for(int i =0;i<arr.length;i++){
str+=arr[i];

int rem[] = new int[arr.length-1];
int k = 0;
for(int j =0;j<arr.length;j++){
if(i == j)
	continue;
else
	rem[k++] = arr[j];
}
recursive(rem,index+1,n,str);
str = str.substring(0,str.length()-1);
}
}
static double solve(int arr[],int k){
int n = 0;
for(int i=0;i<k;i++)
	n+=arr[i];
int balls[] = new int[n];
int index = 0;
for(int i=0;i<k;i++){
for(int j =0;j<arr[i];j++){
balls[index++] = i+1;
}
}
for(int i = 0;i<n;i++)
	System.out.print(balls[i]+" ");

recursive(balls,0,n,"");

System.out.println(probSet.size());

double count = 0;

Iterator<String> iterate = probSet.iterator();
while(iterate.hasNext()){
String str = iterate.next();
System.out.println(str);
int c = 0;
int d=  0;
for(int i = 0;i<n/2;i++){
c = c^(str.charAt(i) - '0');
}

for(int i =n/2;i<n;i++){
d = d ^(str.charAt(i) - '0');
}
System.out.println(c+" "+d);
if(d == (str.charAt((n/2)-1) - '0') &&  c == (str.charAt(n-1) - '0'))
	count++;
}
System.out.println(count);

return count/probSet.size();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}