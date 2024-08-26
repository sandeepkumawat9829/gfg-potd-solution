class Solution {
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int m=pattern.length();
        int n=str.length();
        boolean[][] ans=new boolean[m+1][n+1];
        ans[0][0]=true;

        for(int i=1;i<=m;i++){
            if(pattern.charAt(i-1)=='*'){
                ans[i][0]=ans[i-1][0];
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(pattern.charAt(i-1)=='?'|| pattern.charAt(i-1)== str.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                } 
                else if(pattern.charAt(i-1)=='*'){
                    ans[i][j]=ans[i-1][j]|| ans[i][j-1];
                }
            }
        }
        return ans[m][n]? 1:0;
    }
}