package gov.epa.stormwater.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class XEventModelTest {

	private Double testDouble;
	private Double[] testDoubleArray;
	private List<Double> testDoubleList;

	@Before
	public void initialize() {

		testDouble = new Double(0);

		testDoubleArray = new Double[] { 1.0, 2.0, 3.0 };

		testDoubleList = new ArrayList<>();
		testDoubleList.add(new Double(1.0));
		testDoubleList.add(new Double(2.0));
		testDoubleList.add(new Double(3.0));
	}

	@Test
	public void peakRunoffOneTest() {
		XEventModel model = new XEventModel();
		model.setPeakRunoffOne(testDouble);
		assertEquals(testDouble, model.getPeakRunoffOne());
	}

	@Test
	public void peakRainfallOneTest() {
		XEventModel model = new XEventModel();
		model.setPeakRainfallOne(testDouble);
		assertEquals(testDouble, model.getPeakRainfallOne());
	}

	@Test
	public void baseExtremeRainfallListTest() {
		XEventModel model = new XEventModel();
		model.setBaseExtremeRainfallList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getBaseExtremeRainfallList().toArray());
	}

	@Test
	public void baseExtremeRunoffListTest() {
		XEventModel model = new XEventModel();
		model.setBaseExtremeRunoffList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getBaseExtremeRunoffList().toArray());
	}

	@Test
	public void basePeakRainfallListTest() {
		XEventModel model = new XEventModel();
		model.setBasePeakRainfallList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getBasePeakRainfallList().toArray());
	}

	@Test
	public void basePeakRunoffListTest() {
		XEventModel model = new XEventModel();
		model.setBasePeakRunoffList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getBasePeakRunoffList().toArray());
	}

	@Test
	public void extremeRainfallListTest() {
		XEventModel model = new XEventModel();
		model.setExtremeRainfallList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getExtremeRainfallList().toArray());
	}

	@Test
	public void extremeRunoffListTest() {
		XEventModel model = new XEventModel();
		model.setExtremeRunoffList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getExtremeRunoffList().toArray());
	}

	@Test
	public void peakRunoffListTest() {
		XEventModel model = new XEventModel();
		model.setPeakRunoffList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getPeakRunoffList().toArray());
	}

	@Test
	public void peakRainfallListTest() {
		XEventModel model = new XEventModel();
		model.setPeakRainfallList(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), model.getPeakRainfallList().toArray());
	}

	@Test
	public void peakRainfallTest() {
		XEventModel model = new XEventModel();
		model.setPeakRainfall(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getPeakRainfall());
	}

	@Test
	public void peakRunoffTest() {
		XEventModel model = new XEventModel();
		model.setPeakRunoff(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getPeakRunoff());
	}

	@Test
	public void rainfallTest() {
		XEventModel model = new XEventModel();
		model.setRainfall(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getRainfall());
	}

	@Test
	public void runoffTest() {
		XEventModel model = new XEventModel();
		model.setRunoff(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getRunoff());
	}

	@Test
	public void scsITest() {
		XEventModel model = new XEventModel();
		model.setScsI(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getScsI());
	}

	@Test
	public void scsIaTest() {
		XEventModel model = new XEventModel();
		model.setScsIa(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getScsIa());
	}

	@Test
	public void scsIITest() {
		XEventModel model = new XEventModel();
		model.setScsII(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getScsII());
	}

	@Test
	public void scsIIITest() {
		XEventModel model = new XEventModel();
		model.setScsIII(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getScsIII());
	}
}
