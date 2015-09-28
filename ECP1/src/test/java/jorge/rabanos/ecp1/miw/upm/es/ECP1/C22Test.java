package jorge.rabanos.ecp1.miw.upm.es.ECP1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

	private C22 c22;
	
	@Before
	public void setUp() {
		c22 = new C22();
	}
	
	@Test
	public void testM1() {
		assertEquals("mA", c22.mA());
	}

}
