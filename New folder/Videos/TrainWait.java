import java.util.Scanner;

class TrainWait{
static float getValue(String s){
String  str[] = s.split(":");
int a = Integer.parseInt(str[0]);
int b = Integer.parseInt(str[1]);
float k = (float)(a+(b*0.01));
return k;
}
static int solve(String a[],String b[],int n){
int diff = Integer.MIN_VALUE;
int count = 1;
for(int i =0;i<n;i++){
float arrive = getValue(a[i]);
float depart = getValue(b[i]);
for(int j = i+1;j<n;j++){
	if(getValue(a[j])>arrive && getValue(b[j]) < depart)
		count++;
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n =scan.nextInt();
String arrive[] = new String[n];
String depart[] = new String[n];
for(int i =0;i<n;i++)
	arrive[i] =scan.next();
for(int i =0;i<n;i++)
	depart[i] =scan.next();
System.out.println(solve(arrive,depart,n));
}



}