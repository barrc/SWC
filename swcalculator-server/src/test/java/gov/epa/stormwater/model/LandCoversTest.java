package gov.epa.stormwater.model;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gov.epa.stormwater.model.LandCovers;

public class LandCoversTest {

	@Test
	public void landCoversTest() {
		System.out.println("Test FOREST expected value is 0" );
		assertEquals(0,LandCovers.FOREST.getValue());
		
		System.out.println("Test MEADOW expected value is 1" );
		assertEquals(1,LandCovers.MEADOW.getValue());
		
		System.out.println("Test LAWN expected value is 2" );
		assertEquals(2,LandCovers.LAWN.getValue());
		
		System.out.println("Test DESERT expected value is 3" );
		assertEquals(3,LandCovers.DESERT.getValue());
		
		System.out.println("Test FILL expected value is 4" );
		assertEquals(4,LandCovers.FILL.getValue());
		
		System.out.println("Test IMPERV expected value is 5" );
		assertEquals(5,LandCovers.IMPERV.getValue());
		
		System.out.println("Test COUNT expected value is 6" );
		assertEquals(6,LandCovers.COUNT.getValue());
	}
	
	@Test
	public void landCoversEnumLengthTest() {
		assertEquals(7, LandCovers.values().length);
	}
}
	