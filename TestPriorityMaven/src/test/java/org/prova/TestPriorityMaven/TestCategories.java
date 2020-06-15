package org.prova.TestPriorityMaven;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Categories.class)
@Categories.IncludeCategory(Priority.class)
@Suite.SuiteClasses( { OperationTest.class })
public class TestCategories {

}
