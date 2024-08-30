import java.util.*;
class Dungeon{
      static int Amin;
      static int Mmin;
      static String str="";
      public static void main(String args[]){
            Amin=Integer.MAX_VALUE;
            Mmin=Integer.MAX_VALUE;
            str="";
            int n=5;
            int m=4;
            int Ai=4;
            int Aj=1;
            int Mi=1;
            int Mj=1;
            int Gi=1;
            int Gj=3;
            int Ti=4;
            int Tj=4;
            int dungeon[][]=new int[n][m];
            dungeon[4-1][2-1]=-1;
            dungeon[4-1][3-1]=-1;
            dungeon[2-1][1-1]=-1;
            boolean dp[][]=new boolean[n][m];
            findAdventureSortPath(dungeon,Ai-1,Aj-1,Gi-1,Gj-1,0,dp,"");
            findMonsterSortPath(dungeon,Mi-1,Mj-1,Gi-1,Gj-1,0,dp);
            
            if(Mmin<Amin){
                  Amin=Integer.MAX_VALUE;
                  Mmin=Integer.MAX_VALUE;
                  str="";
                  findAdventureSortPath(dungeon,Ai-1,Aj-1,Ti-1,Tj-1,0,dp,"");
                  findMonsterSortPath(dungeon,Mi-1,Mj-1,Ti-1,Tj-1,0,dp);
                  if(Mmin<Amin){
                  System.out.println("No Possible");
                  }
                  else{
                        int min=Amin;
                        Amin=Integer.MAX_VALUE;
                        String str1=""+str;
                        str="";
                        findAdventureSortPath(dungeon,Ti-1,Tj-1,Gi-1,Gj-1,0,dp,"");
                        if(Amin==Integer.MAX_VALUE){
                              System.out.println("No Possible");
                        }
                        else{
                              System.out.println("Possible "+(Amin+min));
                              System.out.println("Path is "+str1+str);
                        }
                  }
            }
            else{
                        System.out.println("Possible "+Amin);
                        System.out.println("Path is "+str);
            }
      }
      static void findAdventureSortPath(int dungeon[][],int i,int j,int Gi,int Gj,int count,boolean dp[][],String path){
            if(i<0||j<0||j>=dungeon[0].length||i>=dungeon.length||dungeon[i][j]==-1||dp[i][j]){
                  return;
            }
            if(i==Gi&&j==Gj){
                  if(count<Amin){
                        path+=i+","+j;
                        str=path;
                        Amin=count;
                  }
                  return;
            }
            if(count>=Amin){
                  return;
            }
            path+=+i+","+j+"->";
            dp[i][j]=true;
            findAdventureSortPath(dungeon,i+1,j,Gi,Gj,count+1,dp,path);
            findAdventureSortPath(dungeon,i-1,j,Gi,Gj,count+1,dp,path);
            findAdventureSortPath(dungeon,i,j+1,Gi,Gj,count+1,dp,path);
            findAdventureSortPath(dungeon,i,j-1,Gi,Gj,count+1,dp,path);
            
            dp[i][j]=false;
            
      }

	static void findMonsterSortPath(int dungeon[][],int i,int j,int Gi,int Gj,int count,boolean dp[][]){
            if(i<0||j<0||j>=dungeon[0].length||i>=dungeon.length||dp[i][j]){
                  return;
            }
            if(i==Gi&&j==Gj){
                  if(count<Mmin){
                        Mmin=count;
                  }
                  return;
            }
            if(count>=Mmin){
                  return;
            }
            dp[i][j]=true;
            findMonsterSortPath(dungeon,i+1,j,Gi,Gj,count+1,dp);
            findMonsterSortPath(dungeon,i-1,j,Gi,Gj,count+1,dp);
            findMonsterSortPath(dungeon,i,j+1,Gi,Gj,count+1,dp);
            findMonsterSortPath(dungeon,i,j-1,Gi,Gj,count+1,dp);
            dp[i][j]=false;
            
      }     
      
}