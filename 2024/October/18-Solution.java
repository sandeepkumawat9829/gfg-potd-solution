class Solution {
    int getSingle(int arr[]) {
        // code here
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            count.put(arr[i],count.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>ele:count.entrySet()){
            int key=ele.getKey();
            int value=ele.getValue();
            if(value%2!=0){
                return key;
            }
        }
        return -1;
    }
}