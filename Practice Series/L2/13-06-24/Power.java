import java.util.Scanner;
class Power{

static double pow(double x,int n){
if(n == 0)
	return 1;
return x * pow(x,n-1);
}
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
double x = scan.nextDouble();
int n = scan.nextInt();
if(n >0)
	System.out.println(pow(x,n));
else
	System.out.println(1/pow(x,-n));
}
}