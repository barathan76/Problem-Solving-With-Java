import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

class MergeAccounts{

static List<List<String>> accountsMerge(String accounts[][]) {
        Map<String, String> owner = new HashMap<>();    
        Map<String, String> parent = new HashMap<>();   
        Map<String, TreeSet<String>> uf = new HashMap<>();
       

        for(String[] account : accounts){
            for(int i = 1; i < account.length; i++){
                parent.put(account[i], account[i]); 
                owner.put(account[i], account[0]);  
            }
        }
      
        for(String[] account : accounts){
            String root = find(account[1], parent); 
            for(int i = 2; i < account.length; i++){
                parent.put(find(account[i], parent), root); 
            }
        }
        

        for(String[] account : accounts){
            String root = find(account[1], parent); 
            if(!uf.containsKey(root)) 
		uf.put(root, new TreeSet<String>());
            for(int i = 1; i < account.length; i++)
                uf.get(root).add(account[i]); 
        }
   
        List<List<String>> result = new ArrayList<>();
        for(String key : uf.keySet()){
            List<String> temp = new ArrayList<>();
            temp.add(owner.get(uf.get(key).first()));   
            temp.addAll(uf.get(key)); 
            result.add(temp);
        }
        return result;
    }
    static String find(String s, Map<String, String> map){
        if(!map.get(s).equals(s)){
            map.put(s, find(map.get(s), map));
        }
        return map.get(s);
    }

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
String arr[][] = new String[n][];
System.out.println("Input the row sizes of the 2d array");
for(int i=0;i<n;i++){
	int k =scan.nextInt();
	arr[i] = new String[k];
}
scan.nextLine();
for(int i =0;i<n;i++){
for(int j=0;j<arr[i].length;j++){
arr[i][j] = scan.nextLine();
}
}
List<List<String>> ans = accountsMerge(arr);
for(List<String> list : ans){
	for(String str: list)
		System.out.print(str+ " ");
	System.out.println();
}
}
}




/*
4
Input the row sizes of the 2d array
3
3
2
2
John
johnsmith@mail.com
john_network@mail.com
John
johnsmith@mail.com
john00@mail.com
Mary
mary@mail.com
John
johnnybravo@mail.com
*/