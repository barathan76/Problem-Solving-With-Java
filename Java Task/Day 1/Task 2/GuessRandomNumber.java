import java.util.Scanner;
class GuessRandomNumber
{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Generating a random number from 0 to 100");
int random = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
int k = 0;
System.out.println("Guess the number" + random);
int t = 5;
System.out.println("Your health is "+t+" and your health will reduce each time you guess wrong.");
do{
System.out.print("Available Heart "+t+" Enter : ");
k = scan.nextInt();
t--;
if(t == 0){
break;
}
}while(k!=random);
if(k==random){
System.out.println("Correct!");
}
else{
System.out.println("Game Over");
}
}
}


