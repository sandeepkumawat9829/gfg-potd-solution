class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n=arr.length;
        if(n==0){
            return null;
        }
        Node head=new Node(arr[0][0]);
        Node[] prevRow=new Node[n];
        prevRow[0]=head;
        Node current=head;
        for(int j=1;j<n;j++){
            current.right=new Node(arr[0][j]);
            current=current.right;
            prevRow[j]=current;
        }
        for(int i=1;i<n;i++){
            Node newRowHead=new Node(arr[i][0]);
            prevRow[0].down=newRowHead;
            prevRow[0]=newRowHead;
            current=newRowHead;
            for(int j=1;j<n;j++){
                current.right=new Node(arr[i][j]);
                prevRow[j].down=current.right;
                prevRow[j]=current.right;
                current=current.right;
            }
        }
        return head;
    }
}