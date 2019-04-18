package jUnitGrouping.testsets;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import jUnitGrouping.marker.NewFeatureSet;
import jUnitGrouping.marker.RegressionSet;
import jUnitGrouping.marker.SanitySet;
import jUnitGrouping.pages.Page3;

public class TestPage3 {
	
	Page3 pg3;
	
	@Before
	public void setUp()
	{
		pg3 = new Page3();
	}
	@Test
	@Category({SanitySet.class, RegressionSet.class, NewFeatureSet.class})
	public void testPage3()
	{
		pg3.page3();
	}
}
