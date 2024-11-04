class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}