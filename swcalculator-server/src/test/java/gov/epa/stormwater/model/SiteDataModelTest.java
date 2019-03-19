package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SiteDataModelTest {

	private Integer testInteger;
	private Double testDouble;
	private String testString;

	private LidModel lidModel;

	@Before
	public void initialize() {
		testInteger = 1;
		testDouble = 1.0;
		testString = "ERG SWC String";
	}

	@Test
	public void climateScenarioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setClimateScenario(testInteger);
		assertEquals(testInteger, model.getClimateScenario());
	}

	@Test
	public void climateYearTest() {
		SiteDataModel model = new SiteDataModel();
		model.setClimateYear(testInteger);
		assertEquals(testInteger, model.getClimateYear());
	}

	@Test
	public void cmbCostRegionTest() {
		SiteDataModel model = new SiteDataModel();
		model.setCmbCostRegion(testInteger);
		assertEquals(testInteger, model.getCmbCostRegion());
	}

	@Test
	public void disconnectionCaptureRatioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setDisconnectionCaptureRatio(testInteger);
		assertEquals(testInteger, model.getDisconnectionCaptureRatio());
	}

	@Test
	public void evapSourceTest() {
		SiteDataModel model = new SiteDataModel();
		model.setEvapSource(testInteger);
		assertEquals(testInteger, model.getEvapSource());
	}

	@Test
	public void greenRoofSoilKsatTest() {
		SiteDataModel model = new SiteDataModel();
		model.setGreenRoofSoilKsat(testInteger);
		assertEquals(testInteger, model.getGreenRoofSoilKsat());
	}

	@Test
	public void greenRoofSoilThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setGreenRoofSoilThickness(testInteger);
		assertEquals(testInteger, model.getGreenRoofSoilThickness());
	}

	@Test
	public void harvestingCisternNumberTest() {
		SiteDataModel model = new SiteDataModel();
		model.setHarvestingCisternNumber(testInteger);
		assertEquals(testInteger, model.getHarvestingCisternNumber());
	}

	@Test
	public void harvestingCisternSizeTest() {
		SiteDataModel model = new SiteDataModel();
		model.setHarvestingCisternSize(testInteger);
		assertEquals(testInteger, model.getHarvestingCisternSize());
	}

	@Test
	public void harvestingEmptyingRateTest() {
		SiteDataModel model = new SiteDataModel();
		model.setHarvestingEmptyingRate(testInteger);
		assertEquals(testInteger, model.getHarvestingEmptyingRate());
	}

	@Test
	public void infilBasinBasinDepthTest() {
		SiteDataModel model = new SiteDataModel();
		model.setInfilBasinBasinDepth(testInteger);
		assertEquals(testInteger, model.getInfilBasinBasinDepth());
	}

	@Test
	public void infilBasinCaptureRatioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setInfilBasinCaptureRatio(testInteger);
		assertEquals(testInteger, model.getInfilBasinCaptureRatio());
	}

	@Test
	public void porousPavementCaptureRatioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPorousPavementCaptureRatio(testInteger);
		assertEquals(testInteger, model.getPorousPavementCaptureRatio());
	}

	@Test
	public void porousPavementGravelThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPorousPavementGravelThickness(testInteger);
		assertEquals(testInteger, model.getPorousPavementGravelThickness());
	}

	@Test
	public void porousPavementPavementThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPorousPavementPavementThickness(testInteger);
		assertEquals(testInteger, model.getPorousPavementPavementThickness());
	}

	@Test
	public void rainGardensCaptureRatioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRainGardensCaptureRatio(testInteger);
		assertEquals(testInteger, model.getRainGardensCaptureRatio());
	}

	@Test
	public void rainGardensPondingHeightTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRainGardensPondingHeight(testInteger);
		assertEquals(testInteger, model.getRainGardensPondingHeight());
	}

	@Test
	public void rainGardensSoilKsatTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRainGardensSoilKsat(testInteger);
		assertEquals(testInteger, model.getRainGardensSoilKsat());
	}

	@Test
	public void rainGardensSoilThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRainGardensSoilThickness(testInteger);
		assertEquals(testInteger, model.getRainGardensSoilThickness());
	}

	@Test
	public void rainSourceTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRainSource(testInteger);
		assertEquals(testInteger, model.getRainSource());
	}

	@Test
	public void streetPlantersGravelThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setStreetPlantersGravelThickness(testInteger);
		assertEquals(testInteger, model.getStreetPlantersGravelThickness());
	}

	@Test
	public void streetPlantersCaptureRatioTest() {
		SiteDataModel model = new SiteDataModel();
		model.setStreetPlantersCaptureRatio(testInteger);
		assertEquals(testInteger, model.getStreetPlantersCaptureRatio());
	}

	@Test
	public void streetPlantersPondingHeightTest() {
		SiteDataModel model = new SiteDataModel();
		model.setStreetPlantersPondingHeight(testInteger);
		assertEquals(testInteger, model.getStreetPlantersPondingHeight());
	}

	@Test
	public void streetPlantersSoilKsatTest() {
		SiteDataModel model = new SiteDataModel();
		model.setStreetPlantersSoilKsat(testInteger);
		assertEquals(testInteger, model.getStreetPlantersSoilKsat());
	}

	@Test
	public void streetPlantersSoilThicknessTest() {
		SiteDataModel model = new SiteDataModel();
		model.setStreetPlantersSoilThickness(testInteger);
		assertEquals(testInteger, model.getStreetPlantersSoilThickness());
	}

	@Test
	public void surfaceSlopeTest() {
		SiteDataModel model = new SiteDataModel();
		model.setSurfaceSlope(testInteger);
		assertEquals(testInteger, model.getSurfaceSlope());
	}

	@Test
	public void yearsAnalyzedTest() {
		SiteDataModel model = new SiteDataModel();
		model.setYearsAnalyzed(testInteger);
		assertEquals(testInteger, model.getYearsAnalyzed());
	}

	@Test
	public void designStormTest() {
		SiteDataModel model = new SiteDataModel();
		model.setDesignStorm(testDouble);
		assertEquals(testDouble, model.getDesignStorm());
	}

	@Test
	public void percDesertTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercDesert(testDouble);
		assertEquals(testDouble, model.getPercDesert());
	}

	@Test
	public void percDisconnectionTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercDisconnection(testDouble);
		assertEquals(testDouble, model.getPercDisconnection());
	}

	@Test
	public void percForestTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercForest(testDouble);
		assertEquals(testDouble, model.getPercForest());
	}

	@Test
	public void percGreenRoofsTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercGreenRoofs(testDouble);
		assertEquals(testDouble, model.getPercGreenRoofs());
	}

	@Test
	public void percHarvestingTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercHarvesting(testDouble);
		assertEquals(testDouble, model.getPercHarvesting());
	}

	@Test
	public void percImperviousTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercImpervious(testDouble);
		assertEquals(testDouble, model.getPercImpervious());
	}

	@Test
	public void percInfilBasinTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercInfilBasin(testDouble);
		assertEquals(testDouble, model.getPercInfilBasin());
	}

	@Test
	public void percLawnTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercLawn(testDouble);
		assertEquals(testDouble, model.getPercLawn());
	}

	@Test
	public void percMeadowTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercMeadow(testDouble);
		assertEquals(testDouble, model.getPercMeadow());
	}

	@Test
	public void percPorousPavementTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercPorousPavement(testDouble);
		assertEquals(testDouble, model.getPercPorousPavement());
	}

	@Test
	public void percRainGardensTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercRainGardens(testDouble);
		assertEquals(testDouble, model.getPercRainGardens());
	}

	@Test
	public void percStreetPlantersTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPercStreetPlanters(testDouble);
		assertEquals(testDouble, model.getPercStreetPlanters());
	}

	@Test
	public void runoffThresholdTest() {
		SiteDataModel model = new SiteDataModel();
		model.setRunoffThreshold(testDouble);
		assertEquals(testDouble, model.getRunoffThreshold());
	}

	@Test
	public void siteAreaTest() {
		SiteDataModel model = new SiteDataModel();
		model.setSiteArea(testDouble);
		assertEquals(testDouble, model.getSiteArea());
	}

	@Test
	public void soilKsatTest() {
		SiteDataModel model = new SiteDataModel();
		model.setSoilKsat(testDouble);
		assertEquals(testDouble, model.getSoilKsat());
	}

	@Test
	public void tbRegMultiplierTest() {
		SiteDataModel model = new SiteDataModel();
		model.setTbRegMultiplier(testDouble);
		assertEquals(testDouble, model.getTbRegMultiplier());
	}

	@Test
	public void evapStationIDTest() {
		SiteDataModel model = new SiteDataModel();
		model.setEvapStationID(testString);
		assertEquals(testString, model.getEvapStationID());
	}

	@Test
	public void hydSoilGroupTest() {
		SiteDataModel model = new SiteDataModel();
		model.setHydSoilGroup(testString);
		assertEquals(testString, model.getHydSoilGroup());
	}

	@Test
	public void precStationIDTest() {
		SiteDataModel model = new SiteDataModel();
		model.setPrecStationID(testString);
		assertEquals(testString, model.getPrecStationID());
	}

	@Test
	public void siteLocationTest() {
		SiteDataModel model = new SiteDataModel();
		model.setSiteLocation(testString);
		assertEquals(testString, model.getSiteLocation());
	}

	@Test
	public void siteNameTest() {
		SiteDataModel model = new SiteDataModel();
		model.setSiteName(testString);
		assertEquals(testString, model.getSiteName());
	}

	@Test
	public void versionTest() {
		SiteDataModel model = new SiteDataModel();
		model.setVersion(testString);
		assertEquals(testString, model.getVersion());
	}

	@Test
	public void ibPretreatmentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setIbPretreatment(true);
		assertEquals(true, model.getIbPretreatment());

		model.setIbPretreatment(false);
		assertEquals(false, model.getIbPretreatment());
	}

	@Test
	public void ignoreConsecStormsTest() {
		SiteDataModel model = new SiteDataModel();

		model.setIgnoreConsecStorms(true);
		assertEquals(true, model.getIgnoreConsecStorms());

		model.setIgnoreConsecStorms(false);
		assertEquals(false, model.getIgnoreConsecStorms());
	}

	@Test
	public void isHmsTest() {
		SiteDataModel model = new SiteDataModel();

		model.setIsHms(true);
		assertEquals(true, model.getIsHms());

		model.setIsHms(false);
		assertEquals(false, model.getIsHms());
	}

	@Test
	public void isNewDevelopmentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setIsNewDevelopment(true);
		assertEquals(true, model.getIsNewDevelopment());

		model.setIsNewDevelopment(false);
		assertEquals(false, model.getIsNewDevelopment());
	}

	@Test
	public void isReDevelopmentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setIsReDevelopment(true);
		assertEquals(true, model.getIsReDevelopment());

		model.setIsReDevelopment(false);
		assertEquals(false, model.getIsReDevelopment());
	}

	@Test
	public void ppPretreatmentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setPpPretreatment(true);
		assertEquals(true, model.getPpPretreatment());

		model.setPpPretreatment(false);
		assertEquals(false, model.getPpPretreatment());
	}

	@Test
	public void rgPretreatmentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setRgPretreatment(true);
		assertEquals(true, model.getRgPretreatment());

		model.setRgPretreatment(false);
		assertEquals(false, model.getRgPretreatment());
	}

	@Test
	public void siteSuitabilityExcellentTest() {
		SiteDataModel model = new SiteDataModel();

		model.setSiteSuitabilityExcellent(true);
		assertEquals(true, model.getSiteSuitabilityExcellent());

		model.setSiteSuitabilityExcellent(false);
		assertEquals(false, model.getSiteSuitabilityExcellent());
	}

	@Test
	public void siteSuitabilityModerateTest() {
		SiteDataModel model = new SiteDataModel();

		model.setSiteSuitabilityModerate(true);
		assertEquals(true, model.getSiteSuitabilityModerate());

		model.setSiteSuitabilityModerate(false);
		assertEquals(false, model.getSiteSuitabilityModerate());
	}

	@Test
	public void siteSuitabilityPoorTest() {
		SiteDataModel model = new SiteDataModel();

		model.setSiteSuitabilityPoor(true);
		assertEquals(true, model.getSiteSuitabilityPoor());

		model.setSiteSuitabilityPoor(false);
		assertEquals(false, model.getSiteSuitabilityPoor());
	}

	@Test
	public void lidModelTest() {
		SiteDataModel model = new SiteDataModel();
		model.setLidModel(lidModel);
		assertEquals(lidModel, model.getLidModel());
	}
}
