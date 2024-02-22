package com.calci;

import org.junit.Test;

import junit.framework.Assert;


public class MyTest {
Calci calci=new Calci(10,5);

@Test
public void myAdd()
{
	int expected=15;
	Assert.assertEquals(expected, calci.add());
}		
}