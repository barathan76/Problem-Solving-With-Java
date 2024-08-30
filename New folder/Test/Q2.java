import java.util.Scanner;
class Q2{
	public static boolean solve(String str){
		int absent = 0;
		int late = 0;
		for(int i =0;i<str.length();i++){
			if(str.charAt(i) == 'A'){
				absent++;
			}
			else if(str.charAt(i) == 'L'){
			int j = i;
			while(j<str.length() && str.charAt(j) =='L') {
				j++;
			}	
			int diff = j-i;
			if(diff> late)
				late = diff;
			i = j-1;
			}
		}
		if(late>=3 || absent>=2)
			return false;
		return true;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(solve(str));
	}
}