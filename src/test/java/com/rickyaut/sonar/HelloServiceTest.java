package com.rickyaut.sonar;


import org.junit.Assert;
import org.junit.Test;

public class HelloServiceTest {

	@Test
	public void test() {
		Assert.assertEquals("Hello", new HelloService().getMessage());
	}

}
