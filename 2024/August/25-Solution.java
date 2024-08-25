class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
        // int[] ycnt=new int[5];
        // for(int i=0;i<N;i++){
        //     if(y[i]<5){
        //         ycnt[y[i]]++;
        //     }
        // }
        // Arrays.sort(y);
        // long ans=0;
        // for(int X:x){
        //     if(X==0){
        //         continue;
        //     }
        //     if(X==1){
        //         ans=ans+ycnt[0];
        //         continue;
        //     }
        //     int idx=Arrays.binarySearch(y,X);
        //     if(idx<0){
        //         idx=-idx-1;
        //     }
        //     else{ 
        //     while(idx<N&& y[idx]==X){
        //         idx++;
        //      }
        //     }
        //     long count=N-idx;
        //     count=count+(ycnt[0]+ycnt[1]);
        //     if(X==2){
        //         count=count+(ycnt[3]+ycnt[4]);
        //     }
        //     if(X==3){
        //         count=count+ycnt[2];
        //     }

        //     ans=ans+count-1;
        // }
        // return ans;
        
        double[] a=new double[M];
        double[] b=new double[N];
        
        for(int i=0;i<M;i++){
            a[i]=Math.log(x[i])/x[i];
        }
        for(int i=0;i<N;i++){
            b[i]=Math.log(y[i])/y[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long ans=0;
        
        for(int i=0;i<N;i++){
            int ind=up(a,b[i]);
            if(ind!=M)
                ans+=(M-ind);
        }
        return ans;
    }
    
    private int up(double[] arr,double value){
        int low=0;
        int high=arr.length;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<=value){
                low=mid+1;
            } 
            else{
                high=mid;
            }
        }
        return low;
        
    }
}