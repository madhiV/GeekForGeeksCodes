class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	void push(int x)
	{
	    if(front==-1){
	        front=0;
	        arr[front]=x;
	        rear=0;
	    }
	    else{
	        rear++;
	        arr[rear]=x;
	    }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    int x;
		if(front==-1){
		    return -1;
		}
		x=arr[front];
		front++;
		if(front>rear){
		    front=-1;
		}
		return x;
	} 
}
