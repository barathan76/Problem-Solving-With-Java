import java.util.Scanner;
class MinEncodeString{
static String solve(String s) {
    String[][] dp = new String[s.length()][s.length()];
    
    for(int l=0;l<s.length();l++) {
        for(int i=0;i<s.length()-l;i++) {
            int j = i+l;
            String substr = s.substring(i, j+1);
   
            if(j - i < 4) {
                dp[i][j] = substr;
            } else {
                dp[i][j] = substr;
                
                for(int k = i; k<j;k++) {
                    if((dp[i][k] + dp[k+1][j]).length() < dp[i][j].length()){
                        dp[i][j] = dp[i][k] + dp[k+1][j];
                    }
                }
                
               
                for(int k=0;k<substr.length();k++) {
                    String repeatStr = substr.substring(0, k+1);
                    if(repeatStr != null 
                       && substr.length()%repeatStr.length() == 0 
                       && substr.replaceAll(repeatStr, "").length() == 0) {
                          String ss = substr.length()/repeatStr.length() + "[" + dp[i][i+k] + "]";
                          if(ss.length() < dp[i][j].length()) {
                            dp[i][j] = ss;
                          }
                     }
                }
            }
        }
    }
    
    return dp[0][s.length()-1];
  }

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}