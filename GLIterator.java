import java.util.Iterator;

public class GLIterator<I> implements Iterator<I> {
	
	GenericList<I>.Node<I> tempNode;
	public GLIterator (GenericList<I>.Node<I> head) //Constructor
	{
		tempNode = head;
	}
	

	@Override
	public boolean hasNext() //Checks 
	{
		if(tempNode != null)  //checks if head is null or not 
		{
			return true;   // if head is not null return true
		}
		return false; // if head is null return false
	}

	@Override
	public I next() 
	{  //uses hasnext to check if head is not null, then sends the data, and moves head to next
		I data;
		if(this.hasNext()== true)
		{
			data = tempNode.data; 
			tempNode = tempNode.next;
			return data;
		}
		return null;
	}

	
}
