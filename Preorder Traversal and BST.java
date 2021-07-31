class Solution {
    static int i;
    static int[] nums;
    static int canRepresentBST(int arr[], int N) {
        i=1;
        nums=arr;
        computeAns(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(i==N){
            return 1;
        }
        return 0;
    }
    public static void computeAns(int par,int lb,int ub){
        if(i==nums.length){
            return;
        }
        if(nums[i]<=nums[par] && nums[i]>=lb){
            i++;
            computeAns(i-1,lb,nums[par]);
        }
        if(i!=nums.length && nums[i]>=nums[par] && nums[i]<ub){
            i++;
            computeAns(i-1,nums[par],ub);
        }
    }
}
