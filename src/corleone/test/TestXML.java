package corleone.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.annotations.Test;

import corleone.myJAXB.Statistics;

public class TestXML extends TestCase {
	
	/**
	 * JAXB unmarshalling example, convert a XML file content into a statistic object
	 */
	@Test
	public void unmarshalling() {
		try {

			File file = new File("/home/eguolyi/Development/Java-workspace/JavaStudy/xml/statistics.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Statistics.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Statistics statistic = (Statistics) jaxbUnmarshaller.unmarshal(file);
			System.out.println(statistic);

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	
	}
	
	/**
	 * JAXB unmarshalling example, convert a XML file content into a statistic object
	 */
	@Test
	public void marshalling() {
/*        Statistics customer = new Customer();
		  customer.setId(100);
		  customer.setName("mkyong");
		  customer.setAge(29);

		  try {

			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }*/
	}
}
