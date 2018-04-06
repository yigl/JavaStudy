package corleone.test;
import org.testng.annotations.*;

/**
 * Base class from which all study test class may extend
 * 
 * @author eguolyi
 *
 */
public class TestCase {
	
	/**
	 * Initialize the base test class
	 */
	@BeforeSuite(alwaysRun = true)
	public void initTestCase() {
		System.out.println("*************SuperTestCase: BeforeSuite***************");
	}

	/**
	 * Cleans up after test class
	 */
	@AfterSuite(alwaysRun = true)
	public void cleanTestCase() {
		System.out.println("*************SuperTestCase: AfterSuite***************");
		
	}
	
	/**
	 * Executed before every test case
	 */
	@BeforeMethod
	protected void setUp() {
		System.out.println("\n-----------SuperTestCase: BeforeMethod-----------");
	}
	
	/**
	 * Executed after every test case
	 */
	protected void tearDown() {
		
	}
}
