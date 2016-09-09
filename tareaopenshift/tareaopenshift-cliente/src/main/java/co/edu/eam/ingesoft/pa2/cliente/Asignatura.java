
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignatura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignatura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intensidadHoraria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programa" type="{http://www.eam.edu.co}programa" minOccurs="0"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.eam.edu.co}tipoAsignatura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignatura", propOrder = {
    "codigo",
    "color",
    "intensidadHoraria",
    "nombre",
    "programa",
    "semestre",
    "tipo"
})
public class Asignatura {

    protected String codigo;
    protected String color;
    protected int intensidadHoraria;
    protected String nombre;
    protected Programa programa;
    protected int semestre;
    @XmlSchemaType(name = "string")
    protected TipoAsignatura tipo;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad intensidadHoraria.
     * 
     */
    public int getIntensidadHoraria() {
        return intensidadHoraria;
    }

    /**
     * Define el valor de la propiedad intensidadHoraria.
     * 
     */
    public void setIntensidadHoraria(int value) {
        this.intensidadHoraria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
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
     * Obtiene el valor de la propiedad semestre.
     * 
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Define el valor de la propiedad semestre.
     * 
     */
    public void setSemestre(int value) {
        this.semestre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link TipoAsignatura }
     *     
     */
    public TipoAsignatura getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAsignatura }
     *     
     */
    public void setTipo(TipoAsignatura value) {
        this.tipo = value;
    }

}
