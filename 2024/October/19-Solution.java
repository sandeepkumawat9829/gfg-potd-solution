class Solution {

    String roundToNearest(String str) {
        // Complete the function
        StringBuilder ans=new StringBuilder(str);
        int n=str.length();
        if(str.charAt(n-1)<='5'){
            ans.setCharAt(n-1,'0');
            return ans.toString();
        }
        ans.setCharAt(n-1,'0');
        for(int i=n-2;i>=0;i--){
            if((char)(str.charAt(i)+1)>'9'){
                ans.setCharAt(i,'0');
            } 
            else{
                ans.setCharAt(i,(char)(str.charAt(i)+1));
                return ans.toString();
            }
        }
        ans.insert(0,'1');
        return ans.toString();
    }
}