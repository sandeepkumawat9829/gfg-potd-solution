class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count%2==0){
        return true;   
        }
        return false;
    }
}
