class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer>arr3=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arr3.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr3.add(arr2[i]);
            
        }
        Collections.sort(arr3);
        
        return arr3.get(k-1);
    }
}