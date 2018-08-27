package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gms.web.exam.MariadbConn;

public class MaridadbConnTest {

	@Test
	public void test() {
		MariadbConn m = new MariadbConn();
		assertEquals("A10", m.exam());
	}

}
