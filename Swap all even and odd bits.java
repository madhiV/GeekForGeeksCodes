class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    int temp1,temp2,ans=0,i=1;
	    while(n!=0){
	        temp1=n%2;
	        n=n>>1;
	        temp2=n%2;
	        n=n>>1;
	        ans+=(temp2*i);
	        i*=2;
	        ans+=(temp1*i);
	        i*=2;
	    }
	    return ans;
	}
    
}
