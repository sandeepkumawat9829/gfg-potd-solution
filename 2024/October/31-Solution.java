class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newNode = new Node(x);

        if (head == null || head.data >= x) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            newNode.prev = null;
            return newNode;
        }

        Node current = head;

        while (current.next != null && current.next.data < x) {
            current = current.next;
        }


        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
        } else {

            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        return head; 
    }
}[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C
[A[B[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C
[A//Happy Diwali[C[C2024[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B