import java.util.Scanner;
class GuessRandomNumber
{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Generating a random number from 0 to 100");
int random = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
int k = 0;
System.out.println("Guess the number");
do{
System.out.print("Enter : ");
k = scan.nextInt();
}while(k!=random);
System.out.println("Correct!");
}
}


