
class Solution {
    public String excelColumn(int N){
        public String excelColumn(int N){
        StringBuilder sb=new StringBuilder("");
        int temp;
        while(N>0){
            temp=N%26;
            if(temp==0){
                sb.insert(0,'Z');
                N-=26;
            }
            else{
                sb.insert(0,(char)(temp+64));
                N-=temp;
            }
            N/=26;
        }
        return sb.toString();
    }
}
