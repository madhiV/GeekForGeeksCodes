class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int carry,multiplier,product,pos=0,start,sign=0;
        if(s1.charAt(0)=='-'){
            sign++;
            s1=s1.substring(1);
        }
        if(s2.charAt(0)=='-'){
            sign++;
            s2=s2.substring(1);
        }
        StringBuilder ans=new StringBuilder(""),temp=new StringBuilder("");
        for(int i=s2.length()-1;i>=0;i--){
            carry=0;
            multiplier=s2.charAt(i)-48;
            temp.setLength(0);
            for(int k=0;k<pos;k++){
                temp.append("0");
            }
            for(int j=s1.length()-1;j>=0;j--){
                product=multiplier*(s1.charAt(j)-48)+carry;
                temp.insert(0,product%10);
                carry=product/10;
            }
            if(carry!=0){
                temp.insert(0,carry);
            }
            pos++;
            add(temp,ans);
        }
        start=0;
        String answer=trimZero(ans.toString());
        if(!answer.equals("0") && sign==1){
            answer="-"+answer;
        }
        return answer;
    }
    public String trimZero(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)==48){
            i++;
        }
        if(i==s.length()){
            return  "0";
        }
        return  s.substring(i);
    }
    public void add(StringBuilder a,StringBuilder b){
        StringBuilder ans=new StringBuilder("");
        int i,j,carry=0,sum;
        i=a.length()-1;
        j=b.length()-1;
        while(i>=0 && j>=0){
            sum=carry+a.charAt(i)-48+b.charAt(j)-48;
            ans.insert(0,sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            sum=carry+a.charAt(i)-48;
            ans.insert(0,sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            sum=carry+b.charAt(j)-48;
            ans.insert(0,sum%10);
            carry=sum/10;
            j--;
        }
        if(carry!=0){
            ans.insert(0,carry);
        }
        b.setLength(0);
        b.append(ans);
    }
}
