
class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
        for(int i=0;i<s2.length();i++){          
            if(!s1.contains(Character.toString(s2.charAt(i)))){
            return -1;}
        }
        String c ="";
        int count =0;
        while(c.length()<=2*s2.length()){
            c+=s1;
            count++;
            if(c.contains(s2)){
                return count;
            }
        }
        return -1;
    }
};