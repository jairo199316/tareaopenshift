
package co.edu.eam.ingesoft.pa2.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.eam.ingesoft.pa2.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaEstudiante_QNAME = new QName("http://www.eam.edu.co", "consultaEstudiante");
    private final static QName _ConsultarCursosEstudiante_QNAME = new QName("http://www.eam.edu.co", "consultarCursosEstudiante");
    private final static QName _ConsultaEstudianteResponse_QNAME = new QName("http://www.eam.edu.co", "consultaEstudianteResponse");
    private final static QName _ConsultarCursosEstudianteResponse_QNAME = new QName("http://www.eam.edu.co", "consultarCursosEstudianteResponse");
    private final static QName _Init_QNAME = new QName("http://www.eam.edu.co", "init");
    private final static QName _InitResponse_QNAME = new QName("http://www.eam.edu.co", "initResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.eam.ingesoft.pa2.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link ConsultarCursosEstudianteResponse }
     * 
     */
    public ConsultarCursosEstudianteResponse createConsultarCursosEstudianteResponse() {
        return new ConsultarCursosEstudianteResponse();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link ConsultaEstudiante }
     * 
     */
    public ConsultaEstudiante createConsultaEstudiante() {
        return new ConsultaEstudiante();
    }

    /**
     * Create an instance of {@link ConsultarCursosEstudiante }
     * 
     */
    public ConsultarCursosEstudiante createConsultarCursosEstudiante() {
        return new ConsultarCursosEstudiante();
    }

    /**
     * Create an instance of {@link ConsultaEstudianteResponse }
     * 
     */
    public ConsultaEstudianteResponse createConsultaEstudianteResponse() {
        return new ConsultaEstudianteResponse();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link Asignatura }
     * 
     */
    public Asignatura createAsignatura() {
        return new Asignatura();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Programa }
     * 
     */
    public Programa createPrograma() {
        return new Programa();
    }

    /**
     * Create an instance of {@link Docente }
     * 
     */
    public Docente createDocente() {
        return new Docente();
    }

    /**
     * Create an instance of {@link DetalleCursoEstudiante }
     * 
     */
    public DetalleCursoEstudiante createDetalleCursoEstudiante() {
        return new DetalleCursoEstudiante();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link Facultad }
     * 
     */
    public Facultad createFacultad() {
        return new Facultad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "consultaEstudiante")
    public JAXBElement<ConsultaEstudiante> createConsultaEstudiante(ConsultaEstudiante value) {
        return new JAXBElement<ConsultaEstudiante>(_ConsultaEstudiante_QNAME, ConsultaEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCursosEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "consultarCursosEstudiante")
    public JAXBElement<ConsultarCursosEstudiante> createConsultarCursosEstudiante(ConsultarCursosEstudiante value) {
        return new JAXBElement<ConsultarCursosEstudiante>(_ConsultarCursosEstudiante_QNAME, ConsultarCursosEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "consultaEstudianteResponse")
    public JAXBElement<ConsultaEstudianteResponse> createConsultaEstudianteResponse(ConsultaEstudianteResponse value) {
        return new JAXBElement<ConsultaEstudianteResponse>(_ConsultaEstudianteResponse_QNAME, ConsultaEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCursosEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "consultarCursosEstudianteResponse")
    public JAXBElement<ConsultarCursosEstudianteResponse> createConsultarCursosEstudianteResponse(ConsultarCursosEstudianteResponse value) {
        return new JAXBElement<ConsultarCursosEstudianteResponse>(_ConsultarCursosEstudianteResponse_QNAME, ConsultarCursosEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eam.edu.co", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

}
