class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count=0;
        int i=0;
        while(i<arr.size()){
            if(arr.get(i)!=i+1){
                int temp=arr.get(i)-1;
                int flag=arr.get(i);
                arr.set(i,arr.get(temp));
                arr.set(temp,flag);
                count++;
            }
            else{
                i++;
            }
        }
        if(count==2 || count==0){
            return true;
        }
        return false;
    }
}