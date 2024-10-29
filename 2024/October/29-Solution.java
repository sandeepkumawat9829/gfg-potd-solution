class GfG {
    public static Node partition(Node node){
        Node t = node.next;
        Node pivot = node;
        Node start = node;
        
        while(t!=null){
            if(t.data<pivot.data){
                start = start.next;
                int tmp = t.data;
                t.data = start.data;
                start.data = tmp;
            }
            t=t.next;
        }
        int tmp = start.data;
        start.data = pivot.data;
        pivot.data = tmp;
        
        return start;
    }
    public static Node quickSort(Node node) {
        // Your code here
        if(node==null || node.next==null){
            return node;
        }
        Node part = partition(node);
        Node tmp = part.next;
        part.next = null;
        quickSort(node);
        quickSort(tmp);
        part.next = tmp;
        return node;
    }
}