class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int j=n;
        for(int i=0; i<n/2; i++){
            arr[j-1]=arr[j-1]+arr[i]-(arr[i]=arr[j-1]);
            j=j-1;
        }
    }
}