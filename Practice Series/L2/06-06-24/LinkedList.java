import java.util.Scanner;
class LinkedList{
class Node{
int data;
Node next;
Node(int data){
this.data = data;
next = null;
}
}

Node head;

LinkedList(){
head = null;
}

void insert(int data){
if(head == null){
	head = new Node(data);
	return;
}
Node temp = head;
Node prev = temp;
while(temp!=null){
prev = temp;
temp = temp.next;
}
temp = new Node(data);
prev.next = temp;
}

void remove(int data){
Node temp = head;
Node prev = temp;
while(temp!=null){
if(temp.data == data){
if(temp == head){
	head = head.next;
	prev = prev.next;
	
}
else
	prev.next = temp.next;
}
else
	prev = temp;
temp = temp.next;	
}
}

String traverseToEnd(Node node){
String str = "";
Node temp = node;
while(temp!=null){
str+=temp.data;
temp = temp.next;
}
return str;
}

Node getHead(){
return head;
}


LinkedList merge(LinkedList list){
Node temp1 = head;
Node temp2 = list.getHead();
LinkedList ans = new LinkedList();
while(temp1!= null && temp2!=null){
if(temp1.data < temp2.data){
	ans.insert(temp1.data);
	temp1 = temp1.next;
}
else if(temp1.data > temp2.data){
ans.insert(temp2.data);
temp2 = temp2.next;
}
else if(temp1.data == temp2.data){
ans.insert(temp1.data);
ans.insert(temp2.data);
temp1 = temp1.next;
temp2 = temp2.next;
}
}
while(temp1!=null){
ans.insert(temp1.data);
temp1 = temp1.next;
}
while(temp2!=null){
ans.insert(temp2.data);
temp2 = temp2.next;
}
return ans;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
LinkedList list = new LinkedList();
for(int i =0;i<n;i++){
int a = scan.nextInt();
list.insert(a);
}

String str = list.traverseToEnd(list.getHead());
StringBuilder builder = new StringBuilder(str);
System.out.println(str.equals(builder.reverse().toString()));

int r = scan.nextInt();
list.remove(r);
System.out.println(list.traverseToEnd(list.getHead()));


System.out.println("Enter the list 1 elements to merge");
int len1 = scan.nextInt();
LinkedList list1 = new LinkedList();
for(int i =0;i<len1;i++){
int a = scan.nextInt();
list1.insert(a);
}



System.out.println("Enter the list 2 elements to merge");
int len2 = scan.nextInt();
LinkedList list2 = new LinkedList();
for(int i =0;i<len2;i++){
int a = scan.nextInt();
list2.insert(a);
}

LinkedList mergedNode = list1.merge(list2);

System.out.println(mergedNode.traverseToEnd(mergedNode.getHead()));


}
}
