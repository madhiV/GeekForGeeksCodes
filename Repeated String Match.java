class Solution 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
        int count,pos,j;
        for(int i=0;i<A.length();i++){
            j=0;
            pos=i;
            count=1;
            while(B.charAt(j)==A.charAt(pos)){
                j++;
                if(j==B.length()){
                    return count;
                }
                pos=(pos+1)%A.length();
                if(pos==0){
                    count++;
                }
            }
        }
        return -1;
	} 
} 
