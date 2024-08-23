class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
    ArrayList<Integer> res=new ArrayList<>();
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0;i<size;i++){
            Node curr=queue.poll();
            if(i==0){
                res.add(curr.data);
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }
    
    return res;
    }
}