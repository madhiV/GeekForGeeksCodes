class Solution{
    static Boolean[][] dp=null;
    static int[] arr1;
    static int target;
    static Boolean isSubsetSum(int N, int arr[], int sum){
        target=sum;
        dp=new Boolean[N][sum];
        arr1=arr;
        return computeAns(0,0);
    }
    public static boolean computeAns(int i,int sum){
        if(i==arr1.length){
            return sum==target;
        }
        if(dp[i][sum]==null){
            if(sum+arr1[i]<target){
                dp[i][sum]=computeAns(i+1,sum+arr1[i])||computeAns(i+1,sum);
            }
            else if(sum+arr1[i]>target){
                dp[i][sum]=computeAns(i+1,sum);
            }
            else{
                dp[i][sum]=true;
            }
        }
        return dp[i][sum];
    }
}
