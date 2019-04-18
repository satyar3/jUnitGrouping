package jUnitGrouping.runner;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import jUnitGrouping.marker.NewFeatureSet;
import jUnitGrouping.marker.RegressionSet;
import jUnitGrouping.marker.SanitySet;
import jUnitGrouping.testsets.TestPage1;
import jUnitGrouping.testsets.TestPage2;
import jUnitGrouping.testsets.TestPage3;
import jUnitGrouping.testsets.TestPage4;
import jUnitGrouping.testsets.TestPage5;

@RunWith(Categories.class)

@Categories.IncludeCategory({RegressionSet.class, SanitySet.class})
@Categories.ExcludeCategory({NewFeatureSet.class})

@Suite.SuiteClasses({ TestPage1.class, TestPage2.class, TestPage3.class, 
	TestPage3.class, TestPage4.class,TestPage5.class }) 


public class MasterRunner {

}

//https://examples.javacodegeeks.com/core-java/junit/junit-categories-example/
