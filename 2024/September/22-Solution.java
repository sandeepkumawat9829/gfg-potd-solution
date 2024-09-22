class Solution {
    int lps(String str) {
        // code here
        int []ans=new int[str.length()];
        int len=0;
        int i=1;
        while(i<str.length()){
            if(str.charAt(len)==str.charAt(i)){
                len++;
                ans[i]=len;
                i++;
            }
            else{
               if(len>0){
                   len=ans[len-1];
               }
               else{
                   i++;
               }
            }
        }
        return len;
    }
}