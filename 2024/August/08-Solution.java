class Solution {
    boolean isSumTree(Node root) {
        int ls=sum(root.left);
        int rs=sum(root.right);
        if(root==null){
             return true;
         }
        if(root.left==null&& root.right==null){
            return true;
        }
        
        if(root.data==ls+rs &&isSumTree(root.left) &&isSumTree(root.right)){
            return true;
        }
        return false;
    }
    int sum(Node node){
        if (node == null){
            return 0;
        }
        return node.data+sum(node.left)+sum(node.right);
    }
}