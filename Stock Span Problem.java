class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<int[]> st=new Stack<>();
        int[] p;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()[0]<price[i]){
                while(!st.isEmpty() && st.peek()[0]<price[i]){
                    p=st.pop();
                    ans[p[1]]=p[1]-i;
                }
            }
            st.push(new int[]{price[i],i});
        }
        while(!st.isEmpty()){
            p=st.pop();
            ans[p[1]]=p[1]+1;
        }
        return ans;
    }
    
}
