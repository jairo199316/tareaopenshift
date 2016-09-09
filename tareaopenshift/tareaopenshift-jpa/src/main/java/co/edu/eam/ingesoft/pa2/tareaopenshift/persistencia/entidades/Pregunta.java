/**
 * 
 */
package co.edu.eam.ingesoft.pa2.tareaopenshift.persistencia.entidades;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * @author Alejandro
 *
 */
@Entity
@Table(name = "Preguntas")
@NamedQueries({ @NamedQuery(name = Pregunta.LISTA_PREGUNTAS, query = "select p from Pregunta p") })
public class Pregunta implements Serializable, Comparable<Pregunta> {

	public static final String LISTA_PREGUNTAS = "Pregunta.listar";

	@Id
	@Column(name = "idPregunta")
	private int idPregunta;

	@Column(name = "texto")
	private String texto;

	@Column(name = "valor")
	private double valor;

	// Constructor vacio
	public Pregunta() {
	}

	// Constructor
	public Pregunta(int idPregunta, String texto, double valor) {
		super();
		this.idPregunta = idPregunta;
		this.texto = texto;
		this.valor = valor;
	}

	// Accesores y modificadores
	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Pregunta o) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
