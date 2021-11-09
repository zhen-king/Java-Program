package zhen_lab3;
import java.util.Arrays;
	import java.util.Queue;
	import java.util.LinkedList;
	import java.util.NoSuchElementException;
	import java.util.Scanner;

	/**
	 * Class to maintain a queue of customers.
	 * @author Koffman & Wolfgang
	 **/
	public class newMaintainQueue {

	    // Data Field
	    private final Queue<String> customers;
	    private final Queue<String> High;
	    private final Queue<String> Medium;
	    private final Queue<String> Low;
	    private final Scanner in;
	    String priority;
	    String name;
	    // Constructor
	    /** Create an empty queue. */
	    public newMaintainQueue() {
	        customers = new LinkedList<>();
	        High = new LinkedList<>();
	        Medium = new LinkedList<>();
	        Low = new LinkedList<>();
	        in = new Scanner(System.in);
	    }
	    /*</listing>*/
	    /*<listing chapter="4" number="11">*/

	    /**
	     * Performs the operations selected on queue customers.
	     * @pre  customers has been created.
	     * @post customers is modified based on user selections.
	     */
	    public void processCustomers() {
	    	
	    	String choice = "";
	        String[] choices = {
	            "add", "peek", "remove", "quit"};

	        // Perform all operations selected by user.
	        while (!choice.equals("quit")) {
	            // Process the current choice.
	            try {
	                
	                
	                System.out.println("Chose from the list: "
	                        + Arrays.toString(choices));
	                choice = in.nextLine();
	                switch (choice) {
	                    case "add":
	                        System.out.println("Enter new customer name");
	                        name = in.nextLine();
	                        customers.offer(name);
	                        System.out.println("Enter their priority level"
	                        		+ "(High, Med, Low)");
	                        priority = in.nextLine();
	                        addPriority(priority);
	                        System.out.println(
	                                "Customer " + name
	                                + " added to the queue"+". The priority is "+priority);
	                        break;
	                   
	                    case "remove":
	                    	String remove= customers.poll();
	                        if (High.peek().equals(remove)) {
	                        	if (!(High.isEmpty())) {
	                        	 System.out.println(
	 	                                "Customer " + High.poll()
	 	                                + " removed from the High priority");}
            	    			else
            	    			{
    							System.out.println("The High Queue is empty");
    						}
	                        }
	                        else if (Medium.peek().equals(remove)) {
	                        	if (!(Medium.isEmpty())) {
	                        	 System.out.println(
	 	                                "Customer " + Medium.poll()
	 	                                + " removed from the Medium priority");}
	            	    		else
	    						{
	    							System.out.println("The Medium Queue is empty");
	                        }
	                        }
	                        else if (Low.peek().equals(remove)) {
	                        	if (!(Low.isEmpty())) {
	                        
	                        	 System.out.println(
	 	                                "Customer " + Low.poll()
	 	                                + " removed from the Low priority");}
            	    		else
    						{
    							System.out.println("The Low Queue is empty");
    						}
	                        }
	                        break;
	                    case "peek":
	                    	String typePriority = "";
	                    	System.out.println("Enter the priority you want check"+
	                    			"(High, Med, Low)");
	                    	typePriority= in.nextLine();
	                    	if (typePriority.equals("High")) {
	                    		if (!(High.isEmpty())) {
	            	    		System.out.println(
		                                "Customer " + High.element()
		                                + " is in the High priority");}
	            	    		else
	    						{
	    							System.out.println("The High Queue is empty");
	    						}
	            	    	}
	            	    	else if (typePriority.equals("Med")) {
	            	    		if (!(Medium.isEmpty())) {
	            	    		System.out.println(
		                                "Customer " + Medium.element()
		                                + " is next in the Medium priority");}
	            	    		else
	    						{
	    							System.out.println("The Medium Queue is empty");
	    						}
	            	    	}
	            	    	else if (typePriority.equals("Low")) {
	            	    		if (!(Low.isEmpty())) {
	            	    		System.out.println(
		                                "Customer " + Low.element()
		                                + " is next in the Low priority");}
	            	    		else
	    						{
	    							System.out.println("The Low Queue is empty");
	    						}
	            	    	}
	                    	break;
	                    case "quit":
	                    	System.out.println(
	    							"Leaving High queue. "
	    									+ "\nNumber of customers in the High queue is "
	    									+ High.size());
	    					System.out.println();



	    					System.out.println(
	    							"Leaving Medium queue. "
	    									+ "\nNumber of customers in the Medium queue is "
	    									+ Medium.size());
	    					System.out.println();


	    					System.out.println(
	    							"Leaving Low queue. "
	    									+ "\nNumber of customers in the Low queue is "
	    									+ Low.size());
	    					System.out.println();
	                        break;
	                    default:
	                        System.out.println("Invalid choice -- try again");
	                } // end switch
	            } catch (NoSuchElementException e) {
	                System.out.println(
	                        "The Queue is empty");
	            } // end try-catch
	        } // end while
	    }
	    
	    /*</listing>*/
	    /*<exercise chapter="4" section="6" type="programming" number="1">*/

	    /**
	     * Create a string representation of the queue contents with each
	     * entry on its own line
	     * @return a String representation of the queue contents
	     */
	    @Override
	    public String toString() {
	        return String.join("\n", customers);
	    }
	    /*</exercise>*/
	    public void addPriority(String priority ) {
	    	if (priority.equals("High")) {
	    		High.offer(name);
	    	}
	    	else if (priority.equals("Med")) {
	    		Medium.offer(name);
	    	}
	    	else if (priority.equals("Low")) {
	    		Low.offer(name);
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice -- try again");
	    	}
	    		
	    }
	    
	    public static void main(String[] args) {
	        (new newMaintainQueue()).processCustomers();
	    }
	

}

