class Sol
{
    int countRev (String s)
    {
        int count=0,st=0;
        if(s.length()%2==1){
            return -1;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                st++;
            }
            else{
                if(st==0){
                    count++;
                    st++;
                }
                else{
                    st--;
                }
            }
        }
        count+=st/2;
        return count;
    }
}
