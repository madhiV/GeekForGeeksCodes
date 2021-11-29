class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    Stack<int[]> st=new Stack<>();
	    int[] ans=new int[n],p;
	    for(int i=0;i<n;i++){
	        while(!st.isEmpty() && arr[i]<st.peek()[0]){
	            p=st.pop();
	            ans[p[1]]=arr[i];
	        }
	        st.push(new int[]{arr[i],i});
	    }
	    while(!st.isEmpty()){
	        ans[st.pop()[1]]=-1;
	    }
	    return ans;
	} 
}
