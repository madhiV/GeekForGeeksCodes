class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    long count=0,c=0,pos=0;
	    int i,j;
	    Arrays.sort(a);
	    for(i=0;i<n;i++){
	        if(a[i]>=0){
	            pos++;
	        }
	    }
	    //Adding all positive positive pairs...
	    if(pos>1){
	        count+=(pos)*(pos-1)/2;
	    }
	    
	    //Adding all positive negative pairs whose sum > 0;
	    i=0;
	    j=n-1;
	    while(i<n && a[i]<0 && j>0 && a[j]>0){
	        if(Math.abs(a[i])>=a[j]){
	            count+=c;
	            i++;
	            continue;
	        }
	        while(j>0 && a[j]>Math.abs(a[i])){
	            j--;
	            c++;
	        }
	        i++;
	        count+=c;
	    }
	    while(i<n && a[i]<0){
	        count+=c;
	        i++;
	    }
	    return count;
	}
}
