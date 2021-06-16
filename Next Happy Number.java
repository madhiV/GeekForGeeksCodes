
class Solution{

    static int nextHappy(int N){
        HashSet<Integer> set=new HashSet<>();
        Integer arr[]={52,29,85,9,81,64,65,61,37,25,29,89,36,45,41,17,50,25,2,4,16,58,37,89,145,42,20,30};
        set.addAll(Arrays.asList(arr));
        int t;
        for(int i=N+1;i<N+1000;i++){
            t=i;
            for(int j=0;j<30;j++){
                t=form(t);
                //System.out.println(t);
                if(set.contains(t)){
                    break;
                }
                if(j==29){
                    return i;
                }
            }
        }
        return -1;
    }
    static int form(int a){
        int temp=0;
        while(a!=0){
            temp+=(a%10)*(a%10);
            a/=10;
        }
        return temp;
    }
}
