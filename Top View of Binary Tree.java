class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Map<Integer,Integer> valueToLevel=new HashMap<>();
        Queue<Object[]> nodesWithDFR=new LinkedList<>();
        int minDFR=Integer.MAX_VALUE,maxDFR=Integer.MIN_VALUE;
        //DFR=distance from root
        //Add root node 
        nodesWithDFR.add(new Object[]{root,0});
        while(!nodesWithDFR.isEmpty()){
            int size=nodesWithDFR.size();
            while(size-->0){
                //Poll the entry
                Object[] nodeWithDFR=nodesWithDFR.poll();
                Node node=(Node)nodeWithDFR[0];
                int DFR=(int)nodeWithDFR[1];
                //Recompute minDFR and maxDFR
                minDFR=Math.min(minDFR,DFR);
                maxDFR=Math.max(maxDFR,DFR);
                //Store node if first visited DFR
                if(!valueToLevel.containsKey(DFR)){
                    valueToLevel.put(DFR,node.data);
                }
                //Add left and right children
                if(node.left!=null){
                    nodesWithDFR.add(new Object[]{node.left,DFR-1});
                }
                if(node.right!=null){
                    nodesWithDFR.add(new Object[]{node.right,DFR+1});
                }
            }
        }
        ArrayList<Integer> topViewList=new ArrayList<>();
        for(int currDFR=minDFR;currDFR<=maxDFR;currDFR++){
            topViewList.add(valueToLevel.get(currDFR));
        }
        return topViewList;
    }
}
