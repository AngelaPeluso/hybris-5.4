//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.23 at 07:13:05 PM CEST 
//


package de.hybris.platform.cuppy.ws.openligadb.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ArrayOfFussballdaten complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFussballdaten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fussballdaten" type="{http://msiggi.de/Sportsdata/Webservices}Fussballdaten" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFussballdaten", propOrder =
{ "fussballdaten" })
@SuppressWarnings("PMD")
public class ArrayOfFussballdaten
{

	@XmlElement(name = "Fussballdaten")
	protected List<Fussballdaten> fussballdaten;

	/**
	 * Gets the value of the fussballdaten property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the fussballdaten property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFussballdaten().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Fussballdaten }
	 * 
	 * 
	 */
	public List<Fussballdaten> getFussballdaten()
	{
		if (fussballdaten == null)
		{
			fussballdaten = new ArrayList<Fussballdaten>();
		}
		return this.fussballdaten;
	}

}
