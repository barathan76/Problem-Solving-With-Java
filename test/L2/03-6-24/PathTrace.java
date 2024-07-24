import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class PathTrace{

static boolean solve(String str,int tx,int ty,int index,int n,int x[],int y[]){


if(index<n){
char c  = str.charAt(index);

switch(c){
case 'N':
	ty++;break;
case 'E':
	tx++;break;
case 'S':
	ty--;break;
case 'W':
	tx--;break;
}
for(int i =0;i<n;i++){
if(x[i] == tx && y[i] == ty)
	return true;
}
x[index] = tx;
y[index] = ty;
return solve(str,tx,ty,index+1,n,x,y);
}
return false;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
int x[] = new int[str.length()];
int y[] = new int[str.length()];
for(int i =0;i<str.length();i++){
x[i] = 0;
y[i] = 0;
}
System.out.println(solve(str,0,0,0,str.length(),x,y));
}
}