package jorge.rabanos.ecp1.miw.upm.es.ECP1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

private C52 c52;
	
	@Before
	public void setUp() {
		c52 = new C52();
	}
	
	@Test
	public void testM1() {
		assertEquals("mA", c52.mA());
	}


}
