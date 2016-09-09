
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoContratacionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoContratacionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEDIO_TIEMPO"/>
 *     &lt;enumeration value="TIEMPO_COMPLETO"/>
 *     &lt;enumeration value="CATEDRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoContratacionEnum")
@XmlEnum
public enum TipoContratacionEnum {

    MEDIO_TIEMPO,
    TIEMPO_COMPLETO,
    CATEDRA;

    public String value() {
        return name();
    }

    public static TipoContratacionEnum fromValue(String v) {
        return valueOf(v);
    }

}
