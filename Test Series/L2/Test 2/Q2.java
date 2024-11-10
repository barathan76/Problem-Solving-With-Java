import java.util.Scanner;

class Q2{


static int solve(String str){
int n = str.length();
int ans = 0;
for(int i =0;i<n;i++){
ans = ans*26 + str.charAt(i) - 'A' +1;
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));

}

}