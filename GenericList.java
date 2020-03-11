import java.util.ArrayList;
import java.util.Iterator;

public abstract class GenericList<I> implements CreateIterator<I>{
	
	private Node<I> head;  
	private int length;
	
	//As head is private we need getters and setters to access them outside of this class 
	public Node<I> getHead()  
	{
		return this.head;
	}
	public void setHead(Node<I> h)
	{
		this.head = h;
	}
	
	//As head is length we need getters and setters to access them outside of this class 
	public int getLength()
	{
		return this.length;
	}
	public void setLength(int len)
	{
		this.length = len;
	}
	
	//Print method to print the list that was created
	public void print()
	{
		if(this.head == null)  //If the list is empty will return Empty list 
		{
			System.out.println("Empty List");
		}
		else
		{
			Node<I> x = this.head; //else will loop thorough the entire list and 
			                      // print out all the elements in the list
			while(x!=null)
			{
				System.out.println(x.data);
				x=x.next;
			}
		}
	}
	
	
	public abstract void add (I data);//This is left abstract as there are different ways 
									  // to add the elements in the list
	
	//Delete method to delete the list 
	public I delete()
	{	
		if(this.head == null) // If the list is empty then return null
		{
			return null;
		}
		else //If the list has elements then delete the element 
		{
			I temp = this.head.data;
			this.head = this.head.next; // shift the head to the next element
			this.length--; // decrement the length as you go
			return temp; 
		}
	}
	
	//DumpList empties the original list and adds the elements to ArrayList
	public ArrayList<I> dumpList()
	{
		ArrayList<I> NewList = new ArrayList<I> (); //create new ArrayList
		while (this.head != null) //Loop through the list
		{
			NewList.add(this.head.data); //Adding the elements in ArrayList
			this.head= this.head.next;  //incrementing
			length--;
		}
		return NewList; //Returning the new ArrayList 
	}
	
//Node class 		
	public class Node<T> 
	{
		T data;   //to store data
		Node<T> next; // to store the address of the next element
		
		Node(T data) // Parameterized constructor of the class
		{
			this.data = data;
			this.next = null;
		}
	}
	
	//the override method of the CreateIterator class
	public Iterator<I> createIterator()
	{
		Iterator<I> it = new GLIterator<I>(this.head);
		return it;
		
	}
}


