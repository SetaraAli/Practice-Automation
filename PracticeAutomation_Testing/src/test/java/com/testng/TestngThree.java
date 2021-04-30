package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngThree {
	// for  check fail test need to go test-output folder and run the fail-testng.xml
	//then right click run as testng
	@Test
	public void testThree() {
		Assert.assertTrue(false);
		System.out.println("test will fail");
	}


}
