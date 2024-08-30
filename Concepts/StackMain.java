class Stack{
class Node{
int val;
Node next;
Node(int val){
this.val = val;
this.next = null;
}
}
Node head;
Stack(){
head = null;
}
public void push(int a){
Node node = new Node(a);
node.next = head;
head = node;
}
public int pop(){
if(head == null){
	System.out.println("Stack is empty da funda");
	return -1;
}
Node node = head;
int x = node.val;
head = head.next;
node.next =null;
return node.val;
}
public int peek(){
if(head == null)
	return -1;
return head.val;
}
}
public class StackMain{
public static void main(String args[]){
Stack stack = new Stack();
for(int i =0;i<10;i++){
stack.push(i);
}
System.out.println(stack.peek());
for(int i =0;i<11;i++){
System.out.println(stack.pop());
}
}
}