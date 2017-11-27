package corleone.basic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {

	 String message = "Hello World!";
	 MessageUtil messageUtil = new MessageUtil(message+'!');

	 @Test
	 public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
	      Assert.assertEquals(message,messageUtil.printMessage());
	 }

	 @Test
	 public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
				message = "Hi!" + message;
	      Assert.assertEquals(message,messageUtil.printMessage());
	 }

}
