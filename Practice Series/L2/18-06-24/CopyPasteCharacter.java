import java.util.Scanner;
class CopyPasteCharacter{

static int solve(int n){
int dp[] = new int[n];

int str = 1;
int copy = 0;
dp[0] = 0;
int index = -1;
for(int i =1;i<n;i++){
if(n%str == 0 && str<n){
	copy = str;
	dp[i]+=2;
	str+=copy;
}else if(str<n){
dp[i]++;
str+=copy;
}else{
index = i;
break;
}
dp[i]+=dp[i-1];
}
if(index!=-1){
while(index<n){
dp[index] += dp[index-1];
index++;
}
}
return dp[n-1];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}


}