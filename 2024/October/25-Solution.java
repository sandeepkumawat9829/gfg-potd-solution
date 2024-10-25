class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
            ans.add(arr[j]);
            }
            else{
             ans.add(arr[j]);
             ans.add(arr[i]);
            }
            i++;
            j--;
        }
        return ans;
    }
}
