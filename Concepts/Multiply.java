import java.util.Scanner;
class Multiply{
static int mul(int a,int b){
while(b !=0){
int x = a&b;
a = a ^ b;
b = x << 1;
}
return a;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int ans = 0;
for(int i =0;i<b;i++){
ans = mul(ans,a);
}
System.out.println(ans);
}
}