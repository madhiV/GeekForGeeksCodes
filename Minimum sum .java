class Solution {
    String solve(int[] arr, int n) {
        int greater,a,b,i;
        Arrays.sort(arr);
        StringBuilder s1=new StringBuilder(""),s2=new StringBuilder("");
        greater=0;
        i=n-1;
        while(i>=0){
            a=arr[i];
            i--;
            if(i==-1){
                if(greater==0){
                    s1.insert(0,a);
                }
                else{
                    s1.insert(0,a);
                }
            }
            else{
                b=arr[i];
                i--;
                if(greater==0){
                    if(a<b){
                        greater=-1;
                    }
                    s1.insert(0,a);
                    s2.insert(0,b);
                }
                else{
                    s1.insert(0,b);
                    s2.insert(0,a);
                }
            }
        }
        return sumUp(s1,s2);
    }
    public String sumUp(StringBuilder s1,StringBuilder s2){
        StringBuilder ans=new StringBuilder("");
        int carry=0,sum,i;
        //adding extra zeros at first
        while(s1.length()<s2.length()){
            s1.insert(0,0);
        }
        while(s2.length()<s1.length()){
            s2.insert(0,0);
        }
        //sum up
        i=s1.length()-1;
        while(i>=0){
            sum=carry+s1.charAt(i)-48+s2.charAt(i)-48;
            ans.insert(0,sum%10);
            carry=sum/10;
            i--;
        }
        if(carry!=0){
            ans.insert(0,carry);
        }
        i=0;
        while(i!=ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        return ans.toString().substring(i);
    }
}
