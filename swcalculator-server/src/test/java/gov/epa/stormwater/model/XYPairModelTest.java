package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class XYPairModelTest {

	private Double xTestData = 1.1;
	private Double yTestData = 2.2;

	@Test
	public void xyPairTest() {

		Double xnewTestData = 3.3;
		Double ynewTestData = 4.4;

		XYPairModel model = new XYPairModel(xTestData, yTestData);

		assertEquals(xTestData, model.getX());
		assertEquals(yTestData, model.getY());

		model.setX(xnewTestData);
		assertEquals(xnewTestData, model.getX());

		model.setY(ynewTestData);
		assertEquals(ynewTestData, model.getY());
	}
}
