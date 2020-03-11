
public class GenericStack<I> extends GenericList<I>{

	public GenericStack(I data) //constructor
	{
		this.add(data);
	}

	@Override
	public void add(I data) //add method for stack in FILO
	{
		Node<I> temp = getHead();
		Node<I> NewElm = new Node<I> (data);
		
		NewElm.next = temp;
		setHead(NewElm);    //new element will always be added at the top
		setLength(getLength()+1);
	}
	
	//Using add method to add elements in the stack
	public void push(I data)
	{
		this.add(data);
	}
	
	//Using delete method to delete the elements from the stack 
	public I pop()
	{
		return this.delete();
	}

}
