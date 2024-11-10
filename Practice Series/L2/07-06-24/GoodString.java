import java.util.Scanner;
class GoodString{
static int solve(int n){

if(n ==1)
	return 5;
int sum = 1;
for(int i =0;i<n;i++){
if(i == 0 || i%2 == 1)
	sum*=4;
else if(i%2 == 0)
	sum*=5;
}
return sum;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}