class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long>ans=new PriorityQueue<>();
        for(Long rope:arr){
            ans.add(rope);
        }
        long res=0;
        while(ans.size()>1){
            long c=ans.remove()+ans.remove();
            res+=c;
            ans.add(c);
        }
        return res;
    }
}