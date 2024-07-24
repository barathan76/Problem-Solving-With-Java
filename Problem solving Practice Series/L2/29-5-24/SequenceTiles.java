import java.util.Scanner;
import java.util.Arrays;
class SequenceTiles{
static int solve(String str){
char c[] = str.toCharArray();
Arrays.sort(c);
int count[] = new int[1];
recursive(c,new boolean[c.length],count);
return count[0]-1;
}
static void recursive(char c[],boolean visited[],int count[]){
count[0]+=1;
for(int i =0;i<c.length;i++){
if(visited[i] || i>0 && c[i] == c[i-1] && !visited[i-1])
	continue;
System.out.print(c[i]);
visited[i] = true;
recursive(c,visited,count);
visited[i] = false;
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}