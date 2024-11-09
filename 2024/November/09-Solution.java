
class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l=arr.length;
        int rem=0;
        StringBuilder ans=new StringBuilder("");
        for(int i =l-1;i>=0;i-=2){
            if(i-1 >= 0){
                rem=rem+arr[i]+arr[i-1];
            }
            else{
                rem=rem+arr[i];
            }
            if(rem>0){
                ans.append(String.valueOf(rem%10));
            }
            rem /=10;
        }
        if(rem>0){
            ans.append(String.valueOf(rem%10));
        }
        return ans.reverse().toString();
    }
}
