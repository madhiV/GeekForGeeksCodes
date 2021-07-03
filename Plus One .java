class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        int temp,carry=1;
        for(int i=N-1;i>=0;i--){
            temp=arr.get(i)+carry;
            arr.set(i,temp%10);
            carry=temp/10;
        }
        if(carry!=0){
            arr.add(0,carry);
        }
        return arr;
    }
};
