import java.util.Scanner;
class BallBox{

static int getSum(int a){
if(a<10)
	return a;
else
	return a%10 + getSum(a/10);
}
static int solve(int low,int high){

int boxes[] = new int[high+1];

for(int i =low;i<=high;i++){
boxes[getSum(i)]++;
}

int max = 0;
for(int i =low;i<=high;i++){
max = Math.max(max,boxes[getSum(i)]);
}

return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int low = scan.nextInt();
int high = scan.nextInt();
System.out.println(solve(low,high));
}
}