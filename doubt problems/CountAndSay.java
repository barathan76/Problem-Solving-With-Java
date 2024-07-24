class CountAndSay {
    static String solve(String ans,int i,int n){
        if(i == n)
            return ans;
	System.out.println(ans);
        String subAns = "";
        for(int j =0;j<ans.length();j++){
            int diff = 1;
            for(int k = j+1;k<ans.length();k++){
                if(ans.charAt(j) == ans.charAt(k))
			diff++;
                else
			break;
                }           
            subAns+=diff+""+ans.charAt(j);
            j=j+diff-1;
        }
    return solve(subAns,i+1,n); 
    }

public static void main(String args[]){

System.out.println(solve("1",1,4));

}
}