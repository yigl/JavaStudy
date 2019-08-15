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
	 * Initialize before test suite
	 */
	@BeforeSuite(alwaysRun = true)
	public void initTestCase() {
		//System.out.println("*************Base: BeforeSuite***************");
	}

	/**
	 * Cleans up after test suite
	 */
	@AfterSuite(alwaysRun = true)
	public void cleanTestCase() {
		//System.out.println("*************Base: AfterSuite***************");
		
	}
	
	/**
	 * Cleans up before test class
	 */
	@BeforeClass(alwaysRun = true)
	@Parameters({"paramBeforeClass"})
	public void beforeClass(@Optional("") String paramBeforeClass) {
		//System.out.println("\n\n      *******Base: test " + paramBeforeClass +"*********      ");
	}

	/**
	 * Cleans up after test class
	 */
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//System.out.println("      *******Base: AfterClass*********      ");
		
	}
	
	/**
	 * Executed before every test case
	 */
	@BeforeMethod
	@Parameters({"paramBeforeMethod"})
	protected void setUp(@Optional("") String paramBeforeMethod) {
		System.out.println("\n-----Method: test "+ paramBeforeMethod + " -----      ");
	}
	
	/**
	 * Executed after every test case
	 */
	@AfterMethod
	@Parameters({"paramBeforeMethod"})
	protected void tearDown(@Optional("") String paramBeforeMethod) {
		//System.out.println("\n      -----Base: test " +paramBeforeMethod + " finished -----      ");
	}
}
