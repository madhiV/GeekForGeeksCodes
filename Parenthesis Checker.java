class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char k;
        int r,s,c;
        r=s=c=0;
        for(int i=0;i<x.length();i++){
            k=x.charAt(i);
            if(k=='['){
                s++;
            }
            else if(k==']'){
                s--;
                if(s<0){
                    return false;
                }
            }
            else if(k=='('){
                r++;
            }
            else if(k==')'){
                r--;
                if(r<0){
                    return false;
                }
            }
            else if(k=='{'){
                c++;
            }
            else if(k=='}'){
                c--;
                if(c<0){
                    return false;
                }
            }
        }
        if(c==r && r==s && s==0){
            return true;
        }
        return false;
    }
}
