class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
         Set<Long> set=new HashSet<>();
         for(long k:a2){
             set.add(k);
         }
         for(long k:a1){
             if(set.contains(k)){
                set.remove(k);
             }
         }
         if(set.size()==0){
             return "Yes";
         }
         return "No";
    }
}
