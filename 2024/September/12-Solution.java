class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head;
        Node fast=head;
        if(head==null|| head.next==null){
            return head.data;
        }
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data; 
    }
}

