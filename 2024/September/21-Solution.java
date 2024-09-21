class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        if(head==null) return null;
        Node curr=head;
        while(curr!=null){
            Node p=new Node(curr.data);
            p.next=curr.next;
            curr.next=p;
            curr=p.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        Node clonedHead=head.next;
        curr=head;
        Node clone=clonedHead;
        while(clone.next!=null){
            curr.next=curr.next.next;
            clone.next=clone.next.next;
            
            curr=curr.next;
            clone=clone.next;
        }
        curr.next=null;
        clone.next=null;
        
        return clonedHead;
        
    }
}