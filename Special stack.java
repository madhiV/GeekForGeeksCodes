class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            if(s.isEmpty()){
                return -1;
            }
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
            if(s.isEmpty()){
                return -1;
            }
           int min=Integer.MAX_VALUE;
           while(!s.isEmpty()){
               min=Math.min(min,s.pop());
           }
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}
}
