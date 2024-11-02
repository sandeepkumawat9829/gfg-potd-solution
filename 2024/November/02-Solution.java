class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        Set<Integer>set=new HashSet<>();
        int left=0;
        for(int right=0;right<arr.length;right++){
            set.add(arr[right]);
            if(right-left==k){
                if(set.size()<k+1){
                    return true;
                }
                set.remove(arr[left]);
                left++;
            }
        }
        return false;
    }
}