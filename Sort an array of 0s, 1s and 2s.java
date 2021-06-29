class Solution
{
    public static void sort012(int a[], int n)
    {
        int count1,count2,count0;
        count0=count1=count2=0;
        int i=0,j=0;
        for(;i<n;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        i=0;
        for(;i<n && j<count0;i++,j++){
            a[i]=0;
        }
        for(j=0;i<n && j<count1;i++,j++){
            a[i]=1;
        }
        for(j=0;i<n && j<count2;i++,j++){
            a[i]=2;
        }
    }
}
