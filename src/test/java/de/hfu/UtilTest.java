package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * JUnit Test for istErstesHalbjahr
 */

public class UtilTest {
	
	@Test
	public void shouldbefirsthalf_year(){
		
		int Monat = 6;
		assertTrue("Soll richtig sein", Util.istErstesHalbjahr(Monat));
		int Monat2 = 7;
		assertFalse("Soll falsch sein", Util.istErstesHalbjahr(Monat2));
		int Monat3 = 5;
		assertTrue("Soll richtig sein", Util.istErstesHalbjahr(Monat3));
		
	}
	

}
