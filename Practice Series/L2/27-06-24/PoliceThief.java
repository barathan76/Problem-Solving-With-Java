import java.util.Scanner;
class PoliceThief{
static int solve(char arr[][],int n,int k){
int count = 0;
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
boolean flag = true;
if(arr[i][j] == 'P'){
	for(int l = j+1;l<n && l<= j+k;l++){
		if(arr[i][l] == 'T'){
			arr[i][l] = '\0';
			count++;
		flag = false;
		break;
}
if(arr[i][l] == 'P')
	break;
}

if(flag){
for(int l = j-1;l>=0 && l>=j - k;l--){
		if(arr[i][l] == 'T'){
			arr[i][l] = '\0';
			count++;
			break;
}
if(arr[i][l] == 'P')
	break;
}
}
}
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
char arr[][] = new char[n][n];
for(int i =0;i<n;i++){
for(int j = 0;j<n;j++){
arr[i][j] = scan.next().charAt(0);
}
}
System.out.println(solve(arr,n,k));
}
}