package corleone.test;

import org.testng.annotations.Test;

import corleone.basic.Function_Study;


public class TestBasicFunction extends TestCase {
	
	/**
	 * test Class
	 */
	@Test
	public void processVMArguments() {
		System.out.println("\n********* test VM arguments *********");
		Function_Study studyFunction = new Function_Study();
		studyFunction.vmArguments();

	}
	
	/**
	 * test Class
	 */
	@Test
	public void processDateTimes() {
		
		System.out.println("\n********* test date & time *********");
		Function_Study studyFunction = new Function_Study();
		studyFunction.dateTimeStudy();

	}
	

}
