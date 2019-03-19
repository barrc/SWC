package gov.epa.stormwater.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseModelTest {


	@Test
	public void errorMessageTest() {
		String errorMessage="Error Message";
		BaseModel bm = new BaseModel();
		bm.setErrorMessage(errorMessage);
		assertEquals(errorMessage,bm.getErrorMessage());
	}

}
