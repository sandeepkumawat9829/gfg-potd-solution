class Solution {
    static int minJumps(int[] arr) {
        // your code here
        if(arr[0]==0){
            return -1;
        }
        int m=arr[0];
        int place=arr[0];
        int move=1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(i==n-1){
                return move;
            }
            place=Math.max(place,i+arr[i]);
            m--;
            if(m==0){
                move++;
                if(i>=place){
                    return -1;
                }
                m=place-i;
            }
        }
        return -1;
    }
}