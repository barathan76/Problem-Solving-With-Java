import java.util.Scanner;
class PowerOfNumber
{
static float power(int n, int p){
int val = 1;
for(;p>0;p=p>>1){
if((p&1) == 1){
	val = val * n;
}
n = n*n;
}
return val;
}
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter the value of the number : ");
int n = scan.nextInt();
System.out.println();
System.out.print("Enter the value of the power : ");
int p = scan.nextInt();
System.out.println();
int val = 0;
for(int i =0;i<=p;i++)
{
if(i==0){
val = 1;
}
else{
val*=n;
}
}
System.out.println("The number "+n+" with power "+p+" is : "+val);
float ans = 1;
if(p>0){
	ans = power(n,p);
}
else if(p<0){
	ans = 1/power(n,-p);
}
System.out.println("The number "+n+" with power "+p+" is : "+ans);
}
}


	


