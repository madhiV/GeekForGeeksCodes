class Solution
{
    static int majorityElement(int a[], int size)
    {
        int max=a[0],count=1;
        for(int i=1;i<size;i++){
            if(a[i]==max){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                max=a[i];
            }
        }
        count=0;
        for(int i=0;i<size;i++){
            if(a[i]==max){
                count++;
            }
        }
        if(count>size/2){
            return max;
        }
        return -1;
    }
