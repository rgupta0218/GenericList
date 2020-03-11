import java.util.Iterator;

public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello generic lists");
//		GenericQueue<Integer> x = new GenericQueue<Integer> (1);
//		x.enqueue(2);
//		x.enqueue(3);
//		x.enqueue(4);
//		System.out.println("Length " + x.getLength());
//		
//		x.dequeue();
//		x.print();
//		x.dumpList();
//		
//		System.out.println("Length " + x.getLength());
//		
//		x.print();
		
		GenericStack<Integer> y = new GenericStack<Integer> (1);
		y.push(2);
		y.push(3);
		y.push(4);
		System.out.println("The Stack");
		y.print();
		System.out.println("Length " + y.getLength());
		y.pop();
		y.pop();
		
		Iterator<Integer> iter = y.createIterator();
		while(iter.hasNext())
		{
			System.out.println("Iterator"+iter.next());
		}
		
		//y.print();
		System.out.println("Length " + y.getLength());
		System.out.println("Dumplist"+y.dumpList());
		System.out.println("Length " + y.getLength());
		y.print();
		
		
	}


}
