package jUnitGrouping.testsets;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import jUnitGrouping.marker.RegressionSet;
import jUnitGrouping.marker.SanitySet;
import jUnitGrouping.pages.Page1;

public class TestPage1 {

	Page1 pg1;
	
	@Before
	public void setUp()
	{
		pg1 = new Page1();
	}
	@Test
	@Category({SanitySet.class,RegressionSet.class})
	public void testPage1()
	{
		pg1.page1();
	}
}
