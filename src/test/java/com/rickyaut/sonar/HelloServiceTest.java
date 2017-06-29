package com.rickyaut.sonar;


import org.junit.Assert;
import org.junit.Test;

public class HelloServiceTest {

	@Test
	public void test() {
		HelloService helloService = new HelloService();
		Assert.assertEquals("Hello", helloService.getMessage());
		Assert.assertEquals("Ricky", helloService.getName());
	}

}
