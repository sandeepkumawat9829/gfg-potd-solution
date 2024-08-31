class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        int[] min=new int[n];
        int[] max=new int[n];
        min[0]=arr[0];
        max[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
            min[i]=Math.min(arr[i],min[i-1]);
        for(int i=n-2;i>=0;i--)
            max[i]=Math.max(arr[i],max[i+1]);
        
        for(int i=1;i<n-1;i++){
            if(min[i-1]<arr[i] && max[i+1]>arr[i]){
                list.add(min[i-1]);
                list.add(arr[i]);
                list.add(max[i+1]);
                break;
            }
        }
        
        return list;
    }
}