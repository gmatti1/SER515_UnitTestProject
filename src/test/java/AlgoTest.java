package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData data = new SortDemoData();

	//Edge coverage and condition coverage as mentioned in the document
	//<24, 25, 26, 27, 28, 29, 28. 27, Function end>
	//vec = {10, 23, 96, 105, 123}
	@Test
	public void bubbleSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.bubbleSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	//Edge and Condition coverage as mentioned in the document
	//<24, 25, 26, 27, 28, 29, 30, 31, 32, 28, 27, Function end >
	//vec = {102,1,23,53,96}
	@Test
	public void bubbleSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.bubbleSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	//Edge and Node coverage Control flow graph - <22, Function End>
	@Test (expected = NullPointerException.class) 
	public void bubbleNullPointerExceptionTest() {
		Item[] myArray = null;
		SortAlgos.bubbleSort(myArray);
	}
	
	//Condition Coverage
	@Test
	public void bubbleSortSingledata() {
		
		Item[] myArray = new Item[1];
		myArray[0] = new Item(1);
		
	    data.initializeArray("1");  
	    
	    SortAlgos.bubbleSort(myArray);
	    
		assertTrue(data.myArray.length == 1);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
	}
	
	//This is input with Descending data elements
	@Test
	public void bubbleSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.bubbleSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
}
