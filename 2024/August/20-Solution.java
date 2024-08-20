class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int res;
    public static int minTime(Node root, int target) {
        // Your code goes here
        res=0;
        solve(root,target);
        return res;
    }
    public static int[] solve(Node root, int target){
        if(root==null){ 
            return new int[]{-1,0};
        }
        
        int[] left=solve(root.left,target);
        int[] right=solve(root.right,target);
        if(root.data==target){
            res=Math.max(res,Math.max(left[1],right[1]));
            return new int[]{1,1};
        }
        else if(left[0]!=-1){
            res=Math.max(res,right[1]+left[1]);
            left[1]++;
            return left;
        }
        else if(right[0]!=-1){
            res=Math.max(res,right[1]+left[1]);
            right[1]++;
            return right;
        }
        else{
            return new int[]{-1,Math.max(left[1],right[1])+1};
        }
    }
}