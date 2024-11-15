class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        HashSet<Integer>hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        if(hs.size()==1){
            return -1;
        }
         ArrayList<Integer>list=new ArrayList<Integer>(hs); 
         Collections.sort(list);
         return list.get(list.size()-2);
    }
}