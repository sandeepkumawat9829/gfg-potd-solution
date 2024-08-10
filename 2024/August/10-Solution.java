class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head==null ||head.next==null ||k==0){
            return head;
        }
        Node curr=head;
        int len=1;
        
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        curr.next=head;
        for(int i=0;i<len-k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        
        return head;
    }
}