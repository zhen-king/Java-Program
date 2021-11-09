package gonefishin;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class GoneFishinTest {
	//Create Single linked list
	 LinkedList<FishData> myList = new LinkedList<FishData>();
		
	
	@Test //first test: check if element is first element in list
	void FirstElementTest() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		//add data to the list
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//check
		assertEquals(0, myList.indexOf(fish0),"the first fish is not" +fish1.getName());
	}
	@Test// test: check if element is last element in list
	void LastElementTest() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		//add data to the list
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//check
		assertEquals(4, myList.indexOf(fish4), "the last fish is not" + fish4.getName());
	}
	@Test//t test: check if element is some element in the middle of list
	void MiddleElementTest() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		//add data to the list
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//check
		assertEquals(2, myList.indexOf(fish2), "the middle fish is not" + fish2.getName());
	}
	@Test// test: check if list is empty
	void isEmptyTest() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		
		//add not data to the list, so size should be 0
		assertEquals(0, myList.size(), "the list is not empty");
	}
	@Test//test the size of the data
	void SizeTest() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		//add data to the list
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//check
		assertEquals(5, myList.size(), "the list is not empty");
	}
	@Test//test the element that not in the list
	void elemenNotInTheList() {//add all fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		FishData fish5 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
		//add data to the list, but not add the fish5
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//check
		assertEquals(-1, myList.indexOf(fish5), "It is in the list");
	}
	@Test//test is list is null linked list
	public void nullLinkedListTest()
	{//not addition to the list
		//check
		assertNotNull("Sorry! the Linked List is null", myList);
	}
	@Test//find first true element
	public void findFirstoccurrenceOfElementInTheLinkedListTest()
	{//add all the fish data
		FishData fish0 = new FishData("American Eel", 9, "Summer/Spring", 25, false);
		FishData fish1 = new FishData ("Hammerhead Shark", 0, "All Year", 36, false);
		FishData fish2 = new FishData("Horseshoe Crab", 7, "All Year except May", 60, false);
		FishData fish3 = new FishData("Haddock", 18, "All Year", 0, true);
		FishData fish4 = new FishData("Tautog", 16, "late Spring to end of year", 3, true);
	
		//add data to the list
		myList.add(fish0);
		myList.add(fish1);
		myList.add(fish2);
		myList.add(fish3);
		myList.add(fish4);
		//fish3 is first element that id true, so ...
		assertEquals( 3, myList.indexOf(fish3),"First Occurrence of " + fish3.getName() + "is not at index 3");
	}
}


