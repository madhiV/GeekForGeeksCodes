class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            new Comparator<int[]>(){
                @Override 
                public int compare(int[] a,int[] b){
                    if(a[2]>b[2]){
                        return 1;
                    }
                    return -1;
                }
            }
        );
        int[] p;
        int[][] dir=new int[][]{{1,0},{0,1}};
        int x,y;
        pq.add(new int[]{0,0,mat[0][0]});
        while(!pq.isEmpty()){
            p=pq.poll();
            if(k==1){
                return p[2];
            }
            k--;
            for(int[] z:dir){
                x=p[0]+z[0];
                y=p[1]+z[1];
                if(x==mat.length || y==mat[0].length || mat[x][y]==-1){
                    continue;
                }
                pq.add(new int[]{x,y,mat[x][y]});
                mat[x][y]=-1;
            }
        }
        return -1;
    }
}
