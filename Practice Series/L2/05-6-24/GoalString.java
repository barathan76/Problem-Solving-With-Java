import java.util.Scanner;
class GoalString{


static boolean goalSearch(String s,String g){
int n = s.length();
int m = g.length();
char str[] = s.toCharArray();
char goal[] = g.toCharArray();
if(n!=m)
	return false;
if(s.equals(g)){
int freq[] = new int[26];
for(int i =0;i<n;i++){
int c = str[i] - 'a';
freq[c]++;
if(freq[c]>=2)	return true;
}
return false;
}else{

int index1= -1;
int index2 = -1;
for(int i =0;i<n;i++){
if(str[i]!=goal[i]){
	if(index1 == -1) index1 = i;
	else if(index2 == -1)	index2 = i;
	else return false;	
}
}
return (str[index1] == goal[index2] && str[index2] == goal[index1]);
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String goal = scan.nextLine();
System.out.println(goalSearch(str,goal));

}
}