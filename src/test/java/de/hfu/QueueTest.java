package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * JUnit Test for istErstesHalbjahr
 */

public class QueueTest {

	@Test
	public void testEnqueue() {
		
		try{
			
			Queue TestSchlange1 = new Queue(0); // Falsche Größe
			fail("Falsche Queue länge");
			
		} catch(IllegalArgumentException e){}
		 
		Queue TestSchlange2 = new Queue(3);
		
		try{
			
			TestSchlange2.dequeue(); // Kein Element gefunden
			fail("Erwartete Ausnahme wurde nicht geworfen");
			
		} catch(IllegalStateException e){}
		
		TestSchlange2.enqueue(1);
		TestSchlange2.enqueue(2);
		TestSchlange2.enqueue(3);
		
		assertEquals("Sollte 1 sein", 1, TestSchlange2.queue[0]);
		assertEquals("Sollte 2 sein", 2, TestSchlange2.queue[1]);
		assertEquals("Sollte 3 sein", 3, TestSchlange2.queue[2]);
		
		
		TestSchlange2.enqueue(1);
		TestSchlange2.enqueue(2);
		TestSchlange2.enqueue(3);
		TestSchlange2.enqueue(4);
		
		assertEquals("Sollte 1 sein (zweites mal)", 1, TestSchlange2.dequeue());
		assertEquals("Sollte 2 sein (zweites mal)", 2, TestSchlange2.dequeue());
		assertEquals("Sollte 4 sein (zweites mal)", 4, TestSchlange2.dequeue());
		
	
	}
			
}
