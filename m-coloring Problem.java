class solve 
{
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C) 
    {
        if(C>G.length){
            return true;
        }
        if(i==G.length){
            return true;
        }
        int prev=color[i];
        for(int k=1;k<=C;k++){
            color[i]=k;
            if(!hasSameColor(G,color) && graphColoring(G,color,i+1,C)){
                return true;
            }
            color[i]=prev;
        }
        return false;
    }
    public static boolean hasSameColor(List<Integer>[] G,int[] color){
        for(int i=0;i<G.length;i++){
            for(int k:G[i]){
                if(color[k]!=0 && color[k]==color[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
