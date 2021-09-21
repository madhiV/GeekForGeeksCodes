class Solution 
{ 
	static int maxCandy(int height[], int n) 
	{ 
	    int max=0,i,j;
	    i=0;
	    j=n-1;
	    while(i<j){
	        max=Math.max(max,Math.min(height[i],height[j])*(j-i-1));
	        if(height[i]<=height[j]){
	            i++;
	        }
	        else{
	            j--;
	        }
	    }
	    return max;
	}
}
