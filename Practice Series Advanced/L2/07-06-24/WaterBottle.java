import java.util.Scanner;

class WaterBottle{


static int solve(int n,int e,int p){

if(n+p<e)
	return n;
return n+solve((n+p)/e,e,(n+p)%e);


}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
System.out.println(solve(n,e,0));
}

}