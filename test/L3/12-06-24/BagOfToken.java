import java.util.Scanner;
class BagOfToken{


static boolean check(int a,int p){
if(a<=p)
	return true;
else
	return false;

}
static int solve(int arr[],int power,int n){
int score = 0;
if(n == 1){
if(power<=arr[0])
	return 0;
else
	return 1;
}
int k = n;
while(k>0){
System.out.println(score);
int maxDiff = 0;
int index = 0;
boolean flag = true;
for(int i =0;i<n;i++){
if(arr[i] == 0)
	continue;
if(check(arr[i],power) && k>1){
	System.out.println(arr[i]);
	k--;
	power-=arr[i];
	arr[i] = 0;
	score++;
flag = false;
	break;
}
else if(check(arr[i],power) && k == 1 && score>=1){
	return score+1;
}
else if(maxDiff > arr[i] - power){
	maxDiff = arr[i] - power;
	index = i;
}	
}
if(flag){
System.out.println(arr[index]);
arr[index] = 0;
score--;
}
k--;
}
return score;

}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int power = scan.nextInt();
System.out.println(solve(arr,power,n));
}
}