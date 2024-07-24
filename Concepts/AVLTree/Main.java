import java.util.Scanner;
class Main{


public static void main(String args[]){

Scanner scan = new Scanner(System.in);
AVLTree tree = new AVLTree();
int n = scan.nextInt();
for(int i = 0;i<n;i++){
int v = scan.nextInt();
tree.insert(v);
}
tree.printTree();
}

}