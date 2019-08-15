package corleone.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections_Study {

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
	
	/**
     * 
     */
	public void traverseTreeMap() {

	    TreeMap<String, Integer> nameAge = new TreeMap<String, Integer>();
	    nameAge.put("Lars", 42);
	    nameAge.put("sara", 16);
	    nameAge.put("Tomas", 36);
	    nameAge.put("Martin", 27);
	    nameAge.put("Bo", 27);
	    nameAge.put("Hanna", 27);
	    nameAge.put("Jan", 27);
	    nameAge.put("Pelle", 27);
	    
	    Set set = nameAge.entrySet();
	    Iterator m = set.iterator();
	    int sumAge = 0;
	    while(m.hasNext()) {
	        Map.Entry me = (Map.Entry)m.next();
	        sumAge = sumAge + (Integer)me.getValue();
	    }
	    
	    System.out.println("\nThe name-value is:");
	    System.out.print(nameAge);
	    System.out.println("\nThe average age is:" + sumAge/nameAge.size());
	    System.out.print("Those people are old thant 25 are: ");
	    m = set.iterator();
	    while(m.hasNext()) {
	        Map.Entry me = (Map.Entry)m.next();
	        if ((Integer)me.getValue() > 25) 
                System.out.print(me.getKey() + ", ");
        }
	    System.out.println();
    }
 }
