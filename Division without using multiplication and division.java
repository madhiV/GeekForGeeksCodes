
class Solution
{
    public static long divide(long a, long b)
    {
        long count=0;
        long[] arr=new long[33];
        int flag=0,i;
        if(a<0){
            flag=1;
            a=a-a-a;
        }
        if(b<0){
            flag++;
            b=b-b-b;
        }
        if(a==1){
            if(b==1){
                if(flag%2==0){
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if(b==1){
            if(flag%2==0){
                return a;
            }
            return -a;
        }
       
        if(a<b){
            return 0;
        }
       
        arr[0]=b;
        i=1;
        count=1;
        while(arr[i-1]+arr[i-1]<=a){
            count=(long)(Math.pow(2,i));
            arr[i]=arr[i-1]+arr[i-1];
            b=arr[i];
            i++;
        }
        i--;
        while(i>=0){
            if(b+arr[i]<=a){
                b+=arr[i];
                count+=(long)(Math.pow(2,i));
            }
            i--;
        }
        if(flag==1){
            return -count;
        }
        return count;
    }
}
