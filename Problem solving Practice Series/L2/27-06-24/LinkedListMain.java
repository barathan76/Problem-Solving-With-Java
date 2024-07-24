import java.util.Scanner;

class Node<T>{
T data;
Node<T> next;

Node(T data){
this.data = data;
this.next = null;
}
}



class LinkedList<T> {


Node<T> head;
Node<T> last;
LinkedList(){
this.head = null;
this.last = null;
}



void addFirst(T data){
Node<T> temp = new Node<T>(data);

if(head == null && last == null){
head = temp;
last = temp;
}else{
temp.next = head;
head = temp;
}
}


void addLast(T data){
Node<T> temp = new Node<T>(data);
if(head == null && last == null){
head = temp;
last = temp;
}

else{
last.next = temp;
last = temp;
}
}


void printList(){

Node<T> temp = head;

while(temp!=null){

System.out.print(temp.data+" ");
temp = temp.next;
}

}
}





public class LinkedListMain{
static void solve(int arr[],int n){
LinkedList<Integer> list = new LinkedList<Integer>();
for(int i =0;i<n-1;i+=2){
if(arr[i+1] == 0)
	list.addFirst(arr[i]);
else if(arr[i+1] == 1)
	list.addLast(arr[i]);

}

list.printList();

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
}
}