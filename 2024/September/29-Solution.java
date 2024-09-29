class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            while(n>0){
                n=n-k;
                count++;
            }
            if(n<=k && n>0){
                count++;
            }
        }
        return count;
    }
}
