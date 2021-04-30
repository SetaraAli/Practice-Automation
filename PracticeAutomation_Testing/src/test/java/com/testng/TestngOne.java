package com.testng;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngOne {
	@Test
	public void testOne() {
		Assert.assertTrue(true);
		System.out.println("test will pass");
	}

}
