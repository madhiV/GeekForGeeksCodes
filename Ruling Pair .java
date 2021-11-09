class Solution { 
	static int RulingPair(int arr[], int n) { 
        Map<Integer,Integer> map=new HashMap<>();
        int max=-1,temp,sum;
        for(int i=0;i<n;i++){
            sum=sumDigits(arr[i]);
            temp=map.getOrDefault(sum,-1);
            if(temp==-1){
                map.put(sum,arr[i]);
            }
            else{
                max=Math.max(max,arr[i]+temp);
                map.put(sum,Math.max(temp,arr[i]));
            }
        }
        return max;
	}    
	public static int sumDigits(int n){
	    int sum=0;
	    while(n!=0){
	        sum+=n%10;
	        n/=10;
	    }
	    return sum;
	}
} 
