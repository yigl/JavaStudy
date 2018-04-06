package corleone.basic;
import java.time.Period;
import java.util.*;

public class Test {
	
	/**
    *    The difference between program arguments and VM arguments:
    *    1. Program arguments are arguments that are passed to your application, which are accessible via the "args" String array parameter
    *  of your main method. 
    *    2. VM arguments are arguments such as System properties that are passed to the Java interpreter(ie,'java'), which is called before Java class
	*
	*    The way to run manually in command line: 
	*    1) First cd to work directory: /home/eguolyi/Development/Java
	*    2) compile all java file into .class file (javac -d bin/ src/corleone/basic/*.java -cp /home/eguolyi/.p2/pool/plugins/org.testng_6.13.1.r201712040515.jar)
	*    3) The -d above means put the compile output will be put under ./bin/
	*    4) Note that ./bin/corleone/basic directory for class files will be created automatically for package "corleone.basic".
	*    5) Run: [Development/Java-space/bin]$ java -DsysProp1=sp1 -DsysProp2=sp2 corleone.basic.Test p1 p2 p3
    */
	public static void main(String[] args) {
   
		System.out.println("test program arguments");
		System.out.println("---------------------------");
	    Function_Study myStudy = new Function_Study();
	    myStudy.commandLineArguments(args);
	       
	    // Arrays
	  /*  myStudy.arrayStudy();

	    Period p = Period.parse("P1Y");
	    System.out.println(p.getMonths());*/
	   
	    
	    
    }
}
