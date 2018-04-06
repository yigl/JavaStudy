package corleone.myJAXB;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * Class representing target.
 * 
 * @author Auto generated
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Target", propOrder = {
        "counter",
        "counters" })
public class Target {

    private static final String NAME = "name";

    protected List<Target.Counter> counter;
    protected List<Target.Counters> counters;

    @XmlAttribute(name = NAME)
    protected String name;

    /**
     * Enum representing counter names.
     * 
     * @author emikgor
     */
    public enum BspTrafficToolCounter {
        SENT,
        RECEIVED,
        SPENT,
        ERROR,
        TIMEOUT,
        DIFF,
        HELLO,
        HALT,
        ACCESS,
        ACTION,
        NOTRDY,
        SYNTAX,
        UNSPEC;

        @Override
        public String toString() {
            return name().toLowerCase();
        }

        /**
         * Create {@code BspTrafficToolCounter} instance based on string value
         * 
         * @param name String value of counter name
         * @return {@code BspTrafficToolCounter} instance
         */
        public static BspTrafficToolCounter fromString(String name) {
            BspTrafficToolCounter counter = null;
            for (BspTrafficToolCounter currentCounter : values()) {
                if (currentCounter.toString().equalsIgnoreCase(name)) {
                    counter = currentCounter;
                    break;
                }
            }

            if (counter == null) {
                throw new IllegalArgumentException(String.format("Unable to convert %s to BspTrafficToolCounter enum",
                        name));
            }

            return counter;
        }
    }

    /**
     * Enum representing comparison symbols.
     * 
     * @author emikgor
     */
    public enum Comparator {
        EQUALS("=="),
        NOT_EQUALS("!="),
        GREATER_THAN(">"),
        LESS_THAN("<"),
        GREATER_THAN_EQUAL(">="),
        LESS_THAN_EQUAL("<=");

        private String comparator;

        /**
         * Creates comparator with value
         * 
         * @param value Math sign
         */
        Comparator(String value) {
            this.comparator = value;
        }

        @Override
        public String toString() {
            return this.comparator;
        }
    }

    /**
     * Gets the value of the counter property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the counter property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getCounter().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Counter}
     * 
     * @return List of {@code BttTarget.BttCounter} instances
     */
    public List<Target.Counter> getCounter() {
        if (counter == null) {
            counter = new ArrayList<>();
        }
        return this.counter;
    }

    /**
     * Get a specific {@code BttTraget.BttCounter} instance.
     * 
     * @param name {@code BspTrafficToolCounter} to fetch
     * @return {@code BttTarget.BttCounter} instance
     * @throws IllegalArgumentException If there is no {@code BttTarget.BttCounter} instance with
     *         name attribute value of {@code name}
     */
    public Target.Counter getCounter(BspTrafficToolCounter name) {
        Target.Counter counterInstance = null;

        for (Target.Counter currentCounterInstance : getCounter()) {
            if (currentCounterInstance.getName().equals(name.toString())) {
                counterInstance = currentCounterInstance;
                break;
            }
        }

        if (counterInstance == null) {
            throw new IllegalArgumentException(String.format(
                    "There is no counter element with attribute name %s", name.toString()));
        }

        return counterInstance;
    }

    /**
     * Gets the value of the counters property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the counters property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getCounters().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Counters.Counter}
     * 
     * @return List of {@code BttTarget.BttCounters} instances
     */
    public List<Target.Counters> getCounters() {
        if (counters == null) {
            counters = new ArrayList<>();
        }
        return this.counters;
    }

    /**
     * Get a specific {@code BttTraget.BttCounters} instance.
     * 
     * @param name Value of name attribute to look for
     * @return {@code BttTarget.BttCounters} instance
     * @throws IllegalArgumentException If there is no {@code BttTarget.BttCounters} instance with
     *         name attribute value of {@code name}
     */
    public Target.Counters getCounters(String name) {
        Target.Counters countersInstance = null;

        for (Target.Counters currentCountersInstance : getCounters()) {
            if (currentCountersInstance.getName().equals(name)) {
                countersInstance = currentCountersInstance;
                break;
            }
        }

        if (countersInstance == null) {
            throw new IllegalArgumentException(String.format(
                    "There is no counters element with attribute name %s", name));
        }

        return countersInstance;
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

    /**
     * Interface for a bsp-traffic-tool counter.
     * 
     * @author emikgor
     */
    public interface ICounter {

        /**
         * Set the name attribute value.
         * 
         * @param name Attribute value
         */
        void setName(String name);

        /**
         * Get the name attribute value.
         * 
         * @return Attribute value
         */
        String getName();

        /**
         * If the element is required or not
         * 
         * @return {@code true} if {@code null} (not present) or if the value is true
         */
        boolean isRequired();

        /**
         * Get {@code Comparator}.
         * 
         * @return Value which is set
         */
        Comparator getComparator();

        /**
         * Set {@code Comparator}.
         * 
         * @param comparator Value to set
         */
        void setComparator(Comparator comparator);

        /**
         * Return the value as a {@code String}.
         * 
         * @return String representation of counter value
         */
        String getValueString();
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * @author Auto generated
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value" })
    public static class Counter implements ICounter {

        @XmlValue
        protected BigInteger value;

        @XmlAttribute(name = NAME)
        protected String name;

        @XmlAttribute(name = "comparator")
        protected Comparator comparator;

        @XmlAttribute(name = "required")
        protected Boolean required;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *         possible object is {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *        allowed object is {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *         possible object is {@link String }
         */
        @Override
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *        allowed object is {@link String }
         */
        @Override
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the comparator property
         * 
         * @return possible object is {@link Comparator}
         */
        @Override
        public Comparator getComparator() {
            return comparator;
        }

        /**
         * Sets the value of the comparator property
         * 
         * @param value allowed object is {@link Comparator}
         */
        @Override
        public void setComparator(Comparator value) {
            this.comparator = value;
        }

        /**
         * Check if element is required to exist
         * 
         * @return {@code true} if it is required
         */
        @Override
        public boolean isRequired() {
            return this.required == null || this.required;
        }

        /**
         * Set if the element is required to exist
         * 
         * @param required {@code true} if required
         */
        public void setRequired(Boolean required) {
            this.required = required;
        }

        @Override
        public String getValueString() {
            String valueString = null;

            if (this.value != null) {
                valueString = this.value.toString();
            }
            return valueString;
        }

        /**
         * Merge {@code b} current object.
         * 
         * @param b Partial base
         */
        public void merge(Counter b) {
            if (b.getComparator() != null) {
                this.setComparator(b.getComparator());
            }
            this.setRequired(b.isRequired());

            if (b.getValue() != null) {
                this.setValue(b.getValue());
            } else if (this.getValue() == null) {
                this.setValue(BigInteger.ZERO);
            }
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="counter" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" 
     *                 /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
            "counter" })
    public static class Counters {

        @XmlElement(required = true)
        protected List<Counters.Counter> counter;

        @XmlAttribute(name = NAME)
        protected String name;

        /**
         * Gets the value of the counter property.
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any
         * modification you make to the returned list will be present inside the JAXB object. This
         * is why there is not a <CODE>set</CODE> method for the counter property.
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         *    getCounter().add(newItem);
         * </pre>
         * <p>
         * Objects of the following type(s) are allowed in the list {@link Counters.Counter}
         * 
         * @return List of {@code BttCounters.BttCounter} instances
         */
        public List<Counters.Counter> getCounter() {
            if (counter == null) {
                counter = new ArrayList<>();
            }
            return this.counter;
        }

        /**
         * Get a specific {@code BttCounters.BttCounter} instance.
         * 
         * @param name {@code BspTrafficToolCounter} to fetch
         * @return {@code BttCounters.BttCounter} instance
         * @throws IllegalArgumentException If there is no {@code BttCounters.BttCounter} instance
         *         with name attribute value of {@code name}
         */
        public Counters.Counter getCounter(BspTrafficToolCounter name) {
            return getCounter(name.toString());
        }

        /**
         * Get a specific {@code BttCounters.BttCounter} instance.
         * 
         * @param name Counter name to fetch
         * @return {@code BttCounters.BttCounter} instance
         * @throws IllegalArgumentException If there is no {@code BttCounters.BttCounter} instance
         *         with name attribute value of {@code name}
         */
        protected Counters.Counter getCounter(String name) {
            Counters.Counter counterInstance = null;

            for (Counters.Counter currentCounterInstance : getCounter()) {
                if (currentCounterInstance.getName().equals(name)) {
                    counterInstance = currentCounterInstance;
                    break;
                }
            }

            if (counterInstance == null) {
                throw new IllegalArgumentException(String.format(
                        "There is no counter element with attribute name %s", name));
            }

            return counterInstance;
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

        /**
         * <p>
         * Java class for anonymous complex type.
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * @author Auto Generated
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value" })
        public static class Counter implements ICounter {

            @XmlValue
            protected Float value;

            @XmlAttribute(name = NAME)
            protected String name;

            @XmlAttribute(name = "comparator")
            protected Comparator comparator;

            @XmlAttribute(name = "required")
            protected Boolean required;

            /**
             * Gets the value of the value property.
             * 
             * @return {@code value}
             */
            public Float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value value to set for counter
             */
            public void setValue(Float value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *         possible object is {@link String }
             */
            @Override
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *        allowed object is {@link String }
             */
            @Override
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the comparator property.
             * 
             * @return possible object is {@link Comparator}
             */
            @Override
            public Comparator getComparator() {
                return comparator;
            }

            /**
             * Sets the value of the comparator property.
             * 
             * @param value allowed object is {@link Comparator}
             */
            @Override
            public void setComparator(Comparator value) {
                this.comparator = value;
            }

            /**
             * Check if element is required to exist
             * 
             * @return {@code true} if it is required
             */
            @Override
            public boolean isRequired() {
                return this.required == null || this.required;
            }

            /**
             * Set if the element is required to exist
             * 
             * @param required {@code true} if required
             */
            public void setRequired(Boolean required) {
                this.required = required;
            }

            @Override
            public String getValueString() {
                String valueString = null;
                if (this.value != null) {
                    valueString = Float.toString(this.value);
                }

                return valueString;
            }

            /**
             * Merge {@code b} current object.
             * 
             * @param b Partial base
             */
            public void merge(Counters.Counter b) {
                if (b.getComparator() != null) {
                    this.setComparator(b.getComparator());
                }
                this.setRequired(b.isRequired());

                if (b.getValue() != null) {
                    this.setValue(b.getValue());
                } else if (this.getValue() == null) {
                    this.setValue(0.0f);
                }
            }

        }

    }

    /**
     * Merge {@code b} current object.
     * 
     * @param b Partial base
     */
    public void merge(Target b) {
        final List<Counter> aCounterList = this.getCounter();
        for (Counter bCounter : b.getCounter()) {
            try {
                final Counter aCounter = this.getCounter(BspTrafficToolCounter.fromString(bCounter.getName()));
                aCounter.merge(bCounter);
            } catch (IllegalArgumentException e) {
                aCounterList.add(bCounter);
            }
        }
        final List<Counters> aCountersList = this.getCounters();
        for (Counters bCounters : b.getCounters()) {
            try {
                merge(bCounters);
            } catch (IllegalArgumentException e) {
                aCountersList.add(bCounters);
            }
        }
    }

    /**
     * Merge {@code bCounters} current object.
     * 
     * @param bCounters Partial base
     * @throws IllegalArgumentException If there is no {@code Counters} instance with
     *         name attribute value of {@code Counters.name}
     */
    private void merge(Counters bCounters) {
        final Counters aCounters = this.getCounters(bCounters.getName());
        final List<Counters.Counter> aCountersCounterList = aCounters.getCounter();
        for (Counters.Counter bCounter : bCounters.getCounter()) {
            try {
                final Counters.Counter aCounter = aCounters.getCounter(bCounter.getName());
                aCounter.merge(bCounter);
            } catch (IllegalArgumentException e) {
                aCountersCounterList.add(bCounter);
            }
        }
    }

}
