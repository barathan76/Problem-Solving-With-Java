import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Q4{
	static int maxCount = 6;
	public static String reduce(String board){
		int i =0;
		int j = 0;
		while(j<board.length()){
			if(board.charAt(i) == board.charAt(j)){
				j++;
				continue;
			}
			if(j - i>=3)
				return reduce(board.substring(0,i)+board.substring(j));
			else
				i = j;
			j++;
		}
		return board;
	}
	public static int takeBall(String board,int freq[]){
		board = reduce(board);
		if(board.equals("E"))
			return 0;
		int ans = maxCount;
		int ballsTaken = 0;
		int i = 0 , j = 0;
		while(j<board.length()){
			if(board.charAt(i) == board.charAt(j)){
				j++;
				continue;
			}
			ballsTaken = 3 - (j-i);
			int c = board.charAt(i) - 'A';
			if(freq[c] >= ballsTaken){
				freq[c]-=ballsTaken;
				ans = Math.min(ans,ballsTaken+ takeBall(board.substring(0,i)+board.substring(j),freq));
				freq[c]+=ballsTaken;
			}
			i = j;
			j++;
		}
		return ans;
	}
	
	public static int solve(String board,String hand){
		int freq[] = new int[26];
		for(char c : hand.toCharArray())
			freq[c - 'A']++;
		int ans = takeBall(board+'E',freq);
		if(ans == maxCount){
			return -1;
		}
		return ans;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String board = scan.nextLine();
		String hand = scan.nextLine();
		System.out.println(solve(board,hand));
	}
}