package corleone.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import corleone.basic.Function_Study;


public class TestBasicFunction extends TestCase {
	
	/**
	 * test Class
	 */
	@Test
	public void processVMArguments() {
		Function_Study studyFunction = new Function_Study();
		studyFunction.vmArguments();

	}
	
	/**
	 * test Class
	 */
	@Test
	public void processDateTimes() {
		
		Function_Study studyFunction = new Function_Study();
		studyFunction.dateTimeStudy();

	}
	

}
