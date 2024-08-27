class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        for(int i=1;i<n;i++){
            int j=i-1;
            int num=0;
            while(j>=0){
                if(arr[j]<arr[i]){
                    num=arr[j];
                    break;
            }
                j--;
        }
            left[i]=num;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    right[i]=arr[j];
                    break;
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            int abs=Math.abs(left[i]-right[i]);
            max=Math.max(max, abs);
        }
        return max;
    }
}