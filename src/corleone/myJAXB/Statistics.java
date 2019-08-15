package corleone.myJAXB;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.*;

import corleone.myJAXB.Traffic.BspTrafficToolTraffic;

/**
 * <p>
 * Java class for Statistics complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="traffic" type="{}Traffic" maxOccurs="unbounded"/v
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Auto generated
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "statistics")
@XmlType(name = "Statistics", propOrder = {
        "traffic" })
public class Statistics {

    @XmlElement(required = true)
    protected List<Traffic> traffic;
/*	@XmlElement(required = true)
	protected String traffic;*/

    @XmlAttribute(required = false)
    protected String start;

    @XmlAttribute(required = false)
    protected String end;

    /**
     * Gets the value of the traffic property.
     * <p>
     * This access method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the traffic property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getTraffic().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Traffic}
     * 
     * @return List of {@code BttTraffic} instances
     */
    public List<Traffic> getTraffic() {
        if (traffic == null) {
            traffic = new ArrayList<>();
        }
        return this.traffic;
    }

    /**
     * Get a specific {@code BttTraffic} instance.
     * 
     * @param name {@code BspTrafficToolTraffic} to fetch
     * @return {@code BttTraffic} instance
     * @throws IllegalArgumentException If there is no {@code BttTraffic} instance with name
     *         attribute value of {@code name}
     */
    public Traffic getTraffic(BspTrafficToolTraffic name) {
        Traffic trafficInstance = null;
        for (Traffic currentTrafficInstance : getTraffic()) {
            if (currentTrafficInstance.getName().equals(name.toString())) {
                trafficInstance = currentTrafficInstance;
                break;
            }
        }

        if (trafficInstance == null) {
            throw new IllegalArgumentException(String.format(
                    "There is no traffic element with attribute name %s", name.toString()));
        }

        return trafficInstance;
    }

    /**
     * Parse date string to {@code Date} object. Wraps {@code ParseException} as
     * a run time {@code IllegalArgument} exception.
     * 
     * @param date Date string in format {@code yyyy-MM-dd HH:mm:ss}
     * @return Resulting {@code Date} object, or {@code null} if input was null
     * @throws IllegalArgumentException If {@code date} does not match the expected format
     */
    private static Date parseDate(String date) {
        Date result = null;

        if (date != null) {
            try {
                final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                result = dateFormat.parse(date);
            } catch (ParseException e) {
                throw new IllegalArgumentException(String.format("Unable to parse date string %s", date), e);
            }
        }

        return result;
    }

    /**
     * Get the attribute value start.
     * 
     * @return Attribute value as {@code Date} object
     * @throws IllegalArgumentException If the attribute value is not a valid date string.
     */
    public Date getStartDate() {
        return parseDate(this.start);
    }

    /**
     * Get the attribute value start.
     * 
     * @return Attribute value as {@code String}
     */
    public String getStart() {
        return this.start;
    }

    /**
     * Get the attribute value end.
     * 
     * @return Attribute value as {@code Date} object
     * @throws IllegalArgumentException If the attribute value is not a valid date string.
     */
    public Date getEndDate() {
        return parseDate(this.end);
    }

    /**
     * Get the attribute value end.
     * 
     * @return Attribute value as {@code String}
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * Merge {@code Statistics} instance {@code b} current object.
     * 
     * @param b Partial base
     */
    public void merge(Statistics b) {
        for (Traffic bTraffic : b.getTraffic()) {
            try {
                merge(bTraffic);
            } catch (IllegalArgumentException e) {
                this.getTraffic().add(bTraffic);
            }
        }
    }

    /**
     * Merge {@code Traffic} instance {@code bTraffic} current object.
     * 
     * @param bTraffic Partial base
     * @throws IllegalArgumentException If there is no {@code Traffic} instance
     *         with name of {@code BspTrafficToolTraffic}
     */
    private void merge(Traffic bTraffic) {
        final Traffic aTraffic = this.getTraffic(BspTrafficToolTraffic.fromString(bTraffic.getName()));
        final List<Target> aTargetList = aTraffic.getTarget();
        for (Target bTarget : bTraffic.getTarget()) {
            final Target aTarget = aTraffic.getTarget(bTarget.getName());
            try {
                aTarget.merge(bTarget);
            } catch (IllegalArgumentException e) {
                aTargetList.add(bTarget);
            }
        }
    }

    /**
     * Merge {@code Statistics} instance as {@code InputStream} into current object.
     * 
     * @param b Partial base
     */
    public void merge(InputStream b) {
        this.merge(JAXB.unmarshal(b, Statistics.class));
    }
}
