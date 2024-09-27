class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        Deque<Integer>de=new LinkedList<>(); 
        for(int i=0;i<arr.length;i++){
            if(!de.isEmpty()&&de.peek()<i-k+1){
                de.poll();
            }
            while(!de.isEmpty()&&arr[de.peekLast()]<arr[i]){
                de.pollLast();
            }
            de.offer(i);
            if(i>=k-1){
                res.add(arr[de.peek()]);
            }
        }
        return res;
    }
}