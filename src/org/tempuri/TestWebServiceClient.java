package org.tempuri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWebServiceClient {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFecha() {

		// TODO Llamar al metodo "fecha" del WebService
		try {
			WSMeteorologicoSoapProxy wsClient = new WSMeteorologicoSoapProxy();

			String responseSoap = wsClient.fecha();
			assertEquals(responseSoap, "Lunes 26 de Octubre del 2015");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
