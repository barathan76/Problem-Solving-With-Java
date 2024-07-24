import java.util.Scanner;
class PredictWinner{


static boolean predict(int arr[],int p1,int p2,int start,int end,boolean turn){

if(start == end){

if(turn)
	p1+=arr[start];
else
	p2+=arr[start];

if(p1>=p2){
	System.out.println(true);
	return true;
}
else{
System.out.println(false);
	return false;

}
}
if(turn){
	return predict(arr,p1+arr[start],p2,start+1,end,false) || predict(arr,p1+arr[end],p2,start,end-1,false);
}else{
	return predict(arr,p1,p2+arr[start],start+1,end,true) && predict(arr,p1,p2+arr[end],start,end-1,true);
}

}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(predict(arr,0,0,0,n-1,true));
}
}