
// User function Template for Java
class Solution {
    public int celebrity(int mat[][]) {
        int n=mat.length;
        int cele=0;
        for(int i=1;i<n;i++){
            if(mat[cele][i]==1){
                cele=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=cele&& (mat[cele][i]==1|| mat[i][cele]==0)){
                return -1;
            }
        }

        return cele;
    }
}[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[C