package gov.epa.stormwater.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RunofModelTest {

	private Double testDouble;
	private Long testLong;
	private Integer testInteger;
	private Double[] testDoubleArray;
	private Integer[] testIntegerArray;
	private List<XYPairModel> testXYPairModelArray;
	private List<Double> testDoubleList;

	@Before
	public void initialize() {
		testDouble = new Double(0);
		testLong = 0l;
		testInteger = 0;
		testDoubleArray = new Double[] { 1.0, 2.0, 3.0 };
		testIntegerArray = new Integer[] { 1, 2, 3 };

		testXYPairModelArray = new ArrayList<>();
		testXYPairModelArray.add(new XYPairModel(1.0, 2.0));
		testXYPairModelArray.add(new XYPairModel(3.0, 4.0));
		testXYPairModelArray.add(new XYPairModel(5.0, 6.0));

		testDoubleList = new ArrayList<>();
		testDoubleList.add(new Double(1.0));
		testDoubleList.add(new Double(2.0));
		testDoubleList.add(new Double(3.0));
	}

	@Test
	public void annualRainfallTest() {
		RunoffModel rm = new RunoffModel();
		rm.setAnnualRainfall(testDouble);
		assertEquals(testDouble, rm.getAnnualRainfall());
	}

	@Test
	public void annualRunoffTest() {
		RunoffModel rm = new RunoffModel();
		rm.setAnnualRunoff(testDouble);
		assertEquals(testDouble, rm.getAnnualRunoff());
	}

	@Test
	public void annualInfilTest() {
		RunoffModel rm = new RunoffModel();
		rm.setAnnualInfil(testDouble);
		assertEquals(testDouble, rm.getAnnualInfil());
	}

	@Test
	public void annualEvapTest() {
		RunoffModel rm = new RunoffModel();
		rm.setAnnualEvap(testDouble);
		assertEquals(testDouble, rm.getAnnualEvap());
	}

	@Test
	public void offsetTest() {
		RunoffModel rm = new RunoffModel();
		rm.setOffset(testLong);
		assertEquals(testLong, rm.getOffset());
	}

	@Test
	public void totalPeriodsTest() {
		RunoffModel rm = new RunoffModel();
		rm.setTotalPeriods(testLong);
		assertEquals(testLong, rm.getTotalPeriods());
	}

	@Test
	public void totalDaysTest() {
		RunoffModel rm = new RunoffModel();
		rm.setTotalDays(testLong);
		assertEquals(testLong, rm.getTotalDays());
	}

	@Test
	public void rptStepTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRptStep(testLong);
		assertEquals(testLong, rm.getRptStep());
	}

	@Test
	public void totalRainfallTest() {
		RunoffModel rm = new RunoffModel();
		rm.setTotalRainfall(testDouble);
		assertEquals(testDouble, rm.getTotalRainfall());
	}

	@Test
	public void totalRunoffTest() {
		RunoffModel rm = new RunoffModel();
		rm.setTotalRunoff(testDouble);
		assertEquals(testDouble, rm.getTotalRunoff());
	}

	@Test
	public void minRunoffDepthTest() {
		RunoffModel rm = new RunoffModel();
		rm.setMinRunoffDepth(testDouble);
		assertEquals(testDouble, rm.getMinRunoffDepth());
	}

	@Test
	public void maxCaptureDepthTest() {
		RunoffModel rm = new RunoffModel();
		rm.setMaxCaptureDepth(testDouble);
		assertEquals(testDouble, rm.getMaxCaptureDepth());
	}

	@Test
	public void maxRetentionTest() {
		RunoffModel rm = new RunoffModel();
		rm.setMaxRetention(testDouble);
		assertEquals(testDouble, rm.getMaxRetention());
	}

	@Test
	public void captureRatioTest() {
		RunoffModel rm = new RunoffModel();
		rm.setCaptureRatio(testDouble);
		assertEquals(testDouble, rm.getCaptureRatio());
	}

	@Test
	public void captureCoeffTest() {
		RunoffModel rm = new RunoffModel();
		rm.setCaptureCoeff(testDouble);
		assertEquals(testDouble, rm.getCaptureCoeff());
	}

	@Test
	public void rainDayCountTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRainDayCount(testInteger);
		assertEquals(testInteger, rm.getRainDayCount());
	}

	@Test
	public void runoffDayCountTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffDayCount(testInteger);
		assertEquals(testInteger, rm.getRunoffDayCount());
	}

	@Test
	public void eventCountStrTest() {
		String testString = "Event Count Test";
		RunoffModel rm = new RunoffModel();
		rm.setEventCountStr(testString);
		assertEquals(testString, rm.getEventCountStr());
	}

	@Test
	public void rainDepthsTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRainDepths(testDoubleArray);
		assertArrayEquals(testDoubleArray, rm.getRainDepths());
	}

	@Test
	public void runoffDepthsTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffDepths(testDoubleArray);
		assertArrayEquals(testDoubleArray, rm.getRunoffDepths());
	}

	@Test
	public void dryDayTest() {
		RunoffModel rm = new RunoffModel();
		rm.setDryDays(testIntegerArray);
		assertArrayEquals(testIntegerArray, rm.getDryDays());
	}

	@Test
	public void RainIndexTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRainIndex(testIntegerArray);
		assertArrayEquals(testIntegerArray, rm.getRainIndex());
	}

	@Test
	public void RainRunoffListTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRainRunoffList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRainRunoffList().toArray());
	}

	@Test
	public void runoffPcntListTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffPcntList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRunoffPcntList().toArray());
	}

	@Test
	public void retentionPcntListListTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRetentionPcntList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRetentionPcntList().toArray());
	}

	@Test
	public void runoffFreqList() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffFreqList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRunoffFreqList().toArray());
	}

	@Test
	public void rainFreqListtTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRainFreqList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRainFreqList().toArray());
	}

	@Test
	public void runoffFreqListTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffFreqList(testXYPairModelArray);
		assertArrayEquals(testXYPairModelArray.toArray(), rm.getRunoffFreqList().toArray());
	}

	@Test
	public void runoffStatsTest() {
		RunoffModel rm = new RunoffModel();
		rm.setRunoffStats(testDoubleList);
		assertArrayEquals(testDoubleList.toArray(), rm.getRunoffStats().toArray());
	}
}
