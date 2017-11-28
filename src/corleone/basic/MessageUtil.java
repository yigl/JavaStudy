package corleone.basic;

/**.
 * MessageUtil
 */
public class MessageUtil {

    private String message;

	/**.
	 * TODO Auto-generated constructor stub
	 */
	public MessageUtil() {

	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            to be printed
	 */
	public MessageUtil(String message) {
		this.message = message;
	}

	/**
	 * prints the message
	 */
	public String printMessage() {
		System.out.println(message);
		return message;
	}

}
