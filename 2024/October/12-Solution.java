class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int n=arr.length;
        if(n<2){
            return -1;
        }
        int ans=arr[0]+arr[1];
        for(int i =1;i<n-1;i++){
            ans=Math.max(ans,arr[i]+arr[i+1]);
        }
        return ans;
    }
}
