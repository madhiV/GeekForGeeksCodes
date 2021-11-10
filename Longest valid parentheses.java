class Solution{
    static int maxLength(String S){
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[S.length()];
        int max=0,p;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                if(st.size()>0){
                    p=st.pop();
                    arr[i]=2+arr[i-1];
                    if(p!=0){
                        arr[i]+=arr[p-1];
                    }
                    max=Math.max(max,arr[i]);
                }
                else{
                    while(!st.isEmpty()){
                        st.pop();
                    }
                }
            }
        }
        return max;
    }
}
