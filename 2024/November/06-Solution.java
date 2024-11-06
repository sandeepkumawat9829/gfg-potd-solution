class Solution {
    static int sum = 0;
    static void path(Node root,int num){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            num = num*10+root.data;
            sum += num;
            return;
        }
        num = num*10+root.data;
        path(root.left,num);
        path(root.right,num);
    }
    public static int treePathsSum(Node root) {
        // add code here.
        sum=0;
        path(root,0);
        return sum;
    }
}