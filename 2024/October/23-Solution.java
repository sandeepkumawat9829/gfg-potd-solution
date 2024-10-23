class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node temp=head;
        int k = 0;
        int sum = 0;
        Node temp2 = head;
        while(temp != null && k < n){
            sum += temp.data;
            k++;
            temp = temp.next;
        }
    
        while(temp != null){
            sum -= temp2.data;
            sum += temp.data;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return sum;
    }
}