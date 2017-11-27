package corleone.basic;
import java.lang.*;
public class MessageUtil {

	private String message;
	
	public MessageUtil() {
		// TODO Auto-generated constructor stub
	}

    //Constructor
	//@param message to be printed
	public MessageUtil(String message){
	      this.message = message;
	}

	// prints the message
	public String printMessage(){
	    System.out.println(message);
	    return message;
	}

}
