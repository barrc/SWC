package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ErrorResponseModelTest {

	@Test
	public void errorCodeTest() {
		Integer errorCode=100;
		ErrorResponseModel model = new ErrorResponseModel();
		model.setErrorCode(errorCode);
		assertEquals(errorCode, model.getErrorCode());
	}
	
	@Test
	public void errorDescriptionTest() {
		String errorDescription="Description";
		ErrorResponseModel model = new ErrorResponseModel();
		model.setErrorDesription(errorDescription);
		assertEquals(errorDescription,model.getErrorDesription());
	}
	
	@Test
	public void errorMessageTest() {
		String errorMessage="Error";
		ErrorResponseModel model = new ErrorResponseModel();
		model.setErrorMessage(errorMessage);
		assertEquals(errorMessage,model.getErrorMessage());
	}
}
