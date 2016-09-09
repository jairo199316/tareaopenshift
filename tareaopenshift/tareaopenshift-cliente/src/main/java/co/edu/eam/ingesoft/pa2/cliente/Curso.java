
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para curso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="curso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asignatura" type="{http://www.eam.edu.co}asignatura" minOccurs="0"/>
 *         &lt;element name="docente" type="{http://www.eam.edu.co}docente" minOccurs="0"/>
 *         &lt;element name="grupo" type="{http://www.eam.edu.co}grupoEnum" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curso", propOrder = {
    "asignatura",
    "docente",
    "grupo",
    "id"
})
public class Curso {

    protected Asignatura asignatura;
    protected Docente docente;
    @XmlSchemaType(name = "string")
    protected GrupoEnum grupo;
    protected String id;

    /**
     * Obtiene el valor de la propiedad asignatura.
     * 
     * @return
     *     possible object is
     *     {@link Asignatura }
     *     
     */
    public Asignatura getAsignatura() {
        return asignatura;
    }

    /**
     * Define el valor de la propiedad asignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Asignatura }
     *     
     */
    public void setAsignatura(Asignatura value) {
        this.asignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad docente.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getDocente() {
        return docente;
    }

    /**
     * Define el valor de la propiedad docente.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setDocente(Docente value) {
        this.docente = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link GrupoEnum }
     *     
     */
    public GrupoEnum getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoEnum }
     *     
     */
    public void setGrupo(GrupoEnum value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
