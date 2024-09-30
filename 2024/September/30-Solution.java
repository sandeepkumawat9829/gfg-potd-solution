class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void inorder(Node root,List<Integer> L){
        if(root!=null){
            inorder(root.left,L);
            L.add(root.data);
            inorder(root.right,L);
        }
    }
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> L1=new ArrayList<>();
        List<Integer> L2=new ArrayList<>();
        inorder(root1,L1);
        inorder(root2,L2);
        List<Integer>ans=new ArrayList<>();
        int n=L1.size();
        int m=L2.size();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(L1.get(i)<L2.get(j)){
                ans.add(L1.get(i++));
            }
            else{
                ans.add(L2.get(j++));
            }
        }
        while(i<n){
            ans.add(L1.get(i++));
        }
        while(j<m){
            ans.add(L2.get(j++));
        }
        return ans;
    }
}
