import java.util.Scanner;
class Node{
int val;
Node next;
Node(int val){
this.val = val;
this.next = null;
}
}
class LinkedList{
Node head;
LinkedList(){
head = null;
}
void add(int val){
if(head == null)
	head = new Node(val);
else{
Node temp = head;
while(temp.next!=null)
	temp = temp.next;
temp.next = new Node(val);
}
}

Node getHead(){
return head;
}
}

public class ListAdd{
static LinkedList solve(Node head1,Node head2){

Node temp1 = head1;
Node temp2 = head2;
LinkedList ans = new LinkedList();


int c = 0;
while(temp1!=null && temp2!=null){
int sum = temp1.val + temp2.val+c;
int k = 0;
if(sum>=10){
k = 1;
sum = sum - 10;
}
ans.add(sum);	
c= k;
temp1 = temp1.next;
temp2 = temp2.next;
}

while(temp1!=null){
int sum = temp1.val+c;
int k =0;
if(sum>=10){
k = 1;
sum = sum%10;
}
c = k;
ans.add(sum);
temp1 = temp1.next;
}

while(temp2!=null){
int sum = temp2.val+c;
int k =0;
if(sum>=10){
k = 1;
sum = sum%10;
}
c = k;
ans.add(sum);
temp2 = temp2.next;
}

if(c == 1)
	ans.add(1);
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
LinkedList list1 = new LinkedList();
LinkedList list2 = new LinkedList();

for(int i =0;i<n;i++){
int a = scan.nextInt();
list1.add(a);
}


for(int i =0;i<m;i++){
int a = scan.nextInt();
list2.add(a);
}

Node head1 = list1.getHead();
Node head2 = list2.getHead();

LinkedList ans = solve(head1,head2);

Node temp = ans.getHead();

while(temp!=null){
	System.out.print(temp.val+" ");
	temp = temp.next;
}

}
}