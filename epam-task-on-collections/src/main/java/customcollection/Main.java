package customcollection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		MyList m= new MyList();
	    System.out.println("Menu");
	    System.out.println("1.Add an element to list");
	    System.out.println("2.Remove an elemnet from list");
	    System.out.println("3.Display list");
	    System.out.println("4.Exit");
	    
	    while(true)
	    {
	    	   System.out.println("Enter your choice (1-4) :");
	    	   Scanner sc= new Scanner(System.in);
	    	try {
	    		int choice =sc.nextInt();
	    		switch(choice)
	    		{
	    		case 1:
	    			System.out.print("Enter an element : ");
	    			String s1=sc.next();
	    			String s2=sc.nextLine();
	    			m.add(s1+s2);
	    			break;
	    		case 2:
	    			m.remove();
	    			break;
	    		case 3:
	    			System.out.println(m);
	    			break;
	    		case 4:
	    			sc.close();
	    			System.exit(0);
	    			break;
	    		default:
	    			System.out.println("Please enter an integer between 1-4");
	    		
	    			
	    		}
	    	}
	    	catch(InputMismatchException e)
	    	{
	    		System.out.println("Please enter an integer between 1-4");
	    		
	    	}
	    }

	}

}
