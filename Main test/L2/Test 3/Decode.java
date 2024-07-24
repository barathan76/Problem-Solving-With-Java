/*5:37 - 6:07*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Decode{
static String solve(String s,int i[]) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String temp = "";
        while (i[0] < s.length()) {
            char c = s.charAt(i[0]);
            i[0]++;
            if (c == '[') {
                temp = solve(s,i);
                int j = 0;
                while (j < count) {
                    sb.append(temp);
                    j++;
                }
                count = 0;
            } else if (c == ']')    break;
            else if (Character.isAlphabetic(c))    sb.append(c);
            else    count = count * 10 + c - '0';
   }
  return sb.toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
System.out.println(solve(s,new int[1]));
}
}