
package co.edu.eam.ingesoft.pa2.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarCursosEstudianteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarCursosEstudianteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaCursos" type="{http://www.eam.edu.co}curso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarCursosEstudianteResponse", propOrder = {
    "listaCursos"
})
public class ConsultarCursosEstudianteResponse {

    protected List<Curso> listaCursos;

    /**
     * Gets the value of the listaCursos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCursos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCursos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Curso }
     * 
     * 
     */
    public List<Curso> getListaCursos() {
        if (listaCursos == null) {
            listaCursos = new ArrayList<Curso>();
        }
        return this.listaCursos;
    }

}
