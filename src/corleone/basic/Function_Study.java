package corleone.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Function_Study {

    /* 
     * The difference between program arguments and VM arguments:
     * 1. Program arguments are arguments that are passed to your application, which are accessible via the "args" String array parameter
     *  of your main method. 
     * 2. VM arguments are arguments such as System properties that are passed to the Java interpreter(ie,'java'), which is called before Java class
     */
    public void vmArguments() {
        System.out.println("System Properties from VM Arguments");
        String sysProp1 = "sysProp1";
        System.out.println("\tName:" + sysProp1 + ", Value:" + System.getProperty(sysProp1));
        String sysProp2 = "sysProp2";
        System.out.println("\tName:" + sysProp2 + ", Value:" + System.getProperty(sysProp2));

    }

    public void commandLineArguments(String args[]) {
        //command-line arguments
        System.out.println("The command line arguments are:");
        for (String s : args) {
            System.out.print(s + "  ");
        }
        System.out.println("\n");

    }
    
    public void dateTimeStudy() {
    	System.out.println(LocalDate.now());
    	System.out.println(LocalTime.now());
    	System.out.println(LocalDateTime.now());
    	System.out.println(ZonedDateTime.now());
    }
    
    public void arrayStudy() {
    	//sorting Array and ArrayList
    	int[] a = new int[]{1,8,3,4,5,6,7,9};
 	    Arrays.sort(a);
 	    List<Integer> b = new ArrayList<>();
 	    b.add(23);
 	    b.add(10);
 	    b.add(5);
 	    Collections.sort(b);
 	        	
    	int[][] twoD = new int[][]{{1,2},{3,4},{5,6}};
    	System.out.println();
    	for (int[] inner : twoD) {
    		for (int num : inner)
    			System.out.print(num + " ");
    		System.out.println();
        }
    	
    	System.out.println();
    	int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
    	for (int i = 0; i < differentSize.length; i++) {
    		for (int j = 0; j < differentSize[i].length; j++)
    		    System.out.print(differentSize[i][j] + " "); 
    		    System.out.println();
    		}
        }	
}
