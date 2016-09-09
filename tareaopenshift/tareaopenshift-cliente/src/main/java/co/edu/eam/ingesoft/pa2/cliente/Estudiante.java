
package co.edu.eam.ingesoft.pa2.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estudiante">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eam.edu.co}persona">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cursos" type="{http://www.eam.edu.co}detalleCursoEstudiante" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="programa" type="{http://www.eam.edu.co}programa" minOccurs="0"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estudiante", propOrder = {
    "codigo",
    "cursos",
    "programa",
    "semestre"
})
public class Estudiante
    extends Persona
{

    protected String codigo;
    @XmlElement(nillable = true)
    protected List<DetalleCursoEstudiante> cursos;
    protected Programa programa;
    protected int semestre;

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
     * Gets the value of the cursos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cursos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCursos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleCursoEstudiante }
     * 
     * 
     */
    public List<DetalleCursoEstudiante> getCursos() {
        if (cursos == null) {
            cursos = new ArrayList<DetalleCursoEstudiante>();
        }
        return this.cursos;
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

}
