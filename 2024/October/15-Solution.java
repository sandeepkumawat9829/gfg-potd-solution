class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        HashMap<Integer,Integer>res=new HashMap<>();
        int sum=0;
        int cnt=0;
        res.put(0,1);
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int temp=sum-tar;
            if(res.containsKey(temp))cnt+=res.get(temp);
            res.put(sum,res.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}