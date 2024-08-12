class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int [] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        Arrays.sort(arr3);
        int mid1=arr3[arr3.length/2];
        int mid2=arr3[(arr3.length/2)-1];
        return mid1+mid2;
    }
}