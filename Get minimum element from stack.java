class GfG
{
    int minEle,temp;
    Stack<Integer> s;
    
    GfG(){
        s=new Stack<>();
    }
    /*returns min element from stack*/
    int getMin()
    {
    	if(s.isEmpty()){
    	    return -1;
    	}
    	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
    	if(s.isEmpty()){
    	    return -1;
    	}	
    	if(s.peek()<minEle){
    	    temp=s.peek();
    	    minEle=2*minEle-temp;
    	    s.pop();
    	    return (temp+minEle)/2;
    	}
    	return s.pop();
    }

    /*push element x into the stack*/
    void push(int x)
    {
    	if(s.isEmpty()){
    	    s.push(x);
    	    minEle=x;
    	    return;
    	}	
    	if(x<minEle){
    	    s.push(2*x-minEle);
    	    minEle=x;
    	}
    	else{
    	    s.push(x);
    	}
    }	
}
