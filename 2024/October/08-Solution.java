class Solution {
    // function should insert the data to the front of the list
    static Node insert(Node head, int data) {
        // Code Here.
        Node node = new Node(data);
        node.npx = head;
        return node;
    }
    

    // function to print the linked list
    static ArrayList<Integer> getList(Node head) {
        // Code Here.
        ArrayList<Integer> al = new ArrayList<>();
        while(head != null) {
            al.add(head.data);
            head = head.npx;
        }
        return al;
    }
}