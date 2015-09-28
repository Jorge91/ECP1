package jorge.rabanos.ecp1.miw.upm.es.ECP1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

private C12 c12;
	
	@Before
	public void setUp() {
		c12 = new C12();
	}
	
	@Test
	public void testM1() {
		assertEquals("mA", c12.mA());
	}
	

}
