class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
            if(arr[i]!=0){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        int j=ans.size();
        while(j<arr.length){
            ans.add(0);
            j++;
        }
        return ans;
    }
}