class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    int right,left,up,down,count;
	    up=count=0;
	    right=m-1;
	    left=0;
	    down=n-1;
	    
	    while(getTrue()){
	        //Right...
	        for(int i=up,j=left;j<=right;j++){
	            count++;
	            if(count==k){
	                return a[i][j];
	            }
	        }
	        up++;
	        //Down...
	        for(int i=up,j=right;i<=down;i++){
	            count++;
	            if(count==k){
	                return a[i][j];
	            }
	        }
	        right--;
	        //left...
	        for(int i=down,j=right;j>=left;j--){
	            count++;
	            if(count==k){
	                return a[i][j];
	            }
	        }
	        down--;
	        for(int i=down,j=left;i>=up;i--){
	            count++;
	            if(count==k){
	                return a[i][j];
	            }
	        }
	        left++;
	    }
	    return -1;
	}
	public boolean getTrue(){
	    return true;
	}
}
