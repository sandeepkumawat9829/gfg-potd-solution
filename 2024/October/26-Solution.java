class Solution {
    public static int count(Node head, int key) {
        // code here
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
}