
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para docente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="docente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eam.edu.co}persona">
 *       &lt;sequence>
 *         &lt;element name="codigodocente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programa" type="{http://www.eam.edu.co}programa" minOccurs="0"/>
 *         &lt;element name="tipoContratacion" type="{http://www.eam.edu.co}tipoContratacionEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "docente", propOrder = {
    "codigodocente",
    "programa",
    "tipoContratacion"
})
public class Docente
    extends Persona
{

    protected String codigodocente;
    protected Programa programa;
    @XmlSchemaType(name = "string")
    protected TipoContratacionEnum tipoContratacion;

    /**
     * Obtiene el valor de la propiedad codigodocente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigodocente() {
        return codigodocente;
    }

    /**
     * Define el valor de la propiedad codigodocente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigodocente(String value) {
        this.codigodocente = value;
    }

    /**
     * Obtiene el valor de la propiedad programa.
     * 
     * @return
     *     possible object is
     *     {@link Programa }
     *     
     */
    public Programa getPrograma() {
        return programa;
    }

    /**
     * Define el valor de la propiedad programa.
     * 
     * @param value
     *     allowed object is
     *     {@link Programa }
     *     
     */
    public void setPrograma(Programa value) {
        this.programa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContratacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoContratacionEnum }
     *     
     */
    public TipoContratacionEnum getTipoContratacion() {
        return tipoContratacion;
    }

    /**
     * Define el valor de la propiedad tipoContratacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContratacionEnum }
     *     
     */
    public void setTipoContratacion(TipoContratacionEnum value) {
        this.tipoContratacion = value;
    }

}
