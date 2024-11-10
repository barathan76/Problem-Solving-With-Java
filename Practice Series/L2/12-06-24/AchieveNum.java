import java.util.Scanner;
class AchieveNum{
static int solve(int num,int t){
return num + t*2;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
int t = scan.nextInt();
System.out.println(solve(num,t));
}
}