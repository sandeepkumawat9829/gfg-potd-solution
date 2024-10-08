class Solution{
    public static class Pair{
        char ch;
        int idx;
        Pair(char ch,int idx){
            this.ch=ch;
            this.idx=idx;
        }
    }
    static int maxLength(String S){
    Stack<Pair> st=new Stack<>();
    for(int i=0;i<S.length();i++){
        char c=S.charAt(i);
        if(c=='('){
            st.push(new Pair(c,i));
        }
        else{
            if(st.size()==0){
                st.push(new Pair(c,i));
            }
           else if(st.peek().ch=='('){
                st.pop();
            }
           else{
                st.push(new Pair(c,i));
            }
        }
    }
    if(st.size()==0){
        return S.length();
    }
    int ans=0;
    if(st.size()!=0){
    ans=Math.max(S.length()-1-st.peek().idx,ans);
    }
    while(st.size()>1){
       Pair n=st.pop();
       Pair p=st.pop();
       ans=Math.max(ans,n.idx-p.idx-1);
       st.push(p);
    }
    ans=Math.max(ans,st.pop().idx);
    return ans;
    
    }
}