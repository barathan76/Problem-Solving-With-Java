import java.util.Queue;
import java.util.LinkedList;
class BinarySearchTree{
class Node{
int data;
Node left;
Node right;
Node(int data){
this.data = data;
left = null;
right = null;
}
}
private Node root;
BinarySearchTree(){
root = null;
}
Node getRoot(){
return root;
}
Node TreeInsert(Node root,int data){
if(root == null){
	root = new Node(data);
	return root;}
else if(data<root.data)
	root.left = TreeInsert(root.left,data);
else
	root.right = TreeInsert(root.right,data);
return root;

}
void insert(int data){
root = TreeInsert(root,data);
}
void treeDfs(){
traverseDfs(root);
}
void traverseDfs(Node root){
if(root == null)
	return;
traverseDfs(root.left);
System.out.println(root.data);
traverseDfs(root.right);
}
void treeBfs(){
traverseBfs(root);
}

void traverseBfs(Node root){
if(root == null)
	return;
Queue<Node> queue = new LinkedList<Node>();
queue.add(root);

while(!queue.isEmpty()){
Node temp = queue.poll();
System.out.println(temp.data);
if(temp.left!=null)
	queue.add(temp.left);
if(temp.right!=null)
	queue.add(temp.right);
}
}
}
class Main{
public static void main(String args[]){
BinarySearchTree tree = new BinarySearchTree();
for(int i =1;i<=10;i++)
	tree.insert(i);
tree.treeDfs();
tree.treeBfs();
}

}