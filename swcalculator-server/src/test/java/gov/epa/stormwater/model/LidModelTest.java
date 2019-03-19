package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class LidModelTest {

	BigDecimal testData = BigDecimal.valueOf(100);
	
	@Test
	public void idCaptureTest() {
		LidModel model = new LidModel();
		model.setIdCapture(testData);
		assertEquals(testData,model.getIdCapture());
	}
	
	@Test
	public void rhSizeTest() {
		LidModel model = new LidModel();
		model.setRhSize(testData);
		assertEquals(testData,model.getRhSize());
	}
	
	@Test
	public void rhDrainRateTest() {
		LidModel model = new LidModel();
		model.setRhDrainRate(testData);
		assertEquals(testData,model.getRhDrainRate());
	}
	
	@Test
	public void rhNumberTest() {
		LidModel model = new LidModel();
		model.setRhNumber(testData);
		assertEquals(testData,model.getRhNumber());
	}
	
	@Test
	public void rgRimHeightTest() {
		LidModel model = new LidModel();
		model.setRgRimHeight(testData);
		assertEquals(testData,model.getRgRimHeight());
	}
	
	@Test
	public void rgSoilHeightTest() {
		LidModel model = new LidModel();
		model.setRgSoilHeight(testData);
		assertEquals(testData,model.getRgSoilHeight());
	}
	
	@Test
	public void rgSoilPorosityTest() {
		LidModel model = new LidModel();
		model.setRgSoilPorosity(testData);
		assertEquals(testData,model.getRgSoilPorosity());
	}
	
	@Test
	public void rgSoilKsatTest() {
		LidModel model = new LidModel();
		model.setRgSoilKsat(testData);
		assertEquals(testData,model.getRgSoilKsat());
	}
	
	@Test
	public void rgCatureTest() {
		LidModel model = new LidModel();
		model.setRgCapture(testData);
		assertEquals(testData,model.getRgCapture());
	}
	
	@Test
	public void rgHasPreTreatTest() {
		LidModel model = new LidModel();
		model.setRgHasPreTreat(true);
		assertEquals(true,model.getRgHasPreTreat());
		
		model.setRgHasPreTreat(false);
		assertEquals(false,model.getRgHasPreTreat());
	}
	

	@Test
	public void grSoilHeightTest() {
		LidModel model = new LidModel();
		model.setGrSoilHeight(testData);
		assertEquals(testData,model.getGrSoilHeight());
	}
	
	@Test
	public void grSoilPorosityTest() {
		LidModel model = new LidModel();
		model.setGrSoilPorosity(testData);
		assertEquals(testData,model.getGrSoilPorosity());
	}
	
	@Test
	public void grSoilKsatTest() {
		LidModel model = new LidModel();
		model.setGrSoilKsat(testData);
		assertEquals(testData,model.getGrSoilKsat());
	}
	
	@Test
	public void grDrainHeightTest() {
		LidModel model = new LidModel();
		model.setGrDrainHeight(testData);
		assertEquals(testData,model.getGrDrainHeight());
	}
	
	@Test
	public void grDrainVoidTest() {
		LidModel model = new LidModel();
		model.setGrDrainVoid(testData);
		assertEquals(testData,model.getGrDrainVoid());
	}
	
	@Test
	public void spRimHeightTest() {
		LidModel model = new LidModel();
		model.setSpRimHeight(testData);
		assertEquals(testData,model.getSpRimHeight());
	}
	
	@Test
	public void spSoilHeightTest() {
		LidModel model = new LidModel();
		model.setSpSoilHeight(testData);
		assertEquals(testData,model.getSpSoilHeight());
	}
	
	@Test
	public void spSoilPorosityTest() {
		LidModel model = new LidModel();
		model.setSpSoilPorosity(testData);
		assertEquals(testData,model.getSpSoilPorosity());
	}
		
	@Test
	public void spSoilKsatTest() {
		LidModel model = new LidModel();
		model.setSpSoilKsat(testData);
		assertEquals(testData,model.getSpSoilKsat());
	}
	
	@Test
	public void spDrainHeightTest() {
		LidModel model = new LidModel();
		model.setSpDrainHeight(testData);
		assertEquals(testData,model.getSpDrainHeight());
	}
	
	@Test
	public void spDrainVoidTest() {
		LidModel model = new LidModel();
		model.setSpDrainVoid(testData);
		assertEquals(testData,model.getSpDrainVoid());
	}
	
	@Test
	public void spCatureTest() {
		LidModel model = new LidModel();
		model.setSpCapture(testData);
		assertEquals(testData,model.getSpCapture());
	}
	
	@Test
	public void ibHeightTest() {
		LidModel model = new LidModel();
		model.setIbHeight(testData);
		assertEquals(testData,model.getIbHeight());
	}
	
	@Test
	public void ibCatureTest() {
		LidModel model = new LidModel();
		model.setIbCapture(testData);
		assertEquals(testData,model.getIbCapture());
	}
	
	@Test
	public void ibHasPreTreatTest() {
		LidModel model = new LidModel();
		model.setIbHasPreTreat(true);
		assertEquals(true,model.getIbHasPreTreat());
		
		model.setIbHasPreTreat(false);
		assertEquals(false,model.getIbHasPreTreat());
	}
	
	@Test
	public void ppPaveHeightTest() {
		LidModel model = new LidModel();
		model.setPpPaveHeight(testData);
		assertEquals(testData,model.getPpPaveHeight());
	}
	
	@Test
	public void ppPaveVoidTest() {
		LidModel model = new LidModel();
		model.setPpPaveVoid(testData);
		assertEquals(testData,model.getPpPaveVoid());
	}
	
	@Test
	public void ppDrainHeightTest() {
		LidModel model = new LidModel();
		model.setPpDrainHeight(testData);
		assertEquals(testData,model.getPpDrainHeight());
	}
	
	@Test
	public void ppDrainVoidTest() {
		LidModel model = new LidModel();
		model.setPpDrainVoid(testData);
		assertEquals(testData,model.getPpDrainVoid());
	}
	
	@Test
	public void ppCatureTest() {
		LidModel model = new LidModel();
		model.setPpCapture(testData);
		assertEquals(testData,model.getPpCapture());
	}
	
	@Test
	public void ppHasPreTreatTest() {
		LidModel model = new LidModel();
		model.setPpHasPreTreat(true);
		assertEquals(true,model.getPpHasPreTreat());
		
		model.setPpHasPreTreat(false);
		assertEquals(false,model.getPpHasPreTreat());
	}
}	