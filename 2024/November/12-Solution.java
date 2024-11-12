class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int a=0;a<arr.length;a++){
         for(int i=arr[a][0];i<arr[a][1];i++){
            if(hs.contains(i)){
                return false;
             }
             else{
                 hs.add(i);
             }
         }
        }
        return true;
    }
}