
public class GenericQueue<I> extends GenericList<I>{

	public GenericQueue(I data)  // Constructor
	{
		this.add(data);
	}

	@Override
	public void add(I data)   //The override function from the inherited class
	{
		Node<I> temp = getHead(); //temp used as a pointer to head
		Node<I> NewElm = new Node<I> (data); // new node for the new element
		
		//As this is queue the add method will add as FIFO
		if(temp == null)   //If the queue is empty create head
		{
			setHead(NewElm);
			setLength(1);
		}
		else //If there is a queue already then add the element at the end of the list
		{
			while(temp.next!= null) //loop through to get to the end of the list 
			{
				temp = temp.next;
			}
			temp.next = NewElm; //add the new element
			setLength(getLength()+1); //increment the length
		}
		
	}
	
	//Using add method of this class to add elements in queue
	public void enqueue(I data)
	{
		this.add(data);
	}
	
	//Using the delete method to delete the elements in the queue
	public I dequeue()
	{
		return this.delete();
	}


}
