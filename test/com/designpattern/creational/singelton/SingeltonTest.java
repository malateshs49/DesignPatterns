package com.designpattern.creational.singelton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingeltonTest {

	@Test
	public void SingeltonUnitTest() {
		SingeltonClass single1 = SingeltonClass.getinstance();
		SingeltonClass single2 = SingeltonClass.getinstance();
		assertEquals(single1, single2);
	}
}
