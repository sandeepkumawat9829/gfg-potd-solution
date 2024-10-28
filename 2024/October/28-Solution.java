
class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int num : arr){
            if(set.add(num)){ 
                ans.add(num);
            }
        }
        return ans;
    }
}
