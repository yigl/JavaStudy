package corleone.basic;

public class Super_class {
    int num = 20;
    static String data = "SuperClass static field";

    // display method of superclass
    public void display() {
       System.out.println("This is the display method of superclass");
    }
    
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    
    // static inner class 
    public static class StaticGreeting implements HelloWorld {
    	public void greet(){
    		greetSomeone(data);
    	}
    	public void greetSomeone(String someone) {
            System.out.println("Hello, " + someone);
        }
    }
    
    // non-static inner class 
    public class NonStaticGreeting implements HelloWorld {
    	public void greet(){
    		greetSomeone("world");
    	}
    	public void greetSomeone(String someone) {
            System.out.println("Hello, " + someone);
        }
    	public NonStaticGreeting() {
    		System.out.println("Constructor:Hello world");
    	}
    }
    
    // The class without access specifier(non-public class) can be accessed only within the package
    class EnglishGreeting implements HelloWorld {
        String name = "world";
        public void greet() {
            greetSomeone("world");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hello " + name);
        }
    }
  
    HelloWorld englishGreeting = new EnglishGreeting();
    
    // anonymouse class declaration
    HelloWorld frenchGreeting = new HelloWorld() {
        String name = "tout le monde";
        public void greet() {
            greetSomeone("tout le monde");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }
    };
    
    // anonymouse class declaration
    HelloWorld spanishGreeting = new HelloWorld() {
        String name = "mundo";
        public void greet() {
            greetSomeone("mundo");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hola, " + name);
        }
    };
  
    public void sayHello() {
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    
 }

