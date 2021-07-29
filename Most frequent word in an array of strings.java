class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        int max=1;
        String ans=arr[0];
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        map.put(arr[0],1);
        map2.put(arr[0],0);
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if(max<map.get(arr[i])){
                    max=map.get(arr[i]);
                    ans=arr[i];
                }
                else if(max==map.get(arr[i])){
                    if(map2.get(ans)<map2.get(arr[i])){
                        ans=arr[i];
                    }
                }
            }
            else{
                map.put(arr[i],1);
                if(max==1){
                    ans=arr[i];
                }
                map2.put(arr[i],i);
            }
        }
        //System.out.println(map2);
        return ans;
    }

}
