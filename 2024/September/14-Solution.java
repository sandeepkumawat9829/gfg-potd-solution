class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
       List<Integer> pos=new ArrayList<>();
       List<Integer> neg=new ArrayList<>();
       for(int n:arr){
           if(n>=0){
            pos.add(n);
           }
           else{ 
                neg.add(n);
           }
       }
       int i=0;
       int k=0;
       while(i<pos.size()&&i<neg.size()){
           arr.set(k ,pos.get(i));
           arr.set(k+1,neg.get(i));
           i++;
           k+=2;
       }
       while(i<pos.size()){
         arr.set(k,pos.get(i));
         k++;
         i++;
       }
       while(i<neg.size()){
         arr.set(k,neg.get(i));
         k++;
         i++;
       }
    }
}