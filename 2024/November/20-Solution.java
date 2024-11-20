class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            else{
                if(c>(nums.length/3)){
                    list.add(nums[i]);
                    c=1;
                }
                c=1;
            }
        }
        if(c>(nums.length/3)){
           list.add(nums[nums.length-1]);
           c=1;
        }
        return list;
    }
}