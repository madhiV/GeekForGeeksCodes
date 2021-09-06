class Solution{
    public String LargestEven(String S){
        StringBuilder sb=new StringBuilder("");
        int[] arr=new int[10];
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)-48]++;
        }
        for(int i=0;i<10;i+=2){
            if(arr[i]!=0){
                sb.append(i);
                arr[i]--;
                break;
            }
        }
        for(int i=0;i<10;i++){
            for(int j=arr[i];j>0;j--){
                sb.insert(0,i);
            }
        }
        return sb.toString();
    }
}
