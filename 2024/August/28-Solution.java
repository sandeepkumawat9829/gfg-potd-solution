class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(
            (a, b)->freq.get(a)==freq.get(b)?a-b:freq.get(b)-freq.get(a)
        );
        for(int num:freq.keySet()){
            pq.offer(num);
        }
        ArrayList<Integer>res=new ArrayList<>();
        while(!pq.isEmpty()){
            int num=pq.poll();
            int freqs=freq.get(num);
            for(int i=0;i<freqs;i++){
                res.add(num);
            }
        }
        return res;
    }
}