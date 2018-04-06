package corleone.myJAXB;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Traffic complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Traffic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="target" type="{}Target" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Auto generated
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traffic", propOrder = {
        "target" })
public class Traffic {

    @XmlElement(required = true)
    protected List<Target> target;

    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Enum representing traffic types.
     * 
     * @author emikgor
     */
    public enum BspTrafficToolTraffic {
        ARP,
        ICMP,
        SNMP,
        BGCI_TCP,
        BGCI_UDP,
        SNMP_NOTIFICATION("snmp-notification");

        private String name;

        /**
         * Default constructor.
         */
        private BspTrafficToolTraffic() {

        }

        /**
         * Create enum with special value.
         * 
         * @param name Special value
         */
        private BspTrafficToolTraffic(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            String value;
            if (this.name == null) {
                value = name().toLowerCase().replaceAll("_", "::");
            } else {
                value = this.name;
            }

            return value;
        }

        /**
         * Convert string value to enum value.
         * 
         * @param name Name of enum value
         * @return {@code BspTrafficToolTraffic} value
         */
        public static BspTrafficToolTraffic fromString(String name) {
            BspTrafficToolTraffic value = null;

            for (BspTrafficToolTraffic currentValue : values()) {
                if (currentValue.toString().equals(name)) {
                    value = currentValue;
                    break;
                }
            }

            if (value == null) {
                throw new IllegalArgumentException(String.format("Unable to convert %s to BspTrafficToolTraffic enum",
                        name));
            }

            return value;
        }
    }

    /**
     * Gets the value of the target property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the target property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Target}
     * 
     * @return List of {@code BttTarget} instances
     */
    public List<Target> getTarget() {
        if (target == null) {
            target = new ArrayList<>();
        }
        return this.target;
    }

    /**
     * Get a specific {@code BttTraget} instance.
     * 
     * @param name Value of name attribute to look for
     * @return {@code BttTarget} instance
     * @throws IllegalArgumentException If there is no {@code BttTarget} instance with name
     *         attribute value of {@code name}
     */
    public Target getTarget(String name) {
        Target targetInstance = null;

        for (Target currentTargetInstance : getTarget()) {
            if (currentTargetInstance.getName().equals(name)) {
                targetInstance = currentTargetInstance;
            }
        }

        if (targetInstance == null) {
            throw new IllegalArgumentException(String.format(
                    "There is no target element with attribute name %s", name));
        }

        return targetInstance;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *         possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *        allowed object is {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}