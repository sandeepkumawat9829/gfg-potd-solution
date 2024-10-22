class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer,Integer>em=new HashMap<>();
        int count=0;
        int sum=0;
        em.put(0,1);
        for(int i:arr){
            if(i==x){
                sum++;
            } 
            else if(i==y){
                sum--;
            }
            count+=em.getOrDefault(sum,0);
            em.put(sum,em.getOrDefault(sum,0)+1);
        }
        return count;
    }
}