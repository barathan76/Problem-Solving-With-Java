import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Q3{

static boolean checkTrap(int x,int y){
if(x == y)
	return true;
else if(x%y == 0 || y%x == 0)
	return true;
else
	return false;

}

static String solve(int n1,int n2,int y){
String ans = "";
int arr[] = new int[n2-n1+1];
while(n1<=n2){
if(checkTrap(n1,y)){
y = y+2;
ans+=n1+ " ";
}else{
y = y-1;
if(y<3)
	y = 3;
}
n1++;
}
return ans;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n1 = scan.nextInt();
int n2 = scan.nextInt();
int y = scan.nextInt();

System.out.println(solve(n1,n2,y));



}

}