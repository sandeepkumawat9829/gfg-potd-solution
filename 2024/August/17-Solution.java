class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
         long[] ans=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            long pro=1;
            int j=0;
            while(j<i){
                pro=pro*nums[j];
                j++;
            }
            j=i+1;
            while(j<nums.length){
                pro=pro*nums[j];
                j++;
            }
            ans[i]=pro;
        }
        return ans;
    }
}