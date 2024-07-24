/*5:14 - 5:20*/
import java.util.Scanner;

class Worlde{
static String solve(String word,String guess){
	String ans = "";
	int freq[]= new int[26];
	for(int i =0;i<word.length();i++)
		freq[word.charAt(i) - 'A']++;
	
	for(int i =0;i<word.length();i++){
		if(word.charAt(i) == guess.charAt(i))
			ans+="g";
		else if(freq[guess.charAt(i)-'A']>0)
			ans+='y';
		else
			ans+='-';
	}
	return ans;

}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String word = scan.nextLine();
String guess = scan.nextLine();
System.out.println(solve(word,guess));
}
}


/*
BLOCK
BRICK


BRIDE
SIREN

SPACE
SIREN


*/