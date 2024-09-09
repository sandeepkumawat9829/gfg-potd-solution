class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.size()-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(ArrayList<Integer>arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}