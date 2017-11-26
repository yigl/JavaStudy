package corleone.basic;
import java.util.*;
import java.lang.*;

public class Test {

	public static void main(String[] args) {
   
	    Function_study myStudy = new Function_study();
	    myStudy.argumentsTest(args);
	    
		// TODO Auto-generated method stub
	    String router$view = "router$view";
	    Sub_class obj = new Sub_class();
	    obj.my_method();
	    System.out.println("variable router$view = " + router$view);

	    //About HashMap
	    //HashMap nameAge = new HashMap();
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
	    
	    Collection b = nameAge.values();
	    System.out.print("Value List:"+ b);
	    
    }
}
