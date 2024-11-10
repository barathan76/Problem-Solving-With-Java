import java.util.Scanner;
class Stack{
int arr[];
int n;
int i;
Stack(int arr[],int i,int n){
this.arr = arr;
this.n = n;
this.i = i;
}
void push(int k){
if(i<n){
arr[i]= k;
i++;
}else
	System.out.println("Stack is Full");
}
int pop(){
if(i==n)
i--;
else if(i == 0){
	System.out.println("Stack is Empty");
	return 0;
}

int k =arr[i];
arr[i] = 0;
i--;
return k;
}

}
class TwoStacks{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
Stack stackA = new Stack(arr,0,n/2);
Stack stackB = new Stack(arr,n/2,n);
for(int i =0;i<n/2;i++)
	stackA.push(i);
for(int i=n/2;i<n;i++)
	stackB.push(i);
System.out.println(stackA.pop());
System.out.println(stackB.pop());
}
}
