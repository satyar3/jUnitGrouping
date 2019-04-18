package jUnitGrouping.testsets;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import jUnitGrouping.marker.RegressionSet;
import jUnitGrouping.pages.Page2;

public class TestPage2 {

	Page2 pg2;
	
	@Before
	public void setUp()
	{
		pg2 = new Page2();
	}
	@Test
	@Category({RegressionSet.class})
	public void testPage2()
	{
		pg2.page2();
	}
}
