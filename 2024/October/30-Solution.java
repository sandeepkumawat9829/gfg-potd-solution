class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]+k)){
                count = count + hm.get(arr[i]+k);
            }
        }
        return count;
    }
}[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B