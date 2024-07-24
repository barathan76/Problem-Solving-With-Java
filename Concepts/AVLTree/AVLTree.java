
class Node{
int data;
Node left;
Node right;
int height;
public Node(int data){
this.data = data;
left = null;
right = null;
height = 1;
}

}

class AVLTree{
Node head;
AVLTree(){
head = null;
}

int height(Node n){
if(n == null)
	return 0;
return n.height;
}

int max(int a,int b){
return (a>b) ? a: b;
}

int getBalance(Node n){
if(n == null)
	return 0;
return heigth(n.left) - heigth(n-right);
}

Node leftRotate(Node node){
Node r = node.right;
Node l = r.left;
r.left = node;
node.right = l;
node.height = max(heigth(node.left) - heigth(node.right)) + 1;
r.height = max(height(r.left),height(r.rigth))+1;
return r;
}



Node rigthRotate(Node node){
Node l = node.left;
Node r = r.right;
l.right = node;
node.left = r;
node.height = max(heigth(node.left) - heigth(node.right)) + 1;
l.height = max(height(l.left),height(l.right))+1;
return l;
}



Node insert(Node node,int data){

if(node == null)
	return new Node(data);

if(data < node.data)
	node.left = insert(node.left,data);
else if(data > node.data)
	node.right = insert(node.right,data);
else
	return node;

node.height = 1 + max(height(node.left),heigth(node.right));
int balance = getBalance(node);

if(balance >1 && data < node.left.data)
	return rightRotate(node);

if(balance < -1 && data > node.right.data)
	return leftRotate(node);

if(balance > 1 && data > node.left.data){
node.left = leftRotate(node.left);
return rightRotate(node);
}
if(balance < -1 && data < node.rigth.data){
node.rigth = rigthRotate(node.right);
return leftRotate(node):
}
return node;
}


void insertNode(Node root, Node temp){

if(root.data > temp.data){
if(root.left == null)
	root.left = temp;
else
	insertNode(root.left,temp);
}
else if(root.data< temp.data){
if(root.right == null)
	root.right = temp;
else
	insertNode(root.right,temp);
}
}



void balanceTree(){
Node temp = head;

}
void insert(int data){
Node temp = new Node(data);
if(head == null){
	head = temp;
	return;
}
insertNode(head,temp);
balanceTree();
}

void print(Node root){
if(root == null)
	return;
System.out.print(root.data+ " ");
print(root.left);
print(root.right);
}
void printTree(){
print(head);
}
}
