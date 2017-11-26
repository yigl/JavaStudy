package corleone.basic;

import java.io.IOException;

public class Function_study {

    /* 
     * The difference between program arguments and VM arguments:
     * 1. Program arguments are arguments that are passed to your application, which are accessible via the "args" String array parameter
     *  of your main method. 
     * 2. VM arguments are arguments such as System properties that are passed to the Java interpreter(ie,'java'), which is called before Java class
     * 3. The way to run in command line: 
     *    1) First cd to work directory: /home/eguolyi/Development/Java
     *    2) compile all java file into .class file (javac -d bin/ src/corleone/basic/*.java)
     *    3) The -d above means put the compile output is under ./bin/ (note: package name is corleone.basic)
     *    4) Note that the class files are actually generated  under /home/eguolyi/Development/Java/bin/corleone/basic because of package.
     *    5) Run: [Development/Java/bin]$ java -cp . -DsysProp1=sp1 -DsysProp2=sp2 corleone.basic.Test p1 p2 p3
     */
    public void argumentsTest(String[] args) {
        
        System.out.println("Program Arguments:");
        for (String arg : args) {
            System.out.println("\t" + arg);
        }

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

}
