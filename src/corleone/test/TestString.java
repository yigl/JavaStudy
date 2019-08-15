package corleone.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import corleone.basic.String_study;

public class TestString extends TestCase {
	
	/**
	 * test StringBuilder
	 */
	@Test
	public void testStringBuiler() {
		// Test StringBuilder
	    StringBuilder strBuilder = new StringBuilder();
	    strBuilder.append("\n");
	    strBuilder.append("get\n");
	    strBuilder.append("<html the third line>\n");
	    strBuilder.append("<get>get</get>\n");
	    System.out.println("\nOriginal string=\n" + strBuilder.toString());
	    //String_study.tryToRemoveCommandEcho("get", strBuilder);
	    int indexOfGet= strBuilder.toString().indexOf("get\n");
	    if (  indexOfGet >= 0 ) {
	    	final String removeGetFromRawStatistics = strBuilder.toString().replaceFirst("get\n", "");
	    	//final String convertAngleBracket = removeGetFromRawStatistics.replaceAll("<", "&lt").replaceAll(">", "&gt");
	    	//System.out.println("\nString ater convert angle bracket:\n" + convertAngleBracket);
	    	
	    	System.out.println("\nString after removing \"get\"(index:" + indexOfGet + ")=\n" + removeGetFromRawStatistics);
	    	System.out.println("\nString after replace newline =\n" + removeGetFromRawStatistics.replaceFirst("\n",""));
	    	return;
	    }
	    System.out.println("indexOfGet=" + indexOfGet + "\nString after removing =\n" + strBuilder.toString());
	}
	

}
