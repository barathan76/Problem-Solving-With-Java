import java.util.Scanner;
class StringPermutation
{


static void permutate(String str,String ans,int index,int n){

if(index == n){
System.out.println(ans);
return;
}


for(int i =0;i<n;i++){
ans+=str.charAt(i);
permutate(str,ans,index+1,n);
ans = ans.substring(0,ans.length()-1);
}

}




public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();

permutate(str,"",0,str.length());
}




}