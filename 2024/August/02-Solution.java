class Solution {
    public int editDistance(String str1, String str2) {
        //return call(str1,str2,str1.length(),str2.length());
        
         int n=str1.length();
         int m=str2.length();
         int ans[][]=new int[n+1][m+1];
         
          for(int i=0;i<n+1;i++){
              for(int j=0;j<m+1;j++){
                  if(i==0){
                      ans[i][j]=j;
                  }
                  if(j==0){
                      ans[i][j] = i;
                  }
              }
          }
           
          for(int i=1;i<n+1;i++){
              for(int j=1;j<m+1;j++){
                  if(str1.charAt(i-1)== str2.charAt(j-1)){
                       ans[i][j]=ans[i-1][j-1];
                  }
                  else{
                       ans[i][j]=Math.min(ans[i-1][j],Math.min(ans[i][j-1],ans[i-1][j-1])) + 1;
                  }
              }
          }
          return ans[n][m];
    }

    // private int call(String str1,String str2,int m,int n) {
    //     if(m==0){
    //         return n; 
    //     }
    //     if(n==0){
    //         return m; 
    //     }
    //     if(str1.charAt(m-1)==str2.charAt(n-1)){
    //         return call(str1,str2,m-1,n-1);
    //     }
    //     int insert=call(str1,str2,m,n-1);    
    //     int remove=call(str1,str2,m-1,n);    
    //     int replace=call(str1,str2,m-1,n-1);  
    //     return 1+Math.min(insert,Math.min(remove,replace));
    // }
    
    //give runtime error..........
}