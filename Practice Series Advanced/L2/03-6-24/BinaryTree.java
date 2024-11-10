import java.util.Scanner;
class BinaryTree{
static class Node{
int data;
Node left;
Node right;
Node(int data){
this.data = data;
left = null;
right = null;
}
}

Node root;
BinaryTree(){
root = null;
}


static void traverse(Node temp){
if(temp == null)
	return;
System.out.print(temp.data);
if(temp.left!=null ){
	System.out.print("(");
	traverse(temp.left);
	System.out.print(")");
}
if(temp.left == null && temp.right!=null){
System.out.print("()");
}
if(temp.right!=null){

System.out.print("(");
traverse(temp.right);
System.out.print(")");
}
}

static void print(BinaryTree tree){
Node root1 = tree.root;
traverse(root1);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);

BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
print(tree);
System.out.println();

BinaryTree tree1 = new BinaryTree();
tree1.root = new Node(1);
tree1.root.left = new Node(2);
tree1.root.right = new Node(3);
tree1.root.left.left = null;
tree1.root.left.right = new Node(4);
print(tree1);
}
}