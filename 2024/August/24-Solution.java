class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n=wt.length;
        int[] ans=new int[W+1];
        for(int i=0;i<n;i++){
            for(int j=W;j>=wt[i];j--){
                ans[j]=Math.max(ans[j],val[i]+ans[j-wt[i]]);
            }
        }
        
        return ans[W];
    }
}