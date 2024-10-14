class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
}