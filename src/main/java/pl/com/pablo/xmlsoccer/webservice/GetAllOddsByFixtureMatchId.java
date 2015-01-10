
package pl.com.pablo.xmlsoccer.webservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixtureMatch_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "fixtureMatchId"
})
@XmlRootElement(name = "GetAllOddsByFixtureMatchId")
public class GetAllOddsByFixtureMatchId {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    @XmlElement(name = "fixtureMatch_Id")
    protected int fixtureMatchId;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the fixtureMatchId property.
     * 
     */
    public int getFixtureMatchId() {
        return fixtureMatchId;
    }

    /**
     * Sets the value of the fixtureMatchId property.
     * 
     */
    public void setFixtureMatchId(int value) {
        this.fixtureMatchId = value;
    }

}