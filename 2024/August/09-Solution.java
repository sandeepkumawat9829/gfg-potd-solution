class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        int mod=1000000007;
        long  sum=0;
        for(int i=0;i<arr.length;i++){
            sum=(sum+(long)arr[i]*i)%mod;
        }
        return (int)sum;
    }
}