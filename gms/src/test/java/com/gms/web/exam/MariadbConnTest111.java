package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariadbConnTest111 {

	@Test
	public void test() {
		MariadbConn m = new MariadbConn();
		assertEquals("hong",m.exam());
	}

}