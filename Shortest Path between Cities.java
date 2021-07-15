class Solution { 
    int shortestPath( int x, int y){ 
        // code here
        int temp,t,count=0;
        Set<Integer> set=new HashSet<>();
        temp=Math.max(x,y);
        while(temp>=0){
            temp/=2;
            set.add(temp);
            if(temp==0){
                break;
            }
        }
        temp=Math.min(x,y);
        while(!set.contains(temp)){
            temp/=2;
        }
        temp=(int)(Math.log(temp)/Math.log(2));
        count+=(int)(Math.log(x)/Math.log(2))-temp;
        count+=(int)(Math.log(y)/Math.log(2))-temp;
        return count;
    }
}
