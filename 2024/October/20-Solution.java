class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        if(head==null|| head.next==null|| k==0){
            return head;
        }
        DLLNode temp=head;
        while(temp.next!=null){
          int i=0;
          DLLNode temp2=temp.next;
          DLLNode min=temp;
          while(i<k&& temp2!=null){
              if(temp2.data<min.data){
                  min=temp2;
              }
              temp2=temp2.next;
              i++;
          }
          int val=temp.data;
          temp.data=min.data;
          min.data=val;
          temp=temp.next;
        }
        return head;
    }
}