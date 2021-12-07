class Solution {
    static int countTriplets(int Arr[], int N, int L, int R) {
        int i,j,k,count=0,temp;
        Arrays.sort(Arr);
        //Add all triplets...
        for(i=0;i<N-2;i++){
            j=i+1;
            while(j<N-1){
                count+=N-1-j;
                j++;
            }
        }
        //Exclude triplets greater than R
        i=0;
        while(i<N-2){
            j=i+1;
            k=N-1;
            temp=0;
            while(j<k){
                while(Arr[i]+Arr[j]+Arr[k]>R && j<k){
                    temp++;
                    k--;
                }
                count-=temp;
                j++;
            }
            while(j<N-1){
                count-=(N-1-j);
                j++;
            }
            i++;
        }
        //Exclude triplets lesser than L
        i=N-1;
        while(i>1){
            j=0;
            k=i-1;
            temp=0;
            while(j<k){
                while(Arr[i]+Arr[j]+Arr[k]<L && j<k){
                    temp++;
                    j++;
                }
                k--;
                count-=temp;
            }
            while(k>0){
                count-=k;
                k--;
            }
            i--;
        }
        return count;
    }
}
