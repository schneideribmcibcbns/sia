package com.manning.sia.ch03.s2.conditionalbeans;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class MagicExistsTest {

	@Autowired
	private ApplicationContext context;

	@BeforeClass
	public static void setProperties() {
		System.setProperty("magic", "whatever");
	}
	
	@Test
	public void shouldHaveMagicBean() {
		assertTrue(context.containsBean("magicBean"));
	}
	
}
