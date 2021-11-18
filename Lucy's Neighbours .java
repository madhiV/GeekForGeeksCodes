class Solution 
{ 
	public ArrayList<Integer> Kclosest(int arr[], int n, int x, int k) 
	{ 
	    ArrayList<Integer> al=new ArrayList<>();
	    PriorityQueue<Integer> pq=new PriorityQueue<>(
	        new Comparator<Integer>(){
	            public int compare(Integer a,Integer b){
	                int temp1,temp2;
	                temp1=Math.abs(x-a);
	                temp2=Math.abs(x-b);
	                if(temp1>temp2){
	                    return 1;
	                }
	                else if(temp1==temp2){
	                    if(a<b){
	                        return -1;
	                    }
	                    return 1;
	                }
	                else{
	                    return -1; 
	                }
	            }
	        }    
	    );
	    for(int i=0;i<n;i++){
	        pq.add(arr[i]);
	    }
	    while(k>0){
	        al.add(pq.poll());
	        k--;
	    }
	    Collections.sort(al);
	    return al;
	}
}
