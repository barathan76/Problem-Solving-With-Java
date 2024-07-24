import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Union{
static List<Integer> solve(int a[],int b[],int n,int m){
List<Integer> ans = new ArrayList<Integer>();
int i =0,j=0;
while(i<n && j<m){
if(a[i]<b[j])
	ans.add(a[i++]);
else if(a[i]>b[j])
	ans.add(b[j++]);
else
{
	ans.add(a[i++]);
	j++;
}
}
while(i<n)
	ans.add(a[i++]);
while(j<m)
	ans.add(b[j++]);
return ans;
}

static void printList(List<Integer> list){
for(Integer i: list)
	System.out.print(i+ " ");
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int a[] = new int[n];
int b[] = new int[m];
for(int i = 0;i<n;i++){
a[i] = scan.nextInt();
}
for(int i = 0;i<m;i++){
b[i] = scan.nextInt();
}
List<Integer> ans = solve(a,b,n,m);
printList(ans);
}
}