package jUnitGrouping.testsets;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import jUnitGrouping.marker.SanitySet;
import jUnitGrouping.pages.Page5;

public class TestPage5 {
	
	Page5 pg5;
	
	@Before
	public void setUp()
	{
		pg5 = new Page5();
	}
	@Test
	@Category({SanitySet.class})
	public void testPage5()
	{
		pg5.page5();
	}
}
