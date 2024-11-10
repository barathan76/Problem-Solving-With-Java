import java.util.Scanner;
class LeastIndexSum{
static String solve(String[] a,String b[],int n,int m){
int min = Integer.MAX_VALUE;
int index = 0;
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
if(a[i].equals(b[j])){
if(i+j<min){
	index = i;
	min = i+j;
}	
}
}
}
return a[index];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
String andy[] = new String[a];
String doris[] = new String[b];
scan.nextLine();
for(int i =0;i<a;i++)
	andy[i] = scan.nextLine();

for(int i=0;i<b;i++)
	doris[i] = scan.nextLine();

System.out.println(solve(andy,doris,a,b));
}
}