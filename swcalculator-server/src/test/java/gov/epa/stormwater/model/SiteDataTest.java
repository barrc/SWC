package gov.epa.stormwater.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SiteDataTest {

	private Double testDouble;
	private Integer testInteger;
	private String testString;
	private Long testLong;
	private Double[] testDoubleArray;

	private ClimateModel climateModel;
	private LidModel lidModel;
	private RunoffModel runoffModel;
	private XEventModel xEventModel;

	@Before
	public void initialize() {
		testDouble = new Double(1.0);
		testInteger = 1;
		testString = "ERG SWC String";
		testLong = 123456789l;

		testDoubleArray = new Double[] { 1.0, 2.0, 3.0 };

		climateModel = new ClimateModel();
		lidModel = new LidModel();
		runoffModel = new RunoffModel();
		xEventModel = new XEventModel();
	}

	@Test
	public void area1Test() {
		SiteData model = new SiteData();
		model.setArea1(testDouble);
		assertEquals(testDouble, model.getArea1());
	}

	@Test
	public void area2Test() {
		SiteData model = new SiteData();
		model.setArea2(testDouble);
		assertEquals(testDouble, model.getArea2());
	}

	@Test
	public void area3Test() {
		SiteData model = new SiteData();
		model.setArea3(testDouble);
		assertEquals(testDouble, model.getArea3());
	}

	@Test
	public void area4Test() {
		SiteData model = new SiteData();
		model.setArea4(testDouble);
		assertEquals(testDouble, model.getArea4());
	}

	@Test
	public void fracGreenRoofTest() {
		SiteData model = new SiteData();
		model.setFracGreenRoof(testDouble);
		assertEquals(testDouble, model.getFracGreenRoof());
	}

	@Test
	public void fracImpDisconTest() {
		SiteData model = new SiteData();
		model.setFracImpDiscon(testDouble);
		assertEquals(testDouble, model.getFracImpDiscon());
	}

	@Test
	public void fracInfilBasinTest() {
		SiteData model = new SiteData();
		model.setFracInfilBasin(testDouble);
		assertEquals(testDouble, model.getFracInfilBasin());
	}

	@Test
	public void fracPorousPaveTest() {
		SiteData model = new SiteData();
		model.setFracPorousPave(testDouble);
		assertEquals(testDouble, model.getFracPorousPave());
	}

	@Test
	public void fracRainGardenTest() {
		SiteData model = new SiteData();
		model.setFracRainGarden(testDouble);
		assertEquals(testDouble, model.getFracRainGarden());
	}

	@Test
	public void fracImpervTest() {
		SiteData model = new SiteData();
		model.setFracImperv(testDouble);
		assertEquals(testDouble, model.getFracImperv());
	}

	@Test
	public void fracRainHarvestTest() {
		SiteData model = new SiteData();
		model.setFracRainHarvest(testDouble);
		assertEquals(testDouble, model.getFracRainHarvest());
	}

	@Test
	public void fracStreetPlanterTest() {
		SiteData model = new SiteData();
		model.setFracStreetPlanter(testDouble);
		assertEquals(testDouble, model.getFracStreetPlanter());
	}

	@Test
	public void grAreaTest() {
		SiteData model = new SiteData();
		model.setGrArea(testDouble);
		assertEquals(testDouble, model.getGrArea());
	}

	@Test
	public void ibImpervAreaTest() {
		SiteData model = new SiteData();
		model.setIbImpervArea(testDouble);
		assertEquals(testDouble, model.getIbImpervArea());
	}

	@Test
	public void ibPervAreaTest() {
		SiteData model = new SiteData();
		model.setIbPervArea(testDouble);
		assertEquals(testDouble, model.getIbPervArea());
	}

	@Test
	public void idImpervAreaTest() {
		SiteData model = new SiteData();
		model.setIdImpervArea(testDouble);
		assertEquals(testDouble, model.getIdImpervArea());
	}

	@Test
	public void idPervAreaTest() {
		SiteData model = new SiteData();
		model.setIdPervArea(testDouble);
		assertEquals(testDouble, model.getIdPervArea());
	}

	@Test
	public void impervArea1Test() {
		SiteData model = new SiteData();
		model.setImpervArea1(testDouble);
		assertEquals(testDouble, model.getImpervArea1());
	}

	@Test
	public void pathLengthTest() {
		SiteData model = new SiteData();
		model.setPathLength(testDouble);
		assertEquals(testDouble, model.getPathLength());
	}

	@Test
	public void pervArea1Test() {
		SiteData model = new SiteData();
		model.setPervArea1(testDouble);
		assertEquals(testDouble, model.getPervArea1());
	}

	@Test
	public void ppAreaTest() {
		SiteData model = new SiteData();
		model.setPpArea(testDouble);
		assertEquals(testDouble, model.getPpArea());
	}

	@Test
	public void rgAreaTest() {
		SiteData model = new SiteData();
		model.setRgArea(testDouble);
		assertEquals(testDouble, model.getRgArea());
	}

	@Test
	public void rRhImpervAreaTest() {
		SiteData model = new SiteData();
		model.setRhImpervArea(testDouble);
		assertEquals(testDouble, model.getRhImpervArea());
	}

	@Test
	public void totalLIDAreaFracTest() {
		SiteData model = new SiteData();
		model.setTotalLIDAreaFrac(testDouble);
		assertEquals(testDouble, model.getTotalLIDAreaFrac());
	}

	@Test
	public void spArea1Test() {
		SiteData model = new SiteData();
		model.setSpArea(testDouble);
		assertEquals(testDouble, model.getSpArea());
	}

	@Test
	public void endYearTest() {
		SiteData model = new SiteData();
		model.setEndYear(testInteger);
		assertEquals(testInteger, model.getEndYear());
	}

	@Test
	public void errorCodeTest() {
		SiteData model = new SiteData();
		model.setErrorCode(testInteger);
		assertEquals(testInteger, model.getErrorCode());
	}

	@Test
	public void siteSuitabilityTest() {
		SiteData model = new SiteData();
		model.setSiteSuitability(testInteger);
		assertEquals(testInteger, model.getSiteSuitability());
	}

	@Test
	public void slopeIndexTest() {
		SiteData model = new SiteData();
		model.setSlopeIndex(testInteger);
		assertEquals(testInteger, model.getSlopeIndex());
	}

	@Test
	public void soilGroupTest() {
		SiteData model = new SiteData();
		model.setSoilGroup(testInteger);
		assertEquals(testInteger, model.getSoilGroup());
	}

	@Test
	public void startYearTest() {
		SiteData model = new SiteData();
		model.setStartYear(testInteger);
		assertEquals(testInteger, model.getStartYear());
	}

	@Test
	public void inpFileTest() {
		SiteData model = new SiteData();
		model.setInpFile(testString);
		assertEquals(testString, model.getInpFile());
	}

	@Test
	public void inpFileBaseTest() {
		SiteData model = new SiteData();
		model.setInpFileBase(testString);
		assertEquals(testString, model.getInpFileBase());
	}

	@Test
	public void nameTest() {
		SiteData model = new SiteData();
		model.setName(testString);
		assertEquals(testString, model.getName());
	}

	@Test
	public void outFileTest() {
		SiteData model = new SiteData();
		model.setOutFile(testString);
		assertEquals(testString, model.getOutFile());
	}

	@Test
	public void rainFileTest() {
		SiteData model = new SiteData();
		model.setRainFile(testString);
		assertEquals(testString, model.getRainFile());
	}

	@Test
	public void rptFileTest() {
		SiteData model = new SiteData();
		model.setRptFile(testString);
		assertEquals(testString, model.getRptFile());
	}

	@Test
	public void includePostDevTest() {
		SiteData model = new SiteData();

		model.setIncludePostDev(true);
		assertEquals(true, model.getIncludePostDev());

		model.setIncludePostDev(false);
		assertEquals(false, model.getIncludePostDev());
	}

	@Test
	public void timeStampTest() {
		SiteData model = new SiteData();
		model.setTimeStamp(testLong);
		assertEquals(testLong, model.getTimeStamp());
	}

	@Test
	public void landCoverTest() {
		SiteData model = new SiteData();
		model.setLandCover(testDoubleArray);
		assertArrayEquals(testDoubleArray, model.getLandCover());
	}

	@Test
	public void climateModelTest() {
		SiteData model = new SiteData();
		model.setClimateModel(climateModel);
		assertEquals(climateModel, model.getClimateModel());
	}

	@Test
	public void lidModelTest() {
		SiteData model = new SiteData();
		model.setLidModel(lidModel);
		assertEquals(lidModel, model.getLidModel());
	}

	@Test
	public void runoffModelTest() {
		SiteData model = new SiteData();
		model.setRunoffModel(runoffModel);
		assertEquals(runoffModel, model.getRunoffModel());
	}

	@Test
	public void xEventModelTest() {
		SiteData model = new SiteData();
		model.setXEventModel(xEventModel);
		assertEquals(xEventModel, model.getXEventModel());
	}
}
