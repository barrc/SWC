package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuccessResponseModelTest {

	@Test
	public void successMessageTest() {
		String successMessage="Success";
		SuccessResponseModel model = new SuccessResponseModel();
		model.setMessage(successMessage);
		assertEquals(successMessage,model.getMessage());
	}
	
	@Test
	public void successMessageControllerTest() {
		String successMessage="Success";
		SuccessResponseModel model = new SuccessResponseModel(successMessage);
		assertEquals(successMessage,model.getMessage());
	}
}
