import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class LargeGroup{
static List<Integer[]> solve(String str){
List<Integer[]> list = new ArrayList<Integer[]>();
int i =0;
int j = 0;
int n = str.length();
while(i<n && j<n){
	if(str.charAt(i) == str.charAt(j))
		j++;
	else{
		if(j-i-1>=2)
			list.add(new Integer[]{i,j-1});
		i+= (j-i);
}	
}

return list;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
List<Integer[]> ans = solve(str);
System.out.print("[");
for(int i =0;i<ans.size();i++){
	System.out.print("["+ans.get(i)[0]+","+ans.get(i)[1]+"]");
	if(i!=ans.size()-1)
		System.out.print(",");
}
	
System.out.print("]");
System.out.println();
}
}