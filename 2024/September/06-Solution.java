class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            max=Math.max(max,curr);
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
}
