import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class Q5{



static double recursive(double adj[][],int index,int find,double val){

if(index == 26)
	return -1;

if(adj[index][find]!=0)
	return val*adj[index][find];


for(int i = index+1;i<26;i++){
if(adj[index][i]!=0){
	double k = recursive(adj,i,find,val*adj[index][i]);
	if(k!=-1)
		return k;
}
}


return -1;
}
static double[] solve(String arr[][],String str[][],double values[],int e,int q){

double adj[][] = new double[26][26];
for(int i = 0;i<e;i++){
int a = arr[i][0].charAt(0) - 'a';
int b = arr[i][1].charAt(0) - 'a';
adj[a][b] = values[i];
adj[b][a] = 1/values[i];
}





double ans[] = new double[q];

for(int i = 0;i<q;i++)
	ans[i] = -1;

for(int i = 0;i<q;i++){
int a = str[i][0].charAt(0) - 'a';
int b = str[i][1].charAt(0) - 'a';
if(adj[a][b]!=0){
	ans[i] = adj[a][b];
	continue;
}
for(int j = a+1;j<26;j++){
	if(adj[a][j]!=0){
	double k = recursive(adj,j,b,adj[a][j]);
	if(k!=-1)
		ans[i] = k;
	break;
		
}
}
}

return ans;
}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int e = scan.nextInt();
String arr[][] = new String[e][2];
int q = scan.nextInt();
for(int i =0;i<e;i++){
arr[i][0] = scan.next();
arr[i][1] = scan.next();
}


double values[] = new double[e];
for(int i =0;i<e;i++)
	values[i] = scan.nextDouble();
String str[][] = new String[q][2];
for(int i = 0;i<q;i++){
str[i][0] = scan.next();
str[i][1] = scan.next();
}
double ans[] = solve(arr,str,values,e,q);

for(int i =0;i<ans.length;i++)
	System.out.print(ans[i]+ " ");
}
}