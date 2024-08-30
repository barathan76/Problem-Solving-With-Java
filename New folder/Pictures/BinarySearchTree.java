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

class BinarySearchTree{
private Node root;

BinarySearchTree(){
root = null;
}
Node getRoot(){
return root;
}

Node TreeInsert(int data){
if(root == null)
	return new Node(data);
if(data<root.data)
	root.left = TreeInsert(data);
else
	root.right = TreeInsert(data);
}
void insert(int data){
root = TreeInsert(int data);
}
}


class Traversal{
private BinarySearchTree tree;
private Graph graph;

void Traversal(BinarySearchTree tree){
this.tree = tree;
}
void Traversal(Graph graph){
this.graph = graph;
}
void treeDfs(){
Node root = tree.getRoot();
traverse(root);
}
void traverse(root){
if(root == null)
	return;
System.out.println(root.data);
traverse(root.left);
traverse(root.right);
}

c

}