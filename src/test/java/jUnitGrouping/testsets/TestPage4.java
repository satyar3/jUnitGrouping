package jUnitGrouping.testsets;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import jUnitGrouping.marker.NewFeatureSet;
import jUnitGrouping.pages.Page4;

public class TestPage4 {
	
	Page4 pg4;
	
	@Before
	public void setUp()
	{
		pg4 = new Page4();
	}
	@Test
	@Category({NewFeatureSet.class})
	public void testPage4()
	{
		pg4.page4();
	}
}
