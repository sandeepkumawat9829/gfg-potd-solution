
class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        Node prev=null;
        Node curr=head;
        Node nextt=head.next;
        while(nextt!=head){
            curr.next=prev;
            prev=curr;
            curr=nextt;
            nextt=nextt.next;
        }
        curr.next=prev;
        nextt.next=curr;
        return curr;
    }
    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
        Node temp=head;
        if(head.data==key){
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head.next;
        }
        while(temp.next.data!=key && temp.next!=head){
            temp=temp.next;
        }
        if(temp.next.data==key){
            temp.next=temp.next.next;
        }
        return head;
    }
}