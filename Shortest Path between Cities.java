class Solution { 
    int shortestPath( int x, int y){ 
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int temp=x;
        x=Math.min(x,y);
        y=Math.max(temp,y);
        while(y!=0){
            y/=2;
            count+=1;
            map.put(y,count);
            if(y==x){
                return count;
            }
        }
        map.put(0,count);
        count=0;
        while(!map.containsKey(x)){
            count+=1;
            x/=2;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
        }
        return count;
    }
}
