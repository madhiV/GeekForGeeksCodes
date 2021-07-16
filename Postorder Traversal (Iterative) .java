class Tree {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Node> s=new Stack<>();
        s.push(node);
        Node p;
        while(!s.isEmpty()){
            p=s.pop();
            al.add(0,p.data);
            if(p.left!=null){
                s.push(p.left);
            }
            if(p.right!=null){
                s.push(p.right);
            }
        }
        return al;
    }
}
