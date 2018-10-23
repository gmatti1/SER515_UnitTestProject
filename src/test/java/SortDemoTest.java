package test.java;


import static org.junit.Assert.*;


import java.util.List;
import java.util.Objects;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();


	/**
	* testNewAccountsType checks for valid input types in the 1st parameter
	*/
	@Test
	public void testNumber() {
	   data.initializeArray("20");
	   assertTrue(data.myArray.length == 20);
	   
	   data.initializeArray("30");
	   assertTrue(data.myArray.length == 30);
	   
	   data.initializeArray("0");
	   assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
	    data.initializeArray("-3");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
	    data.initializeArray("5.5 7 9");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
	    data.initializeArray("");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
	    data.initializeArray("5 8 y 4");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
	    data.initializeArray("5 64 4");  
	    
	    SortDemoData data2 = new SortDemoData();
	    data2.initializeArray("5 64 4");
		assertTrue(data.myArray.length == 3);
		assertTrue(data.myArray[0].key == data2.myArray[0].key );
		assertTrue(data.myArray[1].key == data2.myArray[1].key );
		assertTrue(data.myArray[2].key == data2.myArray[2].key );
	}

	// TODO: Include your test cases below
	//*** Selection Sort ****	
	@Test
	public void selectionSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.selectionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test
	public void selectionSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.selectionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test (expected = NullPointerException.class) 
	public void selectionSortNullPointerExceptionTest() {
		SortAlgos.selectionSort(null);
	}
	
	//This is input with Descending data elements
	@Test
	public void selectionSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.selectionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}

	
	//*** Insertion Sort ****	
	@Test
	public void insertionSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.insertionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test
	public void insertionSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.insertionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test (expected = NullPointerException.class) 
	public void insertionSortNullPointerExceptionTest() {
		SortAlgos.insertionSort(null);
	}
	
	//This is input with Descending data elements
	@Test
	public void insertionSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.insertionSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	//*** Merge Sort ****	
	@Test
	public void mergeSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.mergeSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test
	public void mergeSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.mergeSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test (expected = NullPointerException.class) 
	public void mergeSortNullPointerExceptionTest() {
		SortAlgos.mergeSort(null);
	}
	
	//This is input with Descending data elements
	@Test
	public void mergeSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.mergeSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	//*** Quick Sort ****	
	@Test
	public void quickSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.quickSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test
	public void quickSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.quickSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test (expected = NullPointerException.class) 
	public void quickSortNullPointerExceptionTest() {
		SortAlgos.quickSort(null);
	}
	
	//This is input with Descending data elements
	@Test
	public void quickSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.quickSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	//*** Heap Sort ****	
	@Test
	public void heapSortSortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(10);
		myArray[1] = new Item(23);
		myArray[2] = new Item(96);
		myArray[3] = new Item(105);
		myArray[4] = new Item(123);
		
	    data.initializeArray("10 23 96 105 123");  
	    
	    SortAlgos.heapSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test
	public void heapSortUnsortedArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(1);
		myArray[2] = new Item(23);
		myArray[3] = new Item(53);
		myArray[4] = new Item(96);
		
	    data.initializeArray("1 23 53 96 102");  
	    
	    SortAlgos.heapSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
	
	@Test (expected = NullPointerException.class) 
	public void heapSortNullPointerExceptionTest() {
		SortAlgos.heapSort(null);
	}
	
	//This is input with Descending data elements
	@Test
	public void heapSortDescendingArrayTest() {
		
		Item[] myArray = new Item[5];
		myArray[0] = new Item(102);
		myArray[1] = new Item(91);
		myArray[2] = new Item(23);
		myArray[3] = new Item(5);
		myArray[4] = new Item(1);
		
	    data.initializeArray("1 5 23 91 102");  
	    
	    SortAlgos.heapSort(myArray);
	    
		assertTrue(data.myArray.length == 5);
		assertTrue("Values are correct", data.myArray[0].key == myArray[0].key );
		assertTrue("Values are correct", data.myArray[1].key == myArray[1].key );
		assertTrue("Values are correct", data.myArray[2].key == myArray[2].key );
		assertTrue("Values are correct", data.myArray[3].key == myArray[3].key );
		assertTrue("Values are correct", data.myArray[4].key == myArray[4].key );
	}
}