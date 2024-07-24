import java.util.Scanner;
class ExtendedEuclid{

static int[] solve(int a,int b){

int x = 0,y =0;
int x1 = 0,x2 = 1;
int y1 = 1,y2 = 0;
int q = 0,r = 0;

while(b>0){
q = a/b;
r = a%b;
x = x2 - q*x1;
y = y2 - q*y1;

x2 = x1;
y2 = y1;
x1 = x;
y1 = y;

a = b;
b = r;
}
int ans[] = new int[3];
ans[0] = x2;
ans[1] = y2;
ans[2] = a;
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int ans[] = solve(a,b);
for(int i =0;i<3;i++)
	System.out.print(ans[i]+" ");
}

}