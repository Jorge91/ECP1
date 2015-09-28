package jorge.rabanos.ecp1.miw.upm.es.ECP1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

private C32 c32;
	
	@Before
	public void setUp() {
		c32 = new C32();
	}
	
	@Test
	public void testM1() {
		assertEquals("mA", c32.mA());
	}


}
