[A[B
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        int R=matrix.length;    
        int C=matrix[0].length; 
        int top=0;
        int left=0;
        int bottom=R-1;
        int right=C-1;
        ArrayList<Integer>ans=new ArrayList<>();
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++)
             ans.add(matrix[top][i]);
             top++;
             
             for(int i=top;i<=bottom;i++)
             ans.add(matrix[i][right]);
             right--;
             
             if(top<=bottom){
                 for(int i=right;i>=left;i--)
                 ans.add(matrix[bottom][i]);
                 bottom--;
             }
             
             if(left<=right){
                 for(int i=bottom;i>=top;i--)
                 ans.add(matrix[i][left]);
                 left++;
             }
        }
        return ans;
    }
}
