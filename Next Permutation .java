class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        int min, max,i,j,minIndex=N-1,temp;
        List<Integer> l=new LinkedList<>();
        max=arr[N-1];
        i=N-2;
        j=N-1;
        for(;i>=0;i--){
            if(arr[i]<max){
                min=Integer.MAX_VALUE;
                for(j=i+1;j<N;j++){
                    if(arr[j]>arr[i] && arr[j]<min){
                        min=arr[j];
                        minIndex=j;
                    }
                }
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
                break;
            }
            else{
                max=Math.max(max,arr[i]);
            }
        }
        j=N-1;
        i++;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<N;i++){
            l.add(arr[i]);
        }
        return l;
    }
}
