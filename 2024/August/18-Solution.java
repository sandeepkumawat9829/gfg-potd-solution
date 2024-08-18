class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            sum1=sum1-arr[i];
            sum2=sum2+arr[i];
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }
}