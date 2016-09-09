
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoAsignatura.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoAsignatura">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRACTICA"/>
 *     &lt;enumeration value="TEORICA"/>
 *     &lt;enumeration value="TEORICO_PRACTICA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoAsignatura")
@XmlEnum
public enum TipoAsignatura {

    PRACTICA,
    TEORICA,
    TEORICO_PRACTICA;

    public String value() {
        return name();
    }

    public static TipoAsignatura fromValue(String v) {
        return valueOf(v);
    }

}
