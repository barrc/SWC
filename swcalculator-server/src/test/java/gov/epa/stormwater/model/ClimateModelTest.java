package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ClimateModelTest {

	List<Double> listDouble =new ArrayList<>(Arrays.asList(1.23, 2.34, 3.45, 4.56));

	/*
	 * 
	 */
	@Test
	public void rainDelta1Test() {
		ClimateModel model =new ClimateModel();
		model.setRainDelta1(listDouble);
		assertEquals(listDouble, model.getRainDelta1());
	}
	
	@Test
	public void rainDelta2Test() {
		ClimateModel model =new ClimateModel();
		model.setRainDelta2(listDouble);
		assertEquals(listDouble, model.getRainDelta2());
	}
	
	@Test
	public void rainDelta3Test() {
		ClimateModel model =new ClimateModel();
		model.setRainDelta3(listDouble);
		assertEquals(listDouble, model.getRainDelta3());
	}
	
	@Test
	public void evap0Test() {
		ClimateModel model =new ClimateModel();
		model.setEvap0(listDouble);
		assertEquals(listDouble, model.getEvap0());
	}
	
	@Test
	public void evap1Test() {
		ClimateModel model =new ClimateModel();
		model.setEvap1(listDouble);
		assertEquals(listDouble, model.getEvap1());
	}
	
	@Test
	public void evap2Test() {
		ClimateModel model =new ClimateModel();
		model.setEvap2(listDouble);
		assertEquals(listDouble, model.getEvap2());
	}
	
	@Test
	public void evap3Test() {
		ClimateModel model =new ClimateModel();
		model.setEvap3(listDouble);
		assertEquals(listDouble, model.getEvap3());
	}

	@Test
	public void maxRain1Test() {
		ClimateModel model =new ClimateModel();
		model.setMaxRain1(listDouble);
		assertEquals(listDouble, model.getMaxRain1());
	}
	
	@Test
	public void maxRain2Test() {
		ClimateModel model =new ClimateModel();
		model.setMaxRain2(listDouble);
		assertEquals(listDouble, model.getMaxRain2());
	}
	
	@Test
	public void maxRain3Test() {
		ClimateModel model =new ClimateModel();
		model.setMaxRain3(listDouble);
		assertEquals(listDouble, model.getMaxRain3());
	}
	
	@Test
	public void maxRainHistoricalTest() {
		ClimateModel model =new ClimateModel();
		model.setmaxRainHistorical(listDouble);
		assertEquals(listDouble, model.getmaxRainHistorical());
	}

}
