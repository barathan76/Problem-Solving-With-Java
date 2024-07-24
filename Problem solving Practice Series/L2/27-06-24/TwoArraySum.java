import java.util.Scanner;
class TwoArraySum{
static void solve(int a,int b){
int n = 0;
int m = 0;
int t1 = a;
int t2 = b;
while(t1>0){
	n++;
	t1/=10;
}
while(t2>0){
	m++;
	t2/=10;
}
int arr1[] = new int[n];
int arr2[] = new int[m];
for(int i =0;i<n;i++){
arr1[i] = a%10;
a = a/10;
}
for(int i = 0;i<m;i++){
arr2[i] = b%10;
b = b/10;
}
int i = 0,j = 0;
int c = 0;
int ans[] = new int[Math.max(n,m)+1];
int k = 0;
while(i<n && j<m){
ans[k] = (arr1[i]+arr2[j]+c)%10;
c = (arr1[i]+arr2[j]+c)/10;
k++;
i++;
j++;
}

while(i<n){
ans[k] = (arr1[i]+c)%10;
c = (arr1[i]+c)/10;
k++;
i++;
}

while(j<m){
ans[k] = (arr1[i]+c)%10;
c = (arr1[i]+c)/10;
k++;
j++;
}
if(c == 1)
	ans[k] = 1;
if(ans[ans.length-1] == 0)
	i = ans.length-2;
else
	i = ans.length-1;
for(;i>=0;i--){
System.out.print(ans[i]);
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
solve(a,b);
}
}