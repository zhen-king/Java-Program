/*
 * Assignment 2:  Gone Fishin
 * This assignment gives you some practice with singly linked lists and using
 * an iterator.
 *
 * Name: Fill in
 * Date: Fill in
 * 
 */
package gonefishin;
import java.util.LinkedList;
import java.util.ListIterator;

   
class FishData {
    
  private String species;  //species of Fish

  private int minSize;  //min size allowed in inches

  private String season;  //fishing season

  private int  limit;  //number

  private Boolean willEat;  //Good eating?  True or False

  //constructor
  FishData(String s1, int m, String s2, int l, Boolean w) {
    species = s1;
    minSize = m; 
    season = s2;
    limit = l;
    willEat = w;
  }

  public String toString() {
    return species + " " + minSize + " " + season + " " + limit + " " + willEat;
  }
  //getter
  public String getName() {
      return this.species;  
  }
  public int getMinSize() {
	  return minSize;
  }
  public String getSeason() {
	  return season;
  }
  public int getLimit() {
	  return limit;
  }
    public boolean getWillEat() {
	  return willEat;
  }
  
  //setter
  public void setName(String s1) {
	  this.species = s1;
  }
  public void setMinSize(int m) {
	  minSize = m;
  }
  public void setSeason(String s2) {
	  season = s2;
  }
  public void setLimit(int l) {
	  limit = l;
  }
  public void setWillEat(boolean w) {
	  willEat = w;
  }
}
//TOD0 1 - Finish the class (all getters and setters for each data item).  
//In the main program, you will print them all out for TODO 7.


    /**
     * @param args the command line arguments
     */
public class GoneFishin{
    
	public static String printFish (LinkedList<FishData> x) {//make a static string to print all the fish data
		ListIterator<FishData> it = x.listIterator(0);// use list iterator
		String fish =null; //make a fish = empty space
		while (it.hasNext()) {//make a while loop to get the make fish data
			fish += it.next().toString() + "\n";
		}
		return fish;//return all fish data
	}
	
	public static String printSecond (LinkedList<FishData> x) {
		ListIterator<FishData> it = x.listIterator(1);//use list iterator to get second data
		String fish = null;// fish = space again
		fish += it.next().toString() + "\n"; //add the second data to fish
		return fish;// return the second data
	}
	
	public static String printLast (LinkedList<FishData> x) {
		return x.peekLast().toString() + "\n";//use the link list peek to check the last one
	}

	public static LinkedList<FishData> removeNotEatFish (LinkedList<FishData> x) {
		ListIterator<FishData> it = x.listIterator(0);// use the list iterator again
		while (it.hasNext()) {
			FishData thisfish =it.next();// use the array to check which one is false
			if(!thisfish.getWillEat()) {
				it.remove(); //then remove
			}
		}
		return x;
	}
	public static void main(String[] args) {
    	// 
         //create a linked list of fish data called fl
        LinkedList<FishData> fl = new LinkedList<FishData>();
        
        //Here are a few data items
        fl.add(new FishData("American Eel", 9, "Summer/Spring", 25, false));
        fl.add(new FishData("Hammerhead Shark", 0, "All Year", 36, false));
        fl.add(new FishData("Horseshoe Crab", 7, "All Year except May", 60, false));
        fl.add(new FishData("Haddock", 18, "All Year", 0, true));
        fl.add(new FishData("Tautog", 16, "late Spring to end of year", 3, true));
        
       
        //TODO 2 - Print out the FishData
        
        System.out.println("Print all the fishy data here:\n");
        System.out.println(printFish(fl)); //print the all data
        

        //TODO 3 - Print out the size of FishData
        System.out.println("Print the size of the list here: " +fl.size() + "\n" );//print the size

        
        //TODO 4 - Get the second element in the list and print it out
        System.out.println("Print the Second fish here:\n");
        System.out.println(printSecond(fl));//print the second fish data
        
        //ToDO 5 get the last element in the list and print here
        System.out.println("Print the Last fish here:\n");
        System.out.println(printLast(fl));// then print the last one
        
        //ToDO 6 Use the Interator class to find all the fish that are not good to eat 
        //and remove them from your linked list.
        System.out.println("Print the Good Eatin fish here:\n");
        fl = removeNotEatFish(fl);//fl will equal the fish that can be eat
        System.out.println(removeNotEatFish(fl) + "\n");//print the fish
        
        //ToDo 7 - Iterate over your remaining fishes and show you can get each item separately.
        System.out.println("Show your getters working:\n");
        ListIterator<FishData> it = fl.listIterator(0);
        while(it.hasNext()) {
        	FishData thisfish = it.next();// print the fish can be eaten by using getter
        	System.out.println(thisfish.getName());//print the name
        	System.out.println(thisfish.getMinSize());//print the size
        	System.out.println(thisfish.getSeason());//print the season
        	System.out.println(thisfish.getLimit());//print the limit
        	System.out.println(thisfish.getWillEat()+ "\n");//then print if we can eat it , should be all true
        }
        //ToDo 8 - Iterate over your remaining fishes and change all the data
        System.out.println("Show your setters working:\n");
        ListIterator<FishData> it1 = fl.listIterator(0);
        while(it.hasNext()) {
        	FishData thisfish = it1.next();
        	int index = fl.indexOf(it1.next());
        	thisfish.setName("Cod");
        	thisfish.setMinSize(19);
        	thisfish.setSeason("Not matter");
        	thisfish.setLimit(1000);
        	thisfish.setWillEat(true);
        	fl.set(index, thisfish);
        }
        
        it1 = fl.listIterator(0);
        while(it1.hasNext()) {
        FishData thisfish = it1.next();
        System.out.println(thisfish.getName());
        System.out.println(thisfish.getMinSize());
        System.out.println(thisfish.getSeason());
        System.out.println(thisfish.getLimit());
        System.out.println(thisfish.getWillEat()+ "\n");
        }
	}
}
    
