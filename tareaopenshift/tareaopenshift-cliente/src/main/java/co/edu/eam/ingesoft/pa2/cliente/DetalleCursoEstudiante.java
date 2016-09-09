
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleCursoEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleCursoEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curso" type="{http://www.eam.edu.co}curso" minOccurs="0"/>
 *         &lt;element name="estudiante" type="{http://www.eam.edu.co}estudiante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleCursoEstudiante", propOrder = {
    "curso",
    "estudiante"
})
public class DetalleCursoEstudiante {

    protected Curso curso;
    protected Estudiante estudiante;

    /**
     * Obtiene el valor de la propiedad curso.
     * 
     * @return
     *     possible object is
     *     {@link Curso }
     *     
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Define el valor de la propiedad curso.
     * 
     * @param value
     *     allowed object is
     *     {@link Curso }
     *     
     */
    public void setCurso(Curso value) {
        this.curso = value;
    }

    /**
     * Obtiene el valor de la propiedad estudiante.
     * 
     * @return
     *     possible object is
     *     {@link Estudiante }
     *     
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Define el valor de la propiedad estudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link Estudiante }
     *     
     */
    public void setEstudiante(Estudiante value) {
        this.estudiante = value;
    }

}
