class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)){
                al.add(i);
            }
        }
        return al;
    }
    public boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
