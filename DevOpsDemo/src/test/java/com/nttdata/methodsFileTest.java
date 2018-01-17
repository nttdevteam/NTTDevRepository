package com.nttdata;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class methodsFileTest {
	
	@InjectMocks
	private methodsFile methFile;

	@Test
	public void testAddition() {
		int a=4;
		int b=2;
		methFile.addition(a, b);
		Assert.assertNotNull(methFile);
		
	}

	@Test
	public void testSubtraction() {
		int a=4;
		int b=2;
		methFile.subtraction(a, b);
		Assert.assertNotNull(methFile);
		
	}

	@Test
	public void testMultiplication() {
		int a=4;
		int b=2;
		methFile.multiplication(a, b);
		Assert.assertNotNull(methFile);
	}

	@Test
	public void testDivision() {
		int a=4;
		int b=2;
		methFile.division(a, b);
		Assert.assertNotNull(methFile);
	}

}
