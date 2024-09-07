class Solution {
    long findNth(long n) {
        // code here
        long fact=1;
        long ans=0;
        while(n>0){
            ans+=fact*(n%9);
            n/=9;
            fact*=10;
        }
        return ans;
    }
}