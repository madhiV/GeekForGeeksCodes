class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int x,y,size,color=image[sr][sc];
        int[] p;
        int[][] dir=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=-1;
        while(!q.isEmpty()){
            size=q.size();
            while(size-->0){
                p=q.poll();
                for(int[] k:dir){
                    x=p[0]+k[0];
                    y=p[1]+k[1];
                    if(x==-1 || y==-1 || x==image.length || y==image[0].length ||  image[x][y]!=color){
                        continue;
                    }
                    image[x][y]=-1;
                    q.add(new int[]{x,y});
                }
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==-1){
                    image[i][j]=newColor;
                }
            }
        }
        return image;
    }
}
