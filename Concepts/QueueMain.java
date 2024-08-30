class Queue{
class Node{
int val;
Node next;
Node(int val){
this.val = val;
this.next = null;
}
}
Node front;
Node back;
public void enqueue(int a){
Node node = new Node(a);
if(front == null)
	front = node;
if(back == null)
	back = node;
else{
back.next = node;
back = node;
}
}
public int dequeue(){
if(front == null)
	return -1;
int x = front.val;
Node node = front;
front = front.next;
node.next = null;
return x;
}
public int poll(){
if(front == null)
	return -1;
return front.val;
}
}
public class QueueMain{
public static void main(String args[]){
Queue queue = new Queue();
for(int i =0;i<10;i++)
	queue.enqueue(i);
for(int i =0;i<11;i++)
	System.out.println(queue.dequeue());
for(int i =0;i<10;i++)
	queue.enqueue(i);
for(int i =0;i<11;i++)
	System.out.println(queue.dequeue());
}
}