import java.util.Scanner;

class MultiplicationTable{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = scan.nextInt();
for(int i =1;i<=10;i++){
System.out.println(n+" x "+i+" = "+n*i);
}
scan.close();
}
}
