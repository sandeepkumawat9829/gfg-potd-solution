class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int xor=0;
        int n=arr.length;
        for(int m:arr){
            xor^=m;
        }
        if(xor!=0){
            return 0;
        }
        return (int)Math.pow(2,n-1)-1;
    }
}