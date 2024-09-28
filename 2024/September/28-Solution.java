class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=0;
        for(int i=1;i<n;i++){
           ans[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(i+j<n){
                    ans[i+j]=Math.min(ans[i+j],ans[i]+Math.abs(arr[i]-arr[i+j]));
                }
            }
        }
        return ans[n-1];
    }
}
