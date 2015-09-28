package jorge.rabanos.ecp1.miw.upm.es.ECP1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class C11Test extends TestCase {
	private C11 c11;
	
	@Before
	public void setUp() {
		c11 = new C11();
	}
	
	@Test
	public void testM1() {
		assertEquals("m1", c11.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", c11.m2());
	}

}
