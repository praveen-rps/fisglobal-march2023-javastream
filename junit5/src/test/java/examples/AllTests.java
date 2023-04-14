package examples;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ Testclass1.class, TestClass2.class })
public class AllTests {

}

