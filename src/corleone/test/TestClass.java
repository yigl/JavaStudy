package corleone.test;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import corleone.basic.String_study;
import corleone.basic.Sub_class;
import corleone.basic.Super_class;

public class TestClass extends TestCase {
	
	
/*	@BeforeMethod
	public void setUp() {
		System.out.println("\n-----------Start test case-----------");		
	}*/
	
	/**
	 * test Class
	 */
	@Test
	public void testSuperClass() {
		// test Super class
	    System.out.println("");
	    String router$view = "router$view";
	    Sub_class obj = new Sub_class();
	    obj.my_method();
	    System.out.println("variable router$view = " + router$view);

	}
	
	/**
	 * test anonymous Class
	 */
	@Test
	public void testAnonymousClass() {
		Super_class myApp = new Super_class();
		myApp.sayHello();
	}
	
	/**
	 * test non-static inner class
	 * For non-static inner class, we do need a reference to an object of the enclosing outer class to 
	 * instantiate it; 
	 */
	@Test
	public void testNonStaticInnerClass() {
		Super_class myApp = new Super_class();
		Super_class.NonStaticGreeting greet1 = new Super_class().new NonStaticGreeting();
		Super_class.NonStaticGreeting greet2 = myApp.new NonStaticGreeting();
		greet1.greetSomeone("inner non-static class1");
		greet2.greetSomeone("inner non-static class2");
	}
	
	/**
	 * test static inner class
	 * 1.Java doesn't allow you to create top-level static classes; only nested (inner) static classes.
	 * 2. We don't need an instance of the outer class to create an object of a static inner class. 
	 * 3. Static inner classes can access static data members of the enclosing class(static field&method)
	 */
	@Test
	public void testStaticInnerClass() {
		// Compare the difference for the way how instantiate non-static class above.
		Super_class.StaticGreeting greet = new Super_class.StaticGreeting();
		greet.greet();
		

	}
}
