package customcollection;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    
    public void remove() {
    	if(size==0)
    	{
    		System.out.println("List is empty,Cannot delete the elements...");
    	}
    	else {
    	Object r=elements[size-1];
    	System.out.println("\nRemoved element is "+ r);
    	elements[size-1]=null;
    	size--;
    	}	
    }
    
    public void printList()
    {
    	for(Object o:elements)
    		if(o==null)
    			break;
    		else
    		System.out.print(o+" ");
    	System.out.println();
    }
    
    

    

    @Override
	public String toString() {
    	if(size==0)
    		return "[ ]";
    	else
    	{			
    	String res="[ ";
    	for(Object o:elements)
    		if(o==null)
    			break;
    		else
    		res+=o+" , ";
    	
    		res=res.substring(0,res.length()-2);
    	
    	res+="]\n";
    	return res;
    	}
    	
	}

	private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}