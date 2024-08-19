class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        // Arrays.sort(arr);
        // return arr[k-1];
        //it is brute force approach...
        
        PriorityQueue<Integer>ans=new PriorityQueue<>();
        for(int i:arr){
            ans.add(i);
        }
        while(k!=1){
            k--;
            ans.poll();
        }
        return ans.peek();
    }
}