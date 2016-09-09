
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEstudiante", propOrder = {
    "cod",
    "ced"
})
public class ConsultaEstudiante {

    protected String cod;
    protected String ced;

    /**
     * Obtiene el valor de la propiedad cod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCod() {
        return cod;
    }

    /**
     * Define el valor de la propiedad cod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCod(String value) {
        this.cod = value;
    }

    /**
     * Obtiene el valor de la propiedad ced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCed() {
        return ced;
    }

    /**
     * Define el valor de la propiedad ced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCed(String value) {
        this.ced = value;
    }

}
