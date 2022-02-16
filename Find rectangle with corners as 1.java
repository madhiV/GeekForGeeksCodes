
public class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{ 
	    int[][] dp=new int[matrix[0].length][matrix[0].length];
	    Set<Integer> set;
	    for(int i=0;i<matrix.length;i++){
	        set=new HashSet<>();
	        for(int j=0;j<matrix[0].length;j++){
	            if(matrix[i][j]==1){
	                for(int k:set){
	                    if(dp[k][j]==1){
	                        return true;
	                    }
	                    dp[k][j]=1;
	                }
	                set.add(j);
	            }
	        }
	    }
	    return false;
	}
}
